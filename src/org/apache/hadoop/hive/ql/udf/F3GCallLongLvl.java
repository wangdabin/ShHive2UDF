package org.apache.hadoop.hive.ql.udf;

import org.apache.hadoop.hive.ql.exec.UDF;
/*
 * 函数功能：通话时长分档
 * Oracle中创建者：jiaoxiulian
 * Hive自定义函数创建：张海东
 * 创建时间：2015-06-09
 * 对应原Oracle函数：DW. F_3G_CALL_LONG_LVL
 * 传入参数：时长（CALL_TIME）
 * 返回参数：分档
 * */
public class F3GCallLongLvl extends UDF{ 
	
	public String evaluate(int call_time) {
		if(call_time > 0 && call_time <= 1)
			return "01";
	    else if(call_time > 1 && call_time <= 2)
			return "02";
		else if(call_time > 2 && call_time <= 3)
			return "03";
		else if(call_time > 3 && call_time <= 4)
			return "04";
		else if(call_time > 4 && call_time <= 5)
			return "05";
		else if(call_time > 5 && call_time <= 10)
			return "06";
		else if(call_time > 10 && call_time <= 20)
			return "07";
		else if(call_time > 20 && call_time <= 30)
			return "08";
		else if(call_time > 30 && call_time <= 40)
			return "09";
		else if(call_time > 40 && call_time <= 50)
			return "10";
		else if(call_time > 50 && call_time <= 100)
			return "11";
		else if(call_time > 100 && call_time <= 200)
			return "12";
		else if(call_time > 200 && call_time <= 250)
			return "13";
		else if(call_time > 250 && call_time <= 300)
			return "14";
		else if(call_time > 300 && call_time <= 350)
			return "15";
		else if(call_time > 350 && call_time <= 400)
			return "16";
		else if(call_time > 400 && call_time <= 500)
			return "17";
		else if(call_time > 500 && call_time <= 1000)
			return "18";
		else if(call_time > 1000)
			return "19";
		return "01";
	}
}
