package org.apache.hadoop.hive.ql.udf;

import org.apache.hadoop.hive.ql.exec.UDF;
/*
 * �������ܣ����ӵ绰ͨ�������ֵ�
 * Oracle�д����ߣ�����
 * Hive�Զ��庯���������ź���
 * ����ʱ�䣺2015-06-09
 * ��ӦԭOracle������DW.F_3G_EYES_CALL_COUNTS_LVL
 * ���������ͨ��������CALL_NUB��
 * ���ز������ֵ�
 * */
public class F3GEyesCallCountsLvl extends UDF{ 
	
	public String evaluate(int call_nub) {
	
		if(call_nub == 1)
			return "01";
	    else if(call_nub == 2)
			return "02";
		else if(call_nub == 3)
			return "03";
		else if(call_nub == 4)
			return "04";
		else if(call_nub == 5)
			return "05";
		else if(call_nub == 6)
			return "06";
		else if(call_nub > 6 && call_nub <= 10)
			return "07";
		else if(call_nub > 10 && call_nub <= 20)
			return "08";
		else if(call_nub > 20 && call_nub <= 30)
			return "09";
		else if(call_nub > 30 && call_nub <= 40)
			return "10";
		else if(call_nub > 40 && call_nub <= 50)
			return "11";
		else if(call_nub > 50 && call_nub <= 100)
			return "12";
		else if(call_nub > 100 && call_nub <= 200)
			return "13";
		else if(call_nub > 200 && call_nub <= 300)
			return "14";
		else if(call_nub > 300 && call_nub <= 400)
			return "15";
		else if(call_nub > 400 && call_nub <= 500)
			return "16";
		else if(call_nub > 500 && call_nub <= 1000)
			return "17";
		else if(call_nub > 1000)
			return "18";
		return "01";
	}
}
