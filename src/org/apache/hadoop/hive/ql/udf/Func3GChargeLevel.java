package org.apache.hadoop.hive.ql.udf;

import org.apache.hadoop.hive.ql.exec.UDF;

/*
 * 函数功能：3G收入分档函数
 * Oracle中创建者：陈军
 * Hive自定义函数创建：平晓刚
 * 创建时间：2015-06-08
 * 对应原Oracle函数：DW.FUNC_3G_CHARGE_LEVEL
 * 传入参数1：3G收入
 * 返回参数：收入分档
 * */
public class Func3GChargeLevel extends UDF {
	public String evaluate(double charge_fee) {
		String output = null;

		if (charge_fee <= 0) {
			output = "01";
		} else if (charge_fee > 0 && charge_fee <= 10) {
			output = "02";
		} else if (charge_fee > 10 && charge_fee <= 20) {
			output = "03";
		} else if (charge_fee > 20 && charge_fee <= 30) {
			output = "04";
		} else if (charge_fee > 30 && charge_fee <= 40) {
			output = "05";
		} else if (charge_fee > 40 && charge_fee <= 50) {
			output = "06";
		} else if (charge_fee > 50 && charge_fee <= 60) {
			output = "07";
		} else if (charge_fee > 60 && charge_fee <= 70) {
			output = "08";
		} else if (charge_fee > 70 && charge_fee <= 80) {
			output = "09";
		} else if (charge_fee > 80 && charge_fee <= 90) {
			output = "10";
		} else if (charge_fee > 90 && charge_fee <= 100) {
			output = "11";
		} else if (charge_fee > 100 && charge_fee <= 110) {
			output = "12";
		} else if (charge_fee > 110 && charge_fee <= 120) {
			output = "13";
		} else if (charge_fee > 120 && charge_fee <= 130) {
			output = "14";
		} else if (charge_fee > 130 && charge_fee <= 140) {
			output = "15";
		} else if (charge_fee > 140 && charge_fee <= 150) {
			output = "16";
		} else if (charge_fee > 150 && charge_fee <= 200) {
			output = "17";
		} else if (charge_fee > 200 && charge_fee <= 250) {
			output = "18";
		} else if (charge_fee > 250 && charge_fee <= 300) {
			output = "19";
		} else if (charge_fee > 300 && charge_fee <= 350) {
			output = "20";
		} else if (charge_fee > 350 && charge_fee <= 400) {
			output = "21";
		} else if (charge_fee > 400 && charge_fee <= 450) {
			output = "22";
		} else if (charge_fee > 450 && charge_fee <= 500) {
			output = "23";
		} else if (charge_fee > 500 && charge_fee <= 800) {
			output = "24";
		} else if (charge_fee > 800 && charge_fee <= 1000) {
			output = "25";
		} else if (charge_fee > 1000 && charge_fee <= 1500) {
			output = "26";
		} else if (charge_fee > 1500 && charge_fee <= 2000) {
			output = "27";
		} else if (charge_fee > 2000) {
			output = "28";
		}

		return output;
	}
}
