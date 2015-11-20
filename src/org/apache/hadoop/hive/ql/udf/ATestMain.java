package org.apache.hadoop.hive.ql.udf;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.hadoop.hive.ql.udf.UDFRegExpReplace;
import org.apache.hadoop.io.Text;




public class ATestMain {

	/**
	 * @param args
	 * @throws ParseException 
	 */
	public static void main(String[] args) throws ParseException  {
		// TODO Auto-generated method stub
		
		SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd");

		Calendar cal1=Calendar.getInstance();
		//cal1.set(cal1.YEAR,2016);
	   // cal1.set(cal1.MONTH,4);
		cal1.set(2017,7,10,0,0,0);
		Date date1=cal1.getTime();
		
		Calendar cal2=Calendar.getInstance();
	     
		cal2.set(2015,6,11,0,0,0);
	     Date date2=cal2.getTime();
	     
		
		Months_Between mb = new Months_Between();
		
		System.out.println(mb.evaluate(date1,date2));
		
		LastDay ld = new LastDay();/*
		System.out.println(df.format(ld.evaluate(date1)));
		System.out.println(df.format(ld.evaluate(date2)));*/
		
/*		System.out.println(df.format(date1));
		
		System.out.println(df.format(mb.evaluate(date1,date2)));*/
	}

}
