package org.apache.hadoop.hive.ql.udf;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.hadoop.hive.ql.exec.UDF;
import org.apache.hadoop.io.Text;

/*
 * 函数功能：获取两个时间相差多少个月
 * Hive自定义函数创建：平晓刚
 * 创建时间：2015-07-06
 * 传入参数1：传入参数为YYYY-MM-DD格式
 * 传入参数2：传入参数为YYYY-MM-DD格式
 * 返回参数：float类型数据
 * 注意：传入参数2一定要比传入参数1大
 * */

public class Months_Between extends UDF {
	public double evaluate(Date start, Date end) throws ParseException {

		double result = 0;

		Calendar cal_start = Calendar.getInstance();
		cal_start.setTime(start);

		Calendar cal_end = Calendar.getInstance();
		cal_end.setTime(end);

		result = cal_start.get(Calendar.MONTH) - cal_end.get(Calendar.MONTH)
				+ (cal_start.get(Calendar.YEAR) - cal_end.get(Calendar.YEAR))
				* 12+(double)(cal_start.getTime().getDate()-cal_end.getTime().getDate())/31;
		
		return result;
	}
}
