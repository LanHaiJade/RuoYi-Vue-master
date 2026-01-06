package com.ruoyi.common.utils.sm;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;


public class DateUtil {
	public static String START = " 00:00:00";
	public static String START2 = " 00:00";
	public static String END = " 23:59:59";
	public static String END2 = " 23:59";
	public static String TIME = ":00";

	public static String new_orderNo() {
		DateFormat dateFormat = new SimpleDateFormat("yyMMddHHmmssSSS");
		return "DD" + getSt() + dateFormat.format(new Date()) + RandomGUIDUtil.getLastNum();
	}
	
	public static String orderNoAL() {
		DateFormat dateFormat = new SimpleDateFormat("yyMMddHHmmssSSS");
		return "AL" + getSt() + dateFormat.format(new Date()) + RandomGUIDUtil.getLastNum();
	}
	
	public static String orderNo(String str) {
		DateFormat dateFormat = new SimpleDateFormat("yyMMddHHmmssSSS");
		return str + getSt() + dateFormat.format(new Date()) + RandomGUIDUtil.getLastNum();
	}
	
	public static String invoiceNo() {
		DateFormat dateFormat = new SimpleDateFormat("yyMMddHHmmssSSS");
		return getSt() + dateFormat.format(new Date()) + RandomGUIDUtil.randomString(3);
	}
	
	private static String getSt() {
		String str = "20";
		return str;
	}
	
	public static String orderNoZA(String str) {
		DateFormat dateFormat = new SimpleDateFormat("yyMMddHHmmssSSS");
		return str + dateFormat.format(new Date()) + RandomGUIDUtil.getLastNum();
	}

	public static String new_orderNo(Date date) {
		DateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmssSSS");
		return "DD" + dateFormat.format(date) + RandomGUIDUtil.getLastNum();
	}

	public static String new_orderNo1() {
		DateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
		return dateFormat.format(new Date());
	}

	public static String new_orderNo(String orderNo, String SSS) {
		return "DD" + orderNo + SSS + RandomGUIDUtil.getLastNum();
	}

	public static String date(Date date) {
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		return dateFormat.format(date);
	}

	public static String date2(Date date) {
		DateFormat dateFormat = new SimpleDateFormat("yyyy年MM月dd日");
		return dateFormat.format(date);
	}

	public static String date3(Date date) {
		DateFormat dateFormat = new SimpleDateFormat("HH时mm分ss秒");
		return dateFormat.format(date);
	}

	public static String date4(Date date) {
		DateFormat dateFormat = new SimpleDateFormat("MM-dd");
		return dateFormat.format(date);
	}

	public static String date5(Date date) {
		DateFormat dateFormat = new SimpleDateFormat("MM-dd HH:mm");
		return dateFormat.format(date);
	}

	public static String time(Date date) {
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return dateFormat.format(date);
	}

	public static String time2(Date date) {
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm");
		return date != null ? dateFormat.format(date) : "";
	}

	public static String time3(Date date) {
		DateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
		return dateFormat.format(date);
	}

	public static String time4(Date date) {
		DateFormat dateFormat = new SimpleDateFormat("yyMMddHHmmss");
		return dateFormat.format(date);
	}

