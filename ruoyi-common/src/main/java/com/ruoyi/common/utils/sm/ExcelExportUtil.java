package com.ruoyi.common.utils.sm;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.util.CellRangeAddress;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ExcelExportUtil {

    /**
     * 生成IC卡导入模板Excel文件
     * 表格结构：卡号、卡名称、姓名、金额、手机号、备注、使用说明（红色）
     */
    public static byte[] generateIccardImportTemplate() throws IOException {
        // 创建Workbook和Sheet
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("IC卡导入模板");

        // 第1行：表头（7列）
        Row headerRow = sheet.createRow(0);

        // 前6列正常表头
        String[] blackHeaders = {
                "卡号（必填）",
                "卡名称（必填）",
                "姓名（必填）",
                "金额（必填）",
                "手机号",
                "备注"
        };

        for (int i = 0; i < blackHeaders.length; i++) {
            headerRow.createCell(i).setCellValue(blackHeaders[i]);
        }

        // 第7列：使用说明（红色字体）
        Cell usageCell = headerRow.createCell(6);
        usageCell.setCellValue("使用说明：单次导入最大1000个卡；必填项必须填写；金额外其它列数据保持文本格式。");

        // 创建红色字体样式
        Font redFont = workbook.createFont();
        redFont.setColor(IndexedColors.RED.getIndex());
        CellStyle redStyle = workbook.createCellStyle();
        redStyle.setFont(redFont);
        usageCell.setCellStyle(redStyle);

        // 因为使用说明文本很长，需要合并单元格来显示完整
        // 合并第7列到第15列（索引6到14），共9列
        sheet.addMergedRegion(new CellRangeAddress(0, 0, 6, 14));

        // 第2行：示例数据1
        Row dataRow1 = sheet.createRow(1);
        dataRow1.createCell(0).setCellValue("1234567890123456789");
        dataRow1.createCell(1).setCellValue("1区1号");
        dataRow1.createCell(2).setCellValue("张三");
        dataRow1.createCell(3).setCellValue("1.11");
        dataRow1.createCell(4).setCellValue("15111111111");
        dataRow1.createCell(5).setCellValue("消费卡");

        // 第3行：示例数据2
        Row dataRow2 = sheet.createRow(2);
        dataRow2.createCell(0).setCellValue("1234567890123456789");
        dataRow2.createCell(1).setCellValue("1区2号");
        dataRow2.createCell(2).setCellValue("张三");
        dataRow2.createCell(3).setCellValue("2.11");

        // 设置列宽
        sheet.setColumnWidth(0, 25 * 256); // 卡号
        sheet.setColumnWidth(1, 15 * 256); // 卡名称
        sheet.setColumnWidth(2, 10 * 256); // 姓名
        sheet.setColumnWidth(3, 12 * 256); // 金额
        sheet.setColumnWidth(4, 15 * 256); // 手机号
        sheet.setColumnWidth(5, 15 * 256); // 备注

        // 使用说明合并的列设置宽度
        for (int i = 6; i <= 14; i++) {
            sheet.setColumnWidth(i, 25 * 256);
        }

        // 写入字节数组
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        workbook.write(outputStream);
        workbook.close();

        return outputStream.toByteArray();
    }
}