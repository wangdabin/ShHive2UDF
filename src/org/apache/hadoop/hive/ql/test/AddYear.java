package org.apache.hadoop.hive.ql.test;

import java.util.Calendar;
import java.util.Date;

import org.apache.hadoop.hive.ql.exec.UDF;

public class AddYear extends UDF{
	public Date evaluate(Date date,int amount) {
		Calendar calendar=Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.YEAR, amount);
        return calendar.getTime(); 
	}
}
