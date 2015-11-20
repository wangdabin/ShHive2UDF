package org.apache.hadoop.hive.ql.udf;

import org.apache.hadoop.hive.ql.exec.UDF;
/*
 * 函数功能：固网积分分档
 * Oracle中创建者：CY
 * Hive自定义函数创建：张海东
 * 创建时间：2015-06-09
 * 对应原Oracle函数：DW.F_GW_JF_LEVEL
 * 传入参数：积分（JF_SCORE）
 * 返回参数：分档
 * */
public class FGwJfLevel extends UDF{ 
	
	public String evaluate(int jf_score) {
		
		if(jf_score >= 0 && jf_score < 1000)
			return "01";
		else if(jf_score >= 1000 && jf_score < 2000)
			return "02";
		else if(jf_score >= 2000 && jf_score < 3000)
			return "03";
		else if(jf_score >= 3000 && jf_score < 4000)
			return "04";
		else if(jf_score >= 4000 && jf_score < 5000)
			return "05";
		else if(jf_score >= 5000 && jf_score < 6000)
			return "06";
		else if(jf_score >= 6000 && jf_score < 7000)
			return "07";
		else if(jf_score >= 7000 && jf_score < 8000)
			return "08";
		else if(jf_score >= 8000 && jf_score < 9000)
			return "09";
		else if(jf_score >= 9000 && jf_score < 10000)
			return "10";
		else if(jf_score >= 10000 && jf_score < 11000)
			return "11";
		else if(jf_score >= 11000 && jf_score < 12000)
			return "12";
		else if(jf_score >= 12000 && jf_score < 13000)
			return "13";
		else if(jf_score >= 13000 && jf_score < 14000)
			return "14";
		else if(jf_score >= 14000 && jf_score < 15000)
			return "15";
		else if(jf_score >= 15000 && jf_score < 16000)
			return "16";
		else if(jf_score >= 16000 && jf_score < 17000)
			return "17";
		else if(jf_score >= 17000 && jf_score < 18000)
			return "18";
		else if(jf_score >= 18000 && jf_score < 19000)
			return "19";
		else if(jf_score >= 19000 && jf_score < 20000)
			return "20";
		else if(jf_score >= 20000 && jf_score < 30000)
			return "21";
		else if(jf_score >= 30000 && jf_score < 40000)
			return "22";
		else if(jf_score >= 40000 && jf_score < 50000)
			return "23";
		else if(jf_score >= 50000 && jf_score < 60000)
			return "24";
		else if(jf_score >= 60000 && jf_score < 70000)
			return "25";
		else if(jf_score >= 70000 && jf_score < 80000)
			return "26";
		else if(jf_score >= 80000 && jf_score < 90000)
			return "27";
		else if(jf_score >= 90000 && jf_score < 100000)
			return "28";
		else if(jf_score >= 100000)
			return "29";
		return "01";
	}
}

