package org.apache.hadoop.hive.ql.udf;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.hadoop.hive.ql.exec.UDF;
/*
 * 函数功能：将日期转换成字符串
 * Hive自定义函数创建：平晓刚
 * 创建时间：2015-07-16
 * 传入参数1：日期内容
 * 传入参数2：与参数1对应的字符串格式
 * 返回参数：字符串
 * */
public class DateToChar extends UDF {
	public String evaluate(Date str, String format) throws ParseException {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(str);
		SimpleDateFormat sdfs = new SimpleDateFormat(format.toString());
		String output = sdfs.format(calendar.getTime());
		return output;
	}
}
