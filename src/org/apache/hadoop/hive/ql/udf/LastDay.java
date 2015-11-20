package org.apache.hadoop.hive.ql.udf;

import java.util.Calendar;
import java.util.Date;

import org.apache.hadoop.hive.ql.exec.UDF;
/*
 * �������ܣ���ȡ����ʱ�����������һ�������
 * Hive�Զ��庯��������ƽ����
 * ����ʱ�䣺2015-07-06
 * ����������������ΪYYYY-MM-DD��ʽ
 * ���ز��������ز���ΪYYYY-MM-DD��ʽ
 * */
public class LastDay extends UDF{
	public Date evaluate(Date date) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.set(Calendar.DAY_OF_MONTH, 1);
		cal.roll(Calendar.DAY_OF_MONTH, -1);
		return cal.getTime();
	}
}
