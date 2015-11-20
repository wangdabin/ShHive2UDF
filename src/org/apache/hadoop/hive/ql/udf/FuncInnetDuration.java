package org.apache.hadoop.hive.ql.udf;

import org.apache.hadoop.hive.ql.exec.UDF;

/*
 * 函数功能：在网时长分档函数
 * Oracle中创建者：孟令利
 * Hive自定义函数创建：平晓刚
 * 创建时间：2015-06-08
 * 对应原Oracle函数：DW.FUNC_INNET_DURATION
 * 传入参数1：在网时长
 * 返回参数：在网时长分档
 * */

public class FuncInnetDuration extends UDF {
	public String evaluate(int innet_duration) {
		String output = null;

		if (String.valueOf(innet_duration).equals("")) {
			output = "00";
		} else if (innet_duration == 0 | innet_duration == 1) {
			output = "01";
		} else if (innet_duration == 2) {
			output = "02";
		} else if (innet_duration == 3) {
			output = "03";
		} else if (innet_duration == 4) {
			output = "04";
		} else if (innet_duration == 5) {
			output = "05";
		} else if (innet_duration == 6) {
			output = "06";
		} else if (innet_duration == 7) {
			output = "07";
		} else if (innet_duration == 8) {
			output = "08";
		} else if (innet_duration == 9) {
			output = "09";
		} else if (innet_duration == 10) {
			output = "10";
		} else if (innet_duration == 11) {
			output = "11";
		} else if (innet_duration == 12) {
			output = "12";
		} else if (innet_duration == 13) {
			output = "13";
		} else if (innet_duration == 14) {
			output = "14";
		} else if (innet_duration == 15) {
			output = "15";
		} else if (innet_duration == 16) {
			output = "16";
		} else if (innet_duration == 17) {
			output = "17";
		} else if (innet_duration == 18) {
			output = "18";
		} else if (innet_duration == 19) {
			output = "19";
		} else if (innet_duration == 20) {
			output = "20";
		} else if (innet_duration == 21) {
			output = "21";
		} else if (innet_duration == 22) {
			output = "22";
		} else if (innet_duration == 23) {
			output = "23";
		} else if (innet_duration == 24) {
			output = "24";
		} else if (innet_duration > 24 && innet_duration <= 36) {
			output = "25";
		} else if (innet_duration > 36 && innet_duration <= 48) {
			output = "26";
		} else if (innet_duration > 48 && innet_duration <= 60) {
			output = "27";
		} else if (innet_duration > 60 && innet_duration <= 72) {
			output = "28";
		} else if (innet_duration > 72 && innet_duration <= 84) {
			output = "29";
		} else if (innet_duration > 84 && innet_duration <= 96) {
			output = "30";
		} else {
			output = "31";
		}
		return output;
	}
}
