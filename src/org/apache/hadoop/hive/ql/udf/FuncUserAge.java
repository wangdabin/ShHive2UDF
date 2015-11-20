package org.apache.hadoop.hive.ql.udf;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.regex.Pattern;

import org.apache.hadoop.hive.ql.exec.UDF;

/*
 * �������ܣ��ж��Ƿ���һ�����֤
 * Oracle�д����ߣ�
 * Hive�Զ��庯�������������
 * ����ʱ�䣺2015-08-03
 * ��ӦԭOracle������NDWD.FUNC_USER_AGE
 * �������1��cert_num 
 * ���ز����� ��:1  ����:0
 * */
public class FuncUserAge extends UDF {

	public String evaluate(String cert_num) {
		String is_card;
		if(isNumeric(cert_num.substring(0, 10)) && (cert_num.length() == 15 && (isNumeric(cert_num.substring(6, 15))) || (cert_num.length() == 18 && isNumeric(cert_num.substring(6, 16)) && isNumeric(cert_num.substring(7, 17))))){
			if (cert_num.length() == 15) {// �����15λ
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
	 * @Description: �ж�һ�������Ƿ���ȷ
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
	 * @Description: �ж�һ���ַ����Ƿ������������
	 * @param  str
	 * @throws
	 */
	public static boolean isNumeric(String str){ 
	     Pattern pattern = Pattern.compile("[0-9]*"); 
	     return pattern.matcher(str).matches();    
	} 
}
