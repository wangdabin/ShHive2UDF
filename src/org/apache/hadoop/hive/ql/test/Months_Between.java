package org.apache.hadoop.hive.ql.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.hadoop.hive.ql.exec.UDF;
import org.apache.hadoop.io.Text;

public class Months_Between extends UDF {
	public Text evaluate(Date start, Date end) throws ParseException {
		Date start_m = lastDayOfMonth(start);
		long l = 0;
		l = start_m.getTime() - start.getTime();
		long day = l / (24 * 60 * 60 * 1000);
		float months = 0;
		System.out.println(day);
		months = day / (float)getDays(start);
		l = end.getTime() - getFirstDay(end.getMonth()).getTime();
		day = l / (24 * 60 * 60 * 1000);
		months = months + day / (float)getDays(end)
				+ (end.getMonth() - start.getMonth() + 1)
				+ (end.getYear() - start.getYear());
		return new Text(String.valueOf(months));
	}

	// 计算一个月的最后一天
	public Date lastDayOfMonth(Date date) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.set(Calendar.DAY_OF_MONTH, 1);
		cal.roll(Calendar.DAY_OF_MONTH, -1);
		return cal.getTime();
	}

	// 计算一个月的天数
	public int getDays(Date date) {
		Calendar rightNow = Calendar.getInstance();
		rightNow.setTime(date);
		int days = rightNow.getActualMaximum(Calendar.DAY_OF_MONTH);
		return days;
	}

	// 计算一个月的第一天
	public Date getFirstDay(int month) throws ParseException {
		Calendar c = Calendar.getInstance();
		int year = c.get(Calendar.YEAR);
		String str = year + "-" + month + "-1";
		Date d = null;
		d = new SimpleDateFormat("yyyy-MM-dd").parse(str);
		return d;
	}
}
