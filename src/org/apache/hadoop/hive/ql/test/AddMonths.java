package org.apache.hadoop.hive.ql.test;

import java.util.Calendar;
import java.util.Date;

import org.apache.hadoop.hive.ql.exec.UDF;

public class AddMonths extends UDF{
	public Date evaluate(Date date,int amount) {
	        Calendar calendar=Calendar.getInstance();
	        calendar.setTime(date);
	        calendar.add(Calendar.MONTH, amount);
	        return calendar.getTime();
	}
}
