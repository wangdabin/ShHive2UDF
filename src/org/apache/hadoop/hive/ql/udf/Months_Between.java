package org.apache.hadoop.hive.ql.udf;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.hadoop.hive.ql.exec.UDF;
import org.apache.hadoop.io.Text;

/*
 * �������ܣ���ȡ����ʱ�������ٸ���
 * Hive�Զ��庯��������ƽ����
 * ����ʱ�䣺2015-07-06
 * �������1���������ΪYYYY-MM-DD��ʽ
 * �������2���������ΪYYYY-MM-DD��ʽ
 * ���ز�����float��������
 * ע�⣺�������2һ��Ҫ�ȴ������1��
 * */

public class Months_Between extends UDF {
	public double evaluate(Date start, Date end) throws ParseException {

		double result = 0;

		Calendar cal_start = Calendar.getInstance();
		cal_start.setTime(start);

		Calendar cal_end = Calendar.getInstance();
		cal_end.setTime(end);

		result = cal_start.get(Calendar.MONTH) - cal_end.get(Calendar.MONTH)
				+ (cal_start.get(Calendar.YEAR) - cal_end.get(Calendar.YEAR))
				* 12+(double)(cal_start.getTime().getDate()-cal_end.getTime().getDate())/31;
		
		return result;
	}
}
