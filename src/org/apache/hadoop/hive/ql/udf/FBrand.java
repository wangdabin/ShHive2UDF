package org.apache.hadoop.hive.ql.udf;

import org.apache.hadoop.hive.ql.exec.UDF;
/*
 * �������ܣ�ҵ��Ʒ�Ʒֵ�
 * Oracle�д����ߣ�jiaoxiulian
 * Hive�Զ��庯���������ź���
 * ����ʱ�䣺2015-06-09
 * ��ӦԭOracle������DW.F_CHANGE_BRAND
 * ����������̱꣨brand����֧�����ͣ�pay mode��
 * ���ز������ֵ�
 * */
public class FBrand extends UDF{ 
	
	public String evaluate(String pay_mode,String brand) {
		if(pay_mode == "01" && brand == "10")
			return "01";//�����
		else if(pay_mode == "01" && brand == "20")
			return "01";//�����
		else if(pay_mode == "01" && brand == "40")
			return "02";//������
		else if(pay_mode == "01" && brand == "90")
			return "01";//�����
		else if(pay_mode == "01" && brand == "30")
			return "01";//�����
		else if(pay_mode == "01" && brand == "50")
			return "01";//�����
		else if(pay_mode == "01" && brand == null)
			return "01";//�����
		else if(pay_mode == "02" && brand == "10")
			return "03";//����ͨ
		else if(pay_mode == "02" && brand == "20")
			return "01";//������
		else if(pay_mode == "02" && brand == "30")
			return "01";//�����
		else if(pay_mode == "02" && brand == "50")
			return "01";//�����
		else if(pay_mode == "02" && brand == "40")
			return "02";//������
		else if(pay_mode == "02" && brand == "90")
			return "01";//�����
		else if(pay_mode == "02" && brand == null)
			return "01";//�����
		else if(pay_mode == "03")
			return "03";//����ͨ
		else if(pay_mode == "05")
			return "03";//����ͨ--OCS�û�
		else if(pay_mode == "04" && brand == "10")
			return "03";//����ͨ
		else if(pay_mode == "04" && brand == "20")
			return "03";//����ͨ
		else if(pay_mode == "04" && brand == "30")
			return "03";//����ͨ
		else if(pay_mode == "04" && brand == "50")
			return "03";//����ͨ
		else if(pay_mode == "04" && brand == "40")
			return "02";//������
		else if(pay_mode == "04" && brand == "90")
			return "03";//����ͨ
		else if(pay_mode == "04" && brand == null)
			return "03";//����ͨ	
		return "01";
	}
}
