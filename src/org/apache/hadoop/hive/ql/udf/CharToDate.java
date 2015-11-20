package org.apache.hadoop.hive.ql.udf;

import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.hadoop.hive.ql.exec.UDF;
public class CharToDate extends UDF {

	public Date evaluate(String date, String format) throws ParseException {

		SimpleDateFormat sdfs = new SimpleDateFormat(format.toString());
		Date date_in = sdfs.parse(date.toString());
		return date_in;

	}
}
