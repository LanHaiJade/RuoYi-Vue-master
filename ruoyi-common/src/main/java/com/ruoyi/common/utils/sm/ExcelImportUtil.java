package com.ruoyi.common.utils.sm;

import com.ruoyi.common.domain.BaseIccard;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.web.multipart.MultipartFile;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ExcelImportUtil {

    /**
     * 读取Excel文件（支持.xls和.xlsx）
     */
    public static List<BaseIccard> readExcel(MultipartFile file) throws Exception {
        List<BaseIccard> cardList = new ArrayList<>();

        try (InputStream inputStream = file.getInputStream()) {

            // 根据文件扩展名创建对应的Workbook
            Workbook workbook;
            String fileName = file.getOriginalFilename();

            if (fileName != null && fileName.toLowerCase().endsWith(".xls")) {
                // 旧版Excel格式 (.xls)
                workbook = new HSSFWorkbook(inputStream);
            } else if (fileName != null && fileName.toLowerCase().endsWith(".xlsx")) {
                // 新版Excel格式 (.xlsx)
                workbook = new XSSFWorkbook(inputStream);
            } else {
                throw new IllegalArgumentException("不支持的文件格式，仅支持.xls和.xlsx");
            }

            Sheet sheet = workbook.getSheetAt(0);

            // 从第2行开始读取（跳过表头）
            for (int i = 1; i <= sheet.getLastRowNum(); i++) {
                Row row = sheet.getRow(i);
                if (row == null) continue;

                BaseIccard card = new BaseIccard();

                // 读取各列数据
                card.setIdNo(getCellValueSafely(row.getCell(0)));      // 卡号
                card.setCpuNo(getCellValueSafely(row.getCell(1)));     // 卡名称
                card.setName(getCellValueSafely(row.getCell(2)));      // 姓名

                // 金额转换
                String amountStr = getCellValueSafely(row.getCell(3));
                try {
                    // 清除金额中的逗号（如1,000.00）
                    amountStr = amountStr.replace(",", "");
                    card.setBalance(new BigDecimal(amountStr));
                } catch (Exception e) {
                    card.setBalance(BigDecimal.ZERO);
                }

                card.setPhone(getCellValueSafely(row.getCell(4)));     // 手机号
                card.setRemark(getCellValueSafely(row.getCell(5)));    // 备注

                // 默认状态为正常
                card.setStatus(0L);

                cardList.add(card);
            }

            workbook.close();
        }

        return cardList;
    }

    /**
     * 安全获取单元格值（推荐使用这个）
     */
    private static String getCellValueSafely(Cell cell) {
        if (cell == null) return "";

        try {
            // 处理公式单元格
            if (cell.getCellType() == CellType.FORMULA) {
                Workbook workbook = cell.getSheet().getWorkbook();
                FormulaEvaluator evaluator = workbook.getCreationHelper().createFormulaEvaluator();
                try {
                    CellValue cellValue = evaluator.evaluate(cell);
                    if (cellValue != null) {
                        return getValueFromCellValue(cellValue);
                    }
                } catch (Exception e) {
                    // 公式计算失败，降级处理
                }
            }

            // 获取实际单元格类型
            CellType cellType = cell.getCellType();
            if (cellType == CellType.FORMULA) {
                // 如果还是公式类型，尝试获取缓存的公式结果类型
                try {
                    cellType = cell.getCachedFormulaResultType();
                } catch (Exception e) {
                    // 如果获取失败，降级为字符串
                    try {
                        return cell.getStringCellValue();
                    } catch (Exception ex) {
                        return cell.toString();
                    }
                }
            }

            // 根据类型处理
            switch (cellType) {
                case STRING:
                    return cell.getStringCellValue().trim();

                case NUMERIC:
                    // 检查是否是日期
                    if (org.apache.poi.ss.usermodel.DateUtil.isCellDateFormatted(cell)) {
                        return cell.getDateCellValue().toString();
                    } else {
                        // 避免科学计数法
                        double numValue = cell.getNumericCellValue();
                        // 处理整数和小数
                        if (Math.floor(numValue) == numValue) {
                            // 如果是整数，避免显示为科学计数法
                            return String.valueOf((long) numValue);
                        } else {
                            // 如果是小数
                            BigDecimal bigDecimal = BigDecimal.valueOf(numValue);
                            return bigDecimal.stripTrailingZeros().toPlainString();
                        }
                    }

                case BOOLEAN:
                    try {
                        return String.valueOf(cell.getBooleanCellValue());
                    } catch (Exception e) {
                        // 如果获取失败，尝试其他方式
                        String str = cell.toString();
                        if ("TRUE".equalsIgnoreCase(str) || "FALSE".equalsIgnoreCase(str)) {
                            return str;
                        }
                        return "";
                    }

                case BLANK:
                    return "";

                case ERROR:
                    return "#ERROR";

                default:
                    try {
                        return cell.toString();
                    } catch (Exception e) {
                        return "";
                    }
            }
        } catch (Exception e) {
            // 捕获所有异常，避免导入失败
            try {
                return cell.toString();
            } catch (Exception ex) {
                return "";
            }
        }
    }

    /**
     * 从CellValue中获取值
     */
    private static String getValueFromCellValue(CellValue cellValue) {
        if (cellValue == null) return "";

        switch (cellValue.getCellType()) {
            case STRING:
                return cellValue.getStringValue();

            case NUMERIC:
                double numValue = cellValue.getNumberValue();
                if (Math.floor(numValue) == numValue) {
                    return String.valueOf((long) numValue);
                } else {
                    return new BigDecimal(numValue).stripTrailingZeros().toPlainString();
                }

            case BOOLEAN:
                return String.valueOf(cellValue.getBooleanValue());

            case ERROR:
                return "#ERROR";

            default:
                return "";
        }
    }

    /**
     * 原始getCellValue方法（可能有问题，不建议使用）
     * 这里只是保留原样，实际代码应该使用getCellValueSafely
     */
    private static String getCellValue(Cell cell) {
        if (cell == null) return "";

        CellType cellType = cell.getCellType();

        switch (cellType) {
            case STRING:
                return cell.getStringCellValue().trim();

            case NUMERIC:
                // 检查是否是日期
                if (org.apache.poi.ss.usermodel.DateUtil.isCellDateFormatted(cell)) {
                    return cell.getDateCellValue().toString();
                } else {
                    // 避免科学计数法
                    double numValue = cell.getNumericCellValue();
                    if (Math.floor(numValue) == numValue) {
                        return String.valueOf((long) numValue);
                    } else {
                        BigDecimal bigDecimal = BigDecimal.valueOf(numValue);
                        return bigDecimal.stripTrailingZeros().toPlainString();
                    }
                }

            case BOOLEAN:
                return String.valueOf(cell.getBooleanCellValue());

            case FORMULA:
                try {
                    // 先尝试获取公式计算后的值
                    Workbook workbook = cell.getSheet().getWorkbook();
                    FormulaEvaluator evaluator = workbook.getCreationHelper().createFormulaEvaluator();
                    CellValue cellValue = evaluator.evaluate(cell);
                    if (cellValue != null) {
                        return getValueFromCellValue(cellValue);
                    } else {
                        return cell.getStringCellValue();
                    }
                } catch (Exception e) {
                    try {
                        return cell.getStringCellValue();
                    } catch (Exception ex) {
                        return String.valueOf(cell.getNumericCellValue());
                    }
                }

            default:
                return "";
        }
    }
}