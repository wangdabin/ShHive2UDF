package org.apache.hadoop.hive.ql.udf;

import org.apache.hadoop.hive.ql.exec.UDF;
/*
 * 函数功能：固网收入分档
 * Oracle中创建者：徐杰
 * Hive自定义函数创建：张海东
 * 创建时间：2015-06-09
 * 对应原Oracle函数：DW.F_GW_INCOME_LEVEL
 * 传入参数：收入（V_FEE）
 * 返回参数：分档
 * */
public class FGwIncomeLevel extends UDF{ 
	public String evaluate(int v_fee) {
		if(v_fee <= 0)
			return "01";
	    else if(v_fee > 0 && v_fee <= 5)
			return "02";
		else if(v_fee > 5 && v_fee <= 10)
			return "03";
		else if(v_fee > 10 && v_fee <= 15)
			return "04";
		else if(v_fee > 15 && v_fee <= 20)
			return "05";
		else if(v_fee > 20 && v_fee <= 25)
			return "06";
		else if(v_fee > 25 && v_fee <= 30)
			return "07";
		else if(v_fee > 30 && v_fee <= 35)
			return "08";
		else if(v_fee > 35 && v_fee <= 40)
			return "09";
		else if(v_fee > 40 && v_fee <= 45)
			return "10";
		else if(v_fee > 45 && v_fee <= 50)
			return "11";
		else if(v_fee > 50 && v_fee <= 55)
			return "12";
		else if(v_fee > 55 && v_fee <= 60)
			return "13";
		else if(v_fee > 60 && v_fee <= 65)
			return "14";
		else if(v_fee > 65 && v_fee <= 70)
			return "15";
		else if(v_fee > 70 && v_fee <= 80)
			return "16";
		else if(v_fee > 80 && v_fee <= 90)
			return "17";
		else if(v_fee > 90 && v_fee <= 100)
			return "18";
		else if(v_fee > 100 && v_fee <= 120)
			return "19";
		else if(v_fee > 120 && v_fee <= 140)
			return "20";
		else if(v_fee > 140 && v_fee <= 160)
			return "21";
		return "22";
	}
}                                                                                                                                                                                                                                                   
