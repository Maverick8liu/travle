package com.hg.hgc.core.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 日期操作工作类
 * @author lyj
 *
 * @since 2016年4月19日下午6:05:03
 */
public class DateUtil {
	
	/**
	 * 字符串转换格式方法
	 * @param str		需转换的字符串
	 * @param pattern	字符串的日期格式
	 * @return
	 * @throws ParseException
	 */
	public static Date stringConvertDate(String str,String pattern) throws ParseException{
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		return sdf.parse(str);
	}

	/**
	 * 日期转换字符串
	 * @param date		需转换的日期
	 * @param pattern	日期格式
	 * @return
	 * @throws ParseException
	 */
	public static String dateConvertString(Date date,String pattern) throws ParseException{
		
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		
		return sdf.format(date);
	}
	
	/**
	 * 日期相加减的处理
	 * @param date		处理的日期
	 * @param field		操作的类型可选天，周，月，年，Calendar中的常量值
	 * @param amount	加减的数
	 * @return
	 */
	public static Date datePlusConvertString(Date date,int field,int amount){
		Calendar cal = Calendar.getInstance();
		
		cal.setTime(date);
		
		cal.add(Calendar.MONTH, 1);
		
		return cal.getTime();
	}
}
