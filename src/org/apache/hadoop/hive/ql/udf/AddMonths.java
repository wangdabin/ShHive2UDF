package org.apache.hadoop.hive.ql.udf;

import java.util.Calendar;
import java.util.Date;

import org.apache.hadoop.hive.ql.exec.UDF;
/*
 * 函数功能：获取传入时间增加几个月后的日期
 * Hive自定义函数创建：平晓刚
 * 创建时间：2015-07-06
 * 传入参数1：传入参数为YYYY-MM-DD格式
 * 传入参数2：增加月份
 * 返回参数：返回参数为YYYY-MM-DD格式
 * */
public class AddMonths extends UDF{
	public Date evaluate(Date date,int amount) {
	        Calendar calendar=Calendar.getInstance();
	        calendar.setTime(date);
	        calendar.add(Calendar.MONTH, amount);
	        return calendar.getTime();
	}
}
