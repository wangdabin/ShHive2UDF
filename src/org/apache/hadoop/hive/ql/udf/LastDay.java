package org.apache.hadoop.hive.ql.udf;

import java.util.Calendar;
import java.util.Date;

import org.apache.hadoop.hive.ql.exec.UDF;
/*
 * 函数功能：获取传入时间所在月最后一天的日期
 * Hive自定义函数创建：平晓刚
 * 创建时间：2015-07-06
 * 传入参数：传入参数为YYYY-MM-DD格式
 * 返回参数：返回参数为YYYY-MM-DD格式
 * */
public class LastDay extends UDF{
	public Date evaluate(Date date) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.set(Calendar.DAY_OF_MONTH, 1);
		cal.roll(Calendar.DAY_OF_MONTH, -1);
		return cal.getTime();
	}
}
