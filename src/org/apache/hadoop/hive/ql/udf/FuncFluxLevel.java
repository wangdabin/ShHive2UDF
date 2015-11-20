package org.apache.hadoop.hive.ql.udf;

import org.apache.hadoop.hive.ql.exec.UDF;

/*
 * 函数功能：流量分档（指标上报）
 * Oracle中创建者：赵鹏
 * Hive自定义函数创建：平晓刚
 * 创建时间：2015-06-08
 * 对应原Oracle函数：DW.FUNC_GW_UP_INCOME_LEVEL
 * 传入参数1：流量
 * 返回参数：流量分档
 * */

public class FuncFluxLevel extends UDF {
	public String evaluate(double flux) {
		String output = null;

		if (flux <= 0) {
			output = "00";
		} else if (flux > 0 && flux <= 5) {
			output = "01";
		} else if (flux > 5 && flux <= 10) {
			output = "02";
		} else if (flux > 10 && flux <= 15) {
			output = "03";
		} else if (flux > 15 && flux <= 20) {
			output = "04";
		} else if (flux > 20 && flux <= 25) {
			output = "05";
		} else if (flux > 25 && flux <= 30) {
			output = "06";
		} else if (flux > 30 && flux <= 40) {
			output = "07";
		} else if (flux > 40 && flux <= 50) {
			output = "08";
		} else if (flux > 50 && flux <= 60) {
			output = "09";
		} else if (flux > 60 && flux <= 70) {
			output = "10";
		} else if (flux > 70 && flux <= 80) {
			output = "11";
		} else if (flux > 80 && flux <= 90) {
			output = "12";
		} else if (flux > 90 && flux <= 100) {
			output = "13";
		} else if (flux > 100 && flux <= 120) {
			output = "14";
		} else if (flux > 120 && flux <= 140) {
			output = "15";
		} else if (flux > 140 && flux <= 160) {
			output = "16";
		} else if (flux > 160 && flux <= 200) {
			output = "17";
		} else if (flux > 200 && flux <= 300) {
			output = "18";
		} else if (flux > 300 && flux <= 500) {
			output = "19";
		} else if (flux > 500 && flux <= 1000) {
			output = "20";
		} else {
			output = "FF";
		}

		return output;
	}
}
