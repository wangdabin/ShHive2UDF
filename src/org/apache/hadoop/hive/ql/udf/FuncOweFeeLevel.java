package org.apache.hadoop.hive.ql.udf;

import org.apache.hadoop.hive.ql.exec.UDF;

/*
 * 函数功能：欠费分档函数
 * Oracle中创建者：平晓刚
 * Hive自定义函数创建：平晓刚
 * 创建时间：2015-06-08
 * 对应原Oracle函数：DW.FUNC_OWE_FEE_LEVEL
 * 传入参数1：欠费
 * 返回参数：欠费分档
 * */
public class FuncOweFeeLevel extends UDF {
	public String evaluate(double income_fee) {
		String output = null;

		if (income_fee <= 50) {
			output = "1";
		} else if (income_fee > 50 && income_fee <= 100) {
			output = "2";
		} else if (income_fee > 100 && income_fee <= 150) {
			output = "3";
		} else if (income_fee > 150 && income_fee <= 300) {
			output = "4";
		} else if (income_fee > 300 && income_fee <= 500) {
			output = "5";
		} else if (income_fee > 500 && income_fee <= 1000) {
			output = "6";
		} else if (income_fee > 1000) {
			output = "7";
		}

		return output;
	}
}
