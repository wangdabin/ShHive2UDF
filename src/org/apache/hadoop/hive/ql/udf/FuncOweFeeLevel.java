package org.apache.hadoop.hive.ql.udf;

import org.apache.hadoop.hive.ql.exec.UDF;

/*
 * �������ܣ�Ƿ�ѷֵ�����
 * Oracle�д����ߣ�ƽ����
 * Hive�Զ��庯��������ƽ����
 * ����ʱ�䣺2015-06-08
 * ��ӦԭOracle������DW.FUNC_OWE_FEE_LEVEL
 * �������1��Ƿ��
 * ���ز�����Ƿ�ѷֵ�
 * */
public class FuncOweFeeLevel extends UDF {
	public String evaluate(double income_fee) {
		String output = null;

		if (income_fee <= 50) {
			output = "1";
		} else if (income_fee > 50 && income_fee <= 100) {
			output = "2";
		} else if (income_fee > 100 && income_fee <= 150) {
			output = "3";
		} else if (income_fee > 150 && income_fee <= 300) {
			output = "4";
		} else if (income_fee > 300 && income_fee <= 500) {
			output = "5";
		} else if (income_fee > 500 && income_fee <= 1000) {
			output = "6";
		} else if (income_fee > 1000) {
			output = "7";
		}

		return output;
	}
}
