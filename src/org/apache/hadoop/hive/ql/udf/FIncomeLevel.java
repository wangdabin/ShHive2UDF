package org.apache.hadoop.hive.ql.udf;

import org.apache.hadoop.hive.ql.exec.UDF;
/*
 * 函数功能：出账收入分档
 * Oracle中创建者：hulei
 * Hive自定义函数创建：张海东
 * 创建时间：2015-06-09
 * 对应原Oracle函数：DW.F_INCOME_LEVEL
 * 传入参数：收入
 * 返回参数：分档
 * */
public class FIncomeLevel extends UDF{ 
	public String evaluate(int total) {
		
		if(total <= 0)
			return "01";
		else if(total > 0 && total <= 10)
			return "02";
		else if(total > 10 && total <= 20)
			return "03";
		else if(total > 20 && total <= 30)
			return "04";
		else if(total > 30 && total <= 40)
			return "05";
		else if(total > 40 && total <= 50)
			return "06";
		else if(total > 50 && total <= 60)
			return "07";
		else if(total > 60 && total <= 70)
			return "08";
		else if(total > 70 && total <= 80)
			return "09";
		else if(total > 80 && total <= 90)
			return "10";
		else if(total > 90 && total <= 100)
			return "11";
		else if(total > 100 && total <= 110)
			return "12";
		else if(total > 110 && total <= 120)
			return "13";
		else if(total > 120 && total <= 130)
			return "14";
		else if(total > 130 && total <= 140)
			return "15";
		else if(total > 140 && total <= 150)
			return "16";
		else if(total > 150 && total <= 200)
			return "17";
		else if(total > 200 && total <= 250)
			return "18";
		else if(total > 250 && total <= 300)
			return "19";
		else if(total > 300 && total <= 350)
			return "20";
		else if(total > 350 && total <= 400)
			return "21";
		else if(total > 400 && total <= 450)
			return "22";
		else if(total > 450 && total <= 500)
			return "23";
		else if(total > 500 && total <= 800)
			return "24";
		else if(total > 800 && total <= 1000)
			return "25";
		else if(total > 1000 && total <= 1500)
			return "26";
		else if(total > 1500 && total <= 2000)
			return "27";
		else if(total > 2000)
			return "28";
		return "01";
	}
}
