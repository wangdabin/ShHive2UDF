package org.apache.hadoop.hive.ql.udf;

import org.apache.hadoop.hive.ql.exec.UDF;

/*
 * 函数功能：积分数分档
 * Oracle中创建者：HULEI
 * Hive自定义函数创建：平晓刚
 * 创建时间：2015-06-08
 * 对应原Oracle函数：DW.F_INTEGRAL_NUMBER
 * 传入参数：积分
 * 返回参数：分档
 * */
public class FIntegralNumber extends UDF {
	public String evaluate(double INTEGRAL_NUMBER) {

		String return_valu = null;

		if (INTEGRAL_NUMBER >= 0 && INTEGRAL_NUMBER < 1000) {
			return_valu = "01";
		}else if(INTEGRAL_NUMBER >= 1000 && INTEGRAL_NUMBER < 2000){
			return_valu = "02";
		}else if(INTEGRAL_NUMBER >= 2000 && INTEGRAL_NUMBER < 3000){
			return_valu = "03";
		}else if(INTEGRAL_NUMBER >= 3000 && INTEGRAL_NUMBER < 4000){
			return_valu = "04";
		}else if(INTEGRAL_NUMBER >= 4000 && INTEGRAL_NUMBER < 5000){
			return_valu = "05";
		}else if(INTEGRAL_NUMBER >= 5000 && INTEGRAL_NUMBER < 6000){
			return_valu = "06";
		}else if(INTEGRAL_NUMBER >= 6000 && INTEGRAL_NUMBER < 7000){
			return_valu = "07";
		}else if(INTEGRAL_NUMBER >= 7000 && INTEGRAL_NUMBER < 8000){
			return_valu = "08";
		}else if(INTEGRAL_NUMBER >= 8000 && INTEGRAL_NUMBER < 9000){
			return_valu = "09";
		}else if(INTEGRAL_NUMBER >= 9000 && INTEGRAL_NUMBER < 10000){
			return_valu = "10";
		}else if(INTEGRAL_NUMBER >= 10000 && INTEGRAL_NUMBER < 11000){
			return_valu = "11";
		}else if(INTEGRAL_NUMBER >= 11000 && INTEGRAL_NUMBER < 12000){
			return_valu = "12";
		}else if(INTEGRAL_NUMBER >= 12000 && INTEGRAL_NUMBER < 13000){
			return_valu = "13";
		}else if(INTEGRAL_NUMBER >= 13000 && INTEGRAL_NUMBER < 14000){
			return_valu = "14";
		}else if(INTEGRAL_NUMBER >= 14000 && INTEGRAL_NUMBER < 15000){
			return_valu = "15";
		}else if(INTEGRAL_NUMBER >= 15000 && INTEGRAL_NUMBER < 16000){
			return_valu = "16";
		}else if(INTEGRAL_NUMBER >= 16000 && INTEGRAL_NUMBER < 17000){
			return_valu = "17";
		}else if(INTEGRAL_NUMBER >= 17000 && INTEGRAL_NUMBER < 18000){
			return_valu = "18";
		}else if(INTEGRAL_NUMBER >= 18000 && INTEGRAL_NUMBER < 19000){
			return_valu = "19";
		}else if(INTEGRAL_NUMBER >= 19000 && INTEGRAL_NUMBER < 20000){
			return_valu = "20";
		}else if(INTEGRAL_NUMBER >= 20000 && INTEGRAL_NUMBER < 30000){
			return_valu = "21";
		}else if(INTEGRAL_NUMBER >= 30000 && INTEGRAL_NUMBER < 40000){
			return_valu = "22";
		}else if(INTEGRAL_NUMBER >= 40000 && INTEGRAL_NUMBER < 50000){
			return_valu = "23";
		}else if(INTEGRAL_NUMBER >= 50000 && INTEGRAL_NUMBER < 60000){
			return_valu = "24";
		}else if(INTEGRAL_NUMBER >= 60000 && INTEGRAL_NUMBER < 70000){
			return_valu = "25";
		}else if(INTEGRAL_NUMBER >= 70000 && INTEGRAL_NUMBER < 80000){
			return_valu = "26";
		}else if(INTEGRAL_NUMBER >= 80000 && INTEGRAL_NUMBER < 90000){
			return_valu = "27";
		}else if(INTEGRAL_NUMBER >= 90000 && INTEGRAL_NUMBER < 100000){
			return_valu = "28";
		}else if(INTEGRAL_NUMBER >= 100000){
			return_valu = "29";
		}else{
			return_valu = "01";
		}

		return return_valu;
	}
}
