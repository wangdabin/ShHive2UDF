package org.apache.hadoop.hive.ql.udf;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.regex.Pattern;

import org.apache.hadoop.hive.ql.exec.UDF;

/*
 * 函数功能：判断是否是一张身份证
 * Oracle中创建者：
 * Hive自定义函数创建：王大斌
 * 创建时间：2015-08-03
 * 对应原Oracle函数：NDWD.FUNC_USER_AGE
 * 传入参数1：cert_num 
 * 返回参数： 是:1  不是:0
 * */
public class FuncUserAge extends UDF {

	public String evaluate(String cert_num) {
		String is_card;
		if(isNumeric(cert_num.substring(0, 10)) && (cert_num.length() == 15 && (isNumeric(cert_num.substring(6, 15))) || (cert_num.length() == 18 && isNumeric(cert_num.substring(6, 16)) && isNumeric(cert_num.substring(7, 17))))){
			if (cert_num.length() == 15) {// 如果是15位
				String dateStr = "19" + cert_num.substring(6, 12);
				is_card = isDate(dateStr) ? "1" : "0";
			}else{
				String dateStr = cert_num.substring(6,14);
				is_card = isDate(dateStr) ? "1" : "0";
			}
		}else{
			is_card = "0";
		}
		return is_card;
	}

	/**
	 * @Title: isDate
	 * @Description: 判断一个日期是否正确
	 * @param @param date
	 * @throws
	 */
	public boolean isDate(String date) {
		SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
		format.setLenient(false);
		try {
			format.parse(date);
		} catch (ParseException e) {
			return false;
		}
		return true;
	}
	/**
	 * @Title: isNumeric
	 * @Description: 判断一个字符串是否都是由数字组成
	 * @param  str
	 * @throws
	 */
	public static boolean isNumeric(String str){ 
	     Pattern pattern = Pattern.compile("[0-9]*"); 
	     return pattern.matcher(str).matches();    
	} 
}
