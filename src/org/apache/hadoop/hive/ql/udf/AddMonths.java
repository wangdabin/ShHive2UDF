package org.apache.hadoop.hive.ql.udf;

import java.util.Calendar;
import java.util.Date;

import org.apache.hadoop.hive.ql.exec.UDF;
/*
 * �������ܣ���ȡ����ʱ�����Ӽ����º������
 * Hive�Զ��庯��������ƽ����
 * ����ʱ�䣺2015-07-06
 * �������1���������ΪYYYY-MM-DD��ʽ
 * �������2�������·�
 * ���ز��������ز���ΪYYYY-MM-DD��ʽ
 * */
public class AddMonths extends UDF{
	public Date evaluate(Date date,int amount) {
	        Calendar calendar=Calendar.getInstance();
	        calendar.setTime(date);
	        calendar.add(Calendar.MONTH, amount);
	        return calendar.getTime();
	}
}
