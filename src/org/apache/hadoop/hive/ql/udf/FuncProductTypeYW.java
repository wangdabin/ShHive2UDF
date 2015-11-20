package org.apache.hadoop.hive.ql.udf;

import org.apache.hadoop.hive.ql.exec.UDF;

/*
 * 函数功能：移网产品分类函数
 * Oracle中创建者：刘时燕
 * Hive自定义函数创建：平晓刚
 * 创建时间：2015-06-08
 * 对应原Oracle函数：DW.FUNC_PRODUCT_TYPE_YW
 * 传入参数1：
 * 传入参数2：
 * 传入参数3：
 * 传入参数4：
 * 传入参数5：
 * 传入参数6：
 * 返回参数：移网产品分类
 * */
public class FuncProductTypeYW extends UDF {
	public String evaluate(String is_3g_user, String card_type,
			String pay_mode, String activity_type, String dinner_no,
			String trade_type) {
		String output = null;

		if (is_3g_user.equals("0") && pay_mode.equals("01")) {
			output = "010101";// 2G后付费
		} else if (is_3g_user.equals("0") && pay_mode.equals("02")) {
			output = "010102";// 2G准预付费
		} else if (is_3g_user.equals("0")
				&& (pay_mode.equals("03") | pay_mode.equals("04") | pay_mode
						.equals("05"))) {
			output = "010103";// 2G预付费
		} else if (is_3g_user.equals("1") && card_type.equals("0")
				&& pay_mode.equals("01")) {
			// 3G手机后付费
			if (activity_type.equals("01")
					&& !dinner_no.substring(0, 2).equals("03")) {// 去掉IPHONE合约
				output = "01020101";// 预存话费优惠购机
			} else if (activity_type.equals("02")
					&& !dinner_no.substring(0, 2).equals("03")) {
				output = "01020102";// 购机送话费
			} else if (activity_type.equals("03")
					&& !dinner_no.substring(0, 2).equals("03")) {
				output = "01020103";// 存费送费
			} else if (dinner_no.substring(0, 2).equals("03")) {
				output = "01020104";// IPHONE合约
			} else if (trade_type.equals("行业")) {
				output = "01020106";// 行业应用
			} else {
				output = "01020105";// 后付费其他
			}
		} else if (is_3g_user.equals("1") && card_type.equals("0")
				&& pay_mode.equals("02")) {
			output = "010202";// 3G手机准预付费
		} else if (is_3g_user.equals("1")
				&& card_type.equals("0")
				&& (pay_mode.equals("03") | pay_mode.equals("04") | pay_mode
						.equals("05"))) {
			output = "010203";// 3G手机预付费
		} else if (is_3g_user.equals("1") && card_type.equals("1")
				&& pay_mode.equals("01")) {
			output = "010301";// 3G上网卡后付费
		} else if (is_3g_user.equals("1") && card_type.equals("1")
				&& pay_mode.equals("02")) {
			output = "010302";// 3G上网卡准预付费
		} else if (is_3g_user.equals("1")
				&& card_type.equals("1")
				&& (pay_mode.equals("03") | pay_mode.equals("04") | pay_mode
						.equals("05"))) {
			output = "010303";// 3G上网卡预付费
		}

		return output;
	}
}
