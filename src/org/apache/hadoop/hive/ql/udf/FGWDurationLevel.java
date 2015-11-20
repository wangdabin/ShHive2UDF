package org.apache.hadoop.hive.ql.udf;

import org.apache.hadoop.hive.ql.exec.UDF;


/*
 * �������ܣ����ع���ͨ��ʱ���ֵ�
 * Oracle�д����ߣ����
 * Hive�Զ��庯���������ź���
 * ����ʱ�䣺2015-06-09
 * ��ӦԭOracle������DW.F_GW_DURATION_LEVEL
 * ���������ͨ��ʱ��
 * ���ز������ֵ�
 * */
public class FGWDurationLevel extends UDF{ 
	public String evaluate(int v_duration) {
		
		if(v_duration <= 0)
			return "-1";
		else if(v_duration > 0 && v_duration <= 5)
			return "01";
		else if(v_duration > 5 && v_duration <= 10)
			return "02";
		else if(v_duration > 10 && v_duration <= 15)
			return "03";
		else if(v_duration > 15 && v_duration <= 20)
			return "04";
		else if(v_duration > 20 && v_duration <= 25)
			return "05";
		else if(v_duration > 25 && v_duration <= 30)
			return "06";
		else if(v_duration > 30 && v_duration <= 35)
			return "07";
		else if(v_duration > 35 && v_duration <= 40)
			return "08";
		else if(v_duration > 40 && v_duration <= 45)
			return "09";
		else if(v_duration > 45 && v_duration <= 50)
			return "10";
		else if(v_duration > 50 && v_duration <= 55)
			return "11";
		else if(v_duration > 55 && v_duration <= 60)
			return "12";
		else if(v_duration > 60 && v_duration <= 65)
			return "13";
		else if(v_duration > 65 && v_duration <= 70)
			return "14";
		else if(v_duration > 70 && v_duration <= 75)
			return "15";
		else if(v_duration > 75 && v_duration <= 80)
			return "16";
		else if(v_duration > 80 && v_duration <= 85)
			return "17";
		else if(v_duration > 85 && v_duration <= 90)
			return "18";
		return "19";

	}
}
