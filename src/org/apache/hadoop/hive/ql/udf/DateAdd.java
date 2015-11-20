package org.apache.hadoop.hive.ql.udf;

import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;

import org.apache.hadoop.hive.ql.exec.UDF;

public class DateAdd extends UDF {
	public Date evaluate(Date date, String dateType, int addNum)
			throws ParseException {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);

		if (dateType.toUpperCase().equals("Y")) {
			calendar.add(Calendar.YEAR, addNum);
		}

		if (dateType.toUpperCase().equals("M")) {
			calendar.add(Calendar.MONTH, addNum);
		}

		if (dateType.toUpperCase().equals("D")) {
			calendar.add(Calendar.DATE, addNum);
		}

		return calendar.getTime();
	}
}