	public static String time5(Date date) {
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		return dateFormat.format(date);
	}
	/**
	 * rfc3339带时区格式
	 * @param date
	 * @return
	 */
	public static String time6(Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX");
        sdf.setTimeZone(TimeZone.getDefault());
        return sdf.format(date);
	}
	public static Date parsetime6(String time) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX");
        sdf.setTimeZone(TimeZone.getDefault());
        return sdf.parse(time);
	}

	public static String fileno() {
		DateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmssSSS");
		return dateFormat.format(new Date());
	}

	public static String timelog() {
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
		return dateFormat.format(new Date());
	}

	public static Date parsetime(String timeStr) throws ParseException {
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return dateFormat.parse(timeStr);
	}

	public static Date parsetime1(String datestr) throws ParseException {
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd-HH:mm:ss");
		return dateFormat.parse(datestr);
	}

	public static Date parsetime3(String timeStr) throws ParseException {
		DateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
		return dateFormat.parse(timeStr);
	}
	
	public static Date parsetime4(String timeStr) throws ParseException {
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		return dateFormat.parse(timeStr);
	}

	public static Date parsetime_start(String timeStr) throws ParseException {
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return dateFormat.parse(timeStr + START);
	}

	public static Date parsetime_end(String timeStr) throws ParseException {
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return dateFormat.parse(timeStr + END);
	}
	
	public static Date parsetime_start2(String timeStr) throws ParseException {
		DateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
		return dateFormat.parse(timeStr + "000000");
	}

	public static Date parsetime_end2(String timeStr) throws ParseException {
		DateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
		return dateFormat.parse(timeStr + "235959");
	}

	public static Date parsetime_start3(String timeStr) throws ParseException {
		DateFormat dateFormat = new SimpleDateFormat("yyMMddHHmmss");
		return dateFormat.parse(timeStr + "000000");
	}

	public static Date parsetime_end3(String timeStr) throws ParseException {
		DateFormat dateFormat = new SimpleDateFormat("yyMMddHHmmss");
		return dateFormat.parse(timeStr + "235959");
	}


	public static Date parsetime_hour(String timeStr) throws ParseException {
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return dateFormat.parse(timeStr + TIME);
	}

	public static String wx_time(String timeStr) throws ParseException {
		DateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
		return time(dateFormat.parse(timeStr));
	}

	public static String date2str(Date time) {
		return time != null ? String.valueOf(time.getTime()) : "";
	}

	public static Date str2date(String timeStr) {
		if (StringUtil.notNull(timeStr)) {
			Date date = new Date();
			date.setTime(Long.valueOf(timeStr).longValue());
			return date;
		}
		return null;
	}

	public static String subdays(Date pDate, Date nDate) {
		long p = pDate.getTime();
		long n = nDate.getTime();
		String sub = String.valueOf((n - p) / 1000L / 60L / 60L / 24L);

		return sub.length() == 1 ? "0" + sub : sub;
	}

	public static String subhours(Date pDate, Date nDate) {
		long p = pDate.getTime();
		long n = nDate.getTime();
		String sub = String.valueOf((n - p) / 1000L / 60L / 60L % 24L);

		return sub.length() == 1 ? "0" + sub : sub;
	}

	public static String subminutes(Date pDate, Date nDate) {
		long p = pDate.getTime();
		long n = nDate.getTime();
		String sub = String.valueOf((n - p) / 1000L / 60L % 60L);

		return sub.length() == 1 ? "0" + sub : sub;
	}

	public static String startTime(Date date) {
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd" + START);
		return dateFormat.format(date);
	}

	public static String endTime(Date date) {
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd" + END);
		return dateFormat.format(date);
	}

	public static String startPayTime(Date payTime) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(payTime);
		calendar.add(12, -30);

		return time(calendar.getTime());
	}

	public static String endPayTime(Date payTime) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(payTime);
		calendar.add(12, 30);

		return time(calendar.getTime());
	}

	public static String startPayTime2(Date updateTime) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(updateTime);
		calendar.add(12, -2);

		return time(calendar.getTime());
	}

	public static String endPayTime2(Date updateTime) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(updateTime);
		calendar.add(12, 1);

		return time(calendar.getTime());
	}

	public static String startMonth(Date time) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(time);
		calendar.add(6, -30);

		return startTime(calendar.getTime());
	}

	public static String startWeek(Date time) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(time);
		calendar.add(6, -7);
		return startTime(calendar.getTime());
	}

	public static Date subTime(Date time, int sub) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(time);
		calendar.add(6, sub);
		return calendar.getTime();
	}
	
	/**
	 * 加减小时
	 * @param time
	 * @param sub
	 * @return
	 */
	public static Date subHour(Date time, int sub) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(time);
		calendar.add(Calendar.HOUR_OF_DAY, sub);
		return calendar.getTime();
	}

	public static String add1s(String timeStr) {
		Calendar calendar = Calendar.getInstance();
		try {
			calendar.setTime(parsetime3(timeStr));
			calendar.add(13, 1);

			return time3(calendar.getTime());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return time3(new Date());
	}

	public static String expireTime(Date time) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(time);
		calendar.add(12, 30);

		return time3(calendar.getTime());
	}

	public static Date onlineTime(Date updateTime) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(updateTime);
		calendar.add(12, -30);

		return calendar.getTime();
	}
	public static Date onlineTime5(Date updateTime) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(updateTime);
		calendar.add(12, -5);

		return calendar.getTime();
	}

	public static Date month_one() {
		Calendar calendar = Calendar.getInstance();
		calendar.set(5, 1);
		calendar.set(11, 0);
		calendar.set(12, 0);
		calendar.set(13, 0);
		return calendar.getTime();
	}

	public static String datesub(String time) {
		return time.substring(0, time.indexOf(" "));
	}

	public static String timesub(String time) {
		return time.substring(0, time.lastIndexOf(":"));
	}

	public static String parsetime2(String timeStr) {
		return timeStr + TIME;
	}

	public static boolean afterDate(String timeStr) {
		boolean afterDate = true;
		try {
			Date time = parsetime(timeStr);

			afterDate = time.after(new Date());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return afterDate;
	}

	public static String return_time(String shijian) {
		int year = Integer.valueOf(shijian.substring(0, 2), 16).intValue();
		int month = Integer.valueOf(shijian.substring(2, 4), 16).intValue();
		int day = Integer.valueOf(shijian.substring(4, 6), 16).intValue();
		int hour = Integer.valueOf(shijian.substring(6, 8), 16).intValue();
		int minute = Integer.valueOf(shijian.substring(8, 10), 16).intValue();
		int second = Integer.valueOf(shijian.substring(10, 12), 16).intValue();

		System.out.println(year);
		System.out.println(month);
		System.out.println(day);
		System.out.println(hour);
		System.out.println(minute);
		System.out.println(second);

		return shijian;
	}

	/**
	 * 获取昨天当前时间
	 * 
	 * @param date
	 * @return
	 */
	public static Date getYesterday(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DATE, -1);
		return calendar.getTime();
	}
	
	/**
	 * 获取加减月份时间
	 * @param date
	 * @param num
	 * @return
	 */
	public static Date subMonth(Date date ,int num) {
		Calendar calendar = Calendar.getInstance();  
		calendar.setTime(date);  
		calendar.add(Calendar.MONTH, num);
        return calendar.getTime();
	}
	/**
	 * 获取加减分钟时间
	 * @param date
	 * @param num
	 * @return
	 */
	public static Date subMinute(Date date ,int num) {
		Calendar calendar = Calendar.getInstance();  
		calendar.setTime(date);  
		calendar.add(Calendar.MINUTE, num);
        return calendar.getTime();
	}
	
	/**
	 *       根据类型（年月日）增加时间
	 * @param date   被增加的时间
	 * @param dateType  类型   年：Calendar.YEAR，月：Calendar.MONTH，日：Calendar.DAY
	 * @param num  增加的时间
	 * @return
	 */
	public static Date addDate(Date date,int dateType,int num) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date); 
        // 根据类型增加时间
        calendar.add(dateType,num);
        // 获取修改后的日期时间
        Date newDate = calendar.getTime();
        return newDate;
	}

	public static void main(String[] args) {
		System.out.println(time(subMonth(new Date(),1)));
	}
}