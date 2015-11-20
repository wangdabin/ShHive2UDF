package org.apache.hadoop.hive.ql.udf;

import org.apache.hadoop.hive.ql.exec.UDF;

/*
 * 函数功能：收入分档函数
 * Oracle中创建者：赵鹏
 * Hive自定义函数创建：平晓刚
 * 创建时间：2015-06-08
 * 对应原Oracle函数：DW.FUNC_CHARGE_LEVEL
 * 传入参数1：收入
 * 返回参数：收入分档
 * */
public class FuncChargeLevel extends UDF {
	public String evaluate(double charge_fee) {
		String output = null;

		if (charge_fee <= 0) {
			output = "00";
		} else if (charge_fee > 0 && charge_fee <= 10) {
			output = "01";
		} else if (charge_fee > 10 && charge_fee <= 20) {
			output = "02";
		} else if (charge_fee > 20 && charge_fee <= 30) {
			output = "03";
		} else if (charge_fee > 30 && charge_fee <= 40) {
			output = "04";
		} else if (charge_fee > 40 && charge_fee <= 50) {
			output = "05";
		} else if (charge_fee > 50 && charge_fee <= 60) {
			output = "06";
		} else if (charge_fee > 60 && charge_fee <= 70) {
			output = "07";
		} else if (charge_fee > 70 && charge_fee <= 80) {
			output = "08";
		} else if (charge_fee > 80 && charge_fee <= 90) {
			output = "09";
		} else if (charge_fee > 90 && charge_fee <= 100) {
			output = "10";
		} else if (charge_fee > 100 && charge_fee <= 110) {
			output = "11";
		} else if (charge_fee > 110 && charge_fee <= 120) {
			output = "12";
		} else if (charge_fee > 120 && charge_fee <= 130) {
			output = "13";
		} else if (charge_fee > 130 && charge_fee <= 140) {
			output = "14";
		} else if (charge_fee > 140 && charge_fee <= 150) {
			output = "15";
		} else if (charge_fee > 150 && charge_fee <= 160) {
			output = "16";
		} else if (charge_fee > 160 && charge_fee <= 170) {
			output = "17";
		} else if (charge_fee > 170 && charge_fee <= 180) {
			output = "18";
		} else if (charge_fee > 180 && charge_fee <= 190) {
			output = "19";
		} else if (charge_fee > 190 && charge_fee <= 200) {
			output = "20";
		} else if (charge_fee > 200 && charge_fee <= 250) {
			output = "25";
		} else if (charge_fee > 250 && charge_fee <= 300) {
			output = "30";
		} else if (charge_fee > 300 && charge_fee <= 350) {
			output = "35";
		} else if (charge_fee > 350 && charge_fee <= 400) {
			output = "40";
		} else if (charge_fee > 400 && charge_fee <= 450) {
			output = "45";
		} else if (charge_fee > 450 && charge_fee <= 500) {
			output = "50";
		} else if (charge_fee > 500 && charge_fee <= 800) {
			output = "80";
		} else if (charge_fee > 800 && charge_fee <= 1000) {
			output = "A0";
		} else if (charge_fee > 1000 && charge_fee <= 1500) {
			output = "A2";
		} else if (charge_fee > 1500 && charge_fee <= 2000) {
			output = "A3";
		} else if (charge_fee > 2000) {
			output = "AF";
		} else {
			output = "FF";
		}

		return output;
	}
}