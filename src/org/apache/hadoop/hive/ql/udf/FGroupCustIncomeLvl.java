package org.apache.hadoop.hive.ql.udf;

import org.apache.hadoop.hive.ql.exec.UDF;
/*
 * 函数功能：集团业务收入分档
 * Oracle中创建者：jiaoxiulian
 * Hive自定义函数创建：张海东
 * 创建时间：2015-06-09
 * 对应原Oracle函数：DW. F_GROUP_CUST_INCOME_LVL
 * 传入参数：业务收入
 * 返回参数：分档
 * */
public class FGroupCustIncomeLvl extends UDF{ 
	
	public String evaluate(int total_fee) {
		
		if(total_fee == 0)
			return "00";
		else if(total_fee > 0 && total_fee <= 500)
			return "01";
		else if(total_fee > 500 && total_fee <= 1000)
			return "02";
		else if(total_fee > 1000 && total_fee <= 2000)
			return "03";
		else if(total_fee > 2000 && total_fee <= 3000)
			return "04";
		else if(total_fee > 3000 && total_fee <= 5000)
			return "05";
		else if(total_fee > 5000 && total_fee <= 10000)
			return "06";
		else if(total_fee > 10000 && total_fee <= 20000)
			return "07";
		else if(total_fee > 20000 && total_fee <= 30000)
			return "08";
		else if(total_fee > 30000 && total_fee <= 40000)
			return "09";
		else if(total_fee > 40000 && total_fee <= 50000)
			return "10";
		else if(total_fee > 50000 && total_fee <= 60000)
			return "11";
		else if(total_fee > 60000 && total_fee <= 80000)
			return "12";
		else if(total_fee > 80000)
			return "13";
		return "00";

	}
}
