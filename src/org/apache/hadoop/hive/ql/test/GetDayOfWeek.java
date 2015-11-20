package org.apache.hadoop.hive.ql.test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.hadoop.hive.ql.exec.UDF;

public class GetDayOfWeek  extends UDF{
	
	public int evaluate(String inputValue) throws Exception {
		DateFormat fmt =new SimpleDateFormat("yyyy-MM-dd");            
        Date date = fmt.parse(inputValue);
        Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		
		int i =calendar.get(Calendar.DAY_OF_WEEK);
		
		int j=0;

		if(i==7){
			j=1;
		}
		if(i==1){
			j=2;
		}
		if(i==2){
			j=3;
		}
		if(i==3){
			j=4;
		}
		if(i==4){
			j=5;
		}
		if(i==5){
			j=6;
		}
		if(i==6){
			j=7;
		}
        return j; 
	}
}
