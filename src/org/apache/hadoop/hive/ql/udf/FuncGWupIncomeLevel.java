package org.apache.hadoop.hive.ql.udf;

import org.apache.hadoop.hive.ql.exec.UDF;

/*
 * 函数功能：固网月报上报收入分档
 * Oracle中创建者：孟令利
 * Hive自定义函数创建：平晓刚
 * 创建时间：2015-06-08
 * 对应原Oracle函数：DW.FUNC_GW_UP_INCOME_LEVEL
 * 传入参数1：固网收入
 * 返回参数：收入分档
 * */
public class FuncGWupIncomeLevel extends UDF {
	public String evaluate(double charge_fee) {
		String output = null;

		if (charge_fee <= 0) {
			output = "01";
		} else if (charge_fee > 0 && charge_fee <= 5) {
			output = "02";
		} else if (charge_fee > 5 && charge_fee <= 10) {
			output = "03";
		} else if (charge_fee > 10 && charge_fee <= 15) {
			output = "04";
		} else if (charge_fee > 15 && charge_fee <= 20) {
			output = "05";
		} else if (charge_fee > 20 && charge_fee <= 25) {
			output = "06";
		} else if (charge_fee > 25 && charge_fee <= 30) {
			output = "07";
		} else if (charge_fee > 30 && charge_fee <= 35) {
			output = "08";
		} else if (charge_fee > 35 && charge_fee <= 40) {
			output = "09";
		} else if (charge_fee > 40 && charge_fee <= 45) {
			output = "10";
		} else if (charge_fee > 45 && charge_fee <= 50) {
			output = "11";
		} else if (charge_fee > 50 && charge_fee <= 55) {
			output = "12";
		} else if (charge_fee > 55 && charge_fee <= 60) {
			output = "13";
		} else if (charge_fee > 60 && charge_fee <= 65) {
			output = "14";
		} else if (charge_fee > 65 && charge_fee <= 70) {
			output = "15";
		} else if (charge_fee > 70 && charge_fee <= 75) {
			output = "16";
		} else if (charge_fee > 75 && charge_fee <= 80) {
			output = "17";
		} else if (charge_fee > 80 && charge_fee <= 85) {
			output = "18";
		} else if (charge_fee > 85 && charge_fee <= 90) {
			output = "19";
		} else if (charge_fee > 90 && charge_fee <= 95) {
			output = "20";
		} else if (charge_fee > 95 && charge_fee <= 100) {
			output = "21";
		} else if (charge_fee > 100 && charge_fee <= 105) {
			output = "22";
		} else if (charge_fee > 105 && charge_fee <= 110) {
			output = "23";
		} else if (charge_fee > 110 && charge_fee <= 115) {
			output = "24";
		} else if (charge_fee > 115 && charge_fee <= 120) {
			output = "25";
		} else if (charge_fee > 120 && charge_fee <= 125) {
			output = "26";
		} else if (charge_fee > 125 && charge_fee <= 130) {
			output = "27";
		} else if (charge_fee > 130 && charge_fee <= 135) {
			output = "28";
		} else if (charge_fee > 135 && charge_fee <= 140) {
			output = "29";
		} else if (charge_fee > 140 && charge_fee <= 145) {
			output = "30";
		} else if (charge_fee > 145 && charge_fee <= 150) {
			output = "31";
		} else if (charge_fee > 150 && charge_fee <= 155) {
			output = "32";
		} else if (charge_fee > 155 && charge_fee <= 160) {
			output = "33";
		} else if (charge_fee > 160 && charge_fee <= 165) {
			output = "34";
		} else if (charge_fee > 165 && charge_fee <= 170) {
			output = "35";
		} else if (charge_fee > 170 && charge_fee <= 175) {
			output = "36";
		} else if (charge_fee > 175 && charge_fee <= 180) {
			output = "37";
		} else if (charge_fee > 180) {
			output = "38";
		} else {
			output = "00";
		}

		return output;
	}
}
