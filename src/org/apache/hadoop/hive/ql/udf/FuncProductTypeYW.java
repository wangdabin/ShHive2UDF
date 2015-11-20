package org.apache.hadoop.hive.ql.udf;

import org.apache.hadoop.hive.ql.exec.UDF;

/*
 * �������ܣ�������Ʒ���ຯ��
 * Oracle�д����ߣ���ʱ��
 * Hive�Զ��庯��������ƽ����
 * ����ʱ�䣺2015-06-08
 * ��ӦԭOracle������DW.FUNC_PRODUCT_TYPE_YW
 * �������1��
 * �������2��
 * �������3��
 * �������4��
 * �������5��
 * �������6��
 * ���ز�����������Ʒ����
 * */
public class FuncProductTypeYW extends UDF {
	public String evaluate(String is_3g_user, String card_type,
			String pay_mode, String activity_type, String dinner_no,
			String trade_type) {
		String output = null;

		if (is_3g_user.equals("0") && pay_mode.equals("01")) {
			output = "010101";// 2G�󸶷�
		} else if (is_3g_user.equals("0") && pay_mode.equals("02")) {
			output = "010102";// 2G׼Ԥ����
		} else if (is_3g_user.equals("0")
				&& (pay_mode.equals("03") | pay_mode.equals("04") | pay_mode
						.equals("05"))) {
			output = "010103";// 2GԤ����
		} else if (is_3g_user.equals("1") && card_type.equals("0")
				&& pay_mode.equals("01")) {
			// 3G�ֻ��󸶷�
			if (activity_type.equals("01")
					&& !dinner_no.substring(0, 2).equals("03")) {// ȥ��IPHONE��Լ
				output = "01020101";// Ԥ�滰���Żݹ���
			} else if (activity_type.equals("02")
					&& !dinner_no.substring(0, 2).equals("03")) {
				output = "01020102";// �����ͻ���
			} else if (activity_type.equals("03")
					&& !dinner_no.substring(0, 2).equals("03")) {
				output = "01020103";// ����ͷ�
			} else if (dinner_no.substring(0, 2).equals("03")) {
				output = "01020104";// IPHONE��Լ
			} else if (trade_type.equals("��ҵ")) {
				output = "01020106";// ��ҵӦ��
			} else {
				output = "01020105";// �󸶷�����
			}
		} else if (is_3g_user.equals("1") && card_type.equals("0")
				&& pay_mode.equals("02")) {
			output = "010202";// 3G�ֻ�׼Ԥ����
		} else if (is_3g_user.equals("1")
				&& card_type.equals("0")
				&& (pay_mode.equals("03") | pay_mode.equals("04") | pay_mode
						.equals("05"))) {
			output = "010203";// 3G�ֻ�Ԥ����
		} else if (is_3g_user.equals("1") && card_type.equals("1")
				&& pay_mode.equals("01")) {
			output = "010301";// 3G�������󸶷�
		} else if (is_3g_user.equals("1") && card_type.equals("1")
				&& pay_mode.equals("02")) {
			output = "010302";// 3G������׼Ԥ����
		} else if (is_3g_user.equals("1")
				&& card_type.equals("1")
				&& (pay_mode.equals("03") | pay_mode.equals("04") | pay_mode
						.equals("05"))) {
			output = "010303";// 3G������Ԥ����
		}

		return output;
	}
}
