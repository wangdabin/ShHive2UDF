package org.apache.hadoop.hive.ql.udf;

import org.apache.hadoop.hive.ql.exec.UDF;
/*
 * �������ܣ�ͨ��ʱ���ֵ�
 * Oracle�д����ߣ�niexiangchun
 * Hive�Զ��庯���������ź���
 * ����ʱ�䣺2015-06-09
 * ��ӦԭOracle������DW. F_3G_CALL_PRE_LVL
 * ���������call_time,see_call_time 
 * ���ز������ֵ�
 * */
public class F3GCallPreLvl extends UDF{ 
	
	public String evaluate(int see_call_time,int call_time) {
		
		int tmp = see_call_time/call_time;
		if(tmp <= 0)
			return "01";
	    else if(tmp > 0 && tmp <= 0.1)
			return "01";
		else if(tmp > 0.1 && tmp <= 0.2)
			return "02";
		else if(tmp > 0.2 && tmp <= 0.3)
			return "03";
		else if(tmp > 0.3 && tmp <= 0.4)
			return "04";
		else if(tmp > 0.4 && tmp <= 0.5)
			return "05";
		else if(tmp > 0.5 && tmp <= 0.6)
			return "06";
		else if(tmp > 0.6 && tmp <= 0.7)
			return "07";
		else if(tmp > 0.7 && tmp <= 0.8)
			return "08";
		else if(tmp > 0.8 && tmp <= 0.9)
			return "09";
		else if(tmp > 0.9 && tmp <= 1)
			return "10";
		return "01";
	}
}
