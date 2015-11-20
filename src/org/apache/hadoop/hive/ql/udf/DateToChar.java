package org.apache.hadoop.hive.ql.udf;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.hadoop.hive.ql.exec.UDF;
/*
 * �������ܣ�������ת�����ַ���
 * Hive�Զ��庯��������ƽ����
 * ����ʱ�䣺2015-07-16
 * �������1����������
 * �������2�������1��Ӧ���ַ�����ʽ
 * ���ز������ַ���
 * */
public class DateToChar extends UDF {
	public String evaluate(Date str, String format) throws ParseException {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(str);
		SimpleDateFormat sdfs = new SimpleDateFormat(format.toString());
		String output = sdfs.format(calendar.getTime());
		return output;
	}
}
