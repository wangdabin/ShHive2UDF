package org.apache.hadoop.hive.ql.udf;

import java.util.ArrayList;
import java.util.List;

import org.apache.hadoop.hive.ql.exec.UDF;

/*
 * �������ܣ�
 * Oracle�д����ߣ�
 * Hive�Զ��庯��������ƽ����
 * ����ʱ�䣺2015-06-08
 * ��ӦԭOracle������DW.FUNC_OWE_FEE_LEVEL
 * �������1��
 * ���ز�����
 * */
public class FuncIncomeLevel extends UDF {
	public String evaluate(String key_source_type_cd, String product_id,
			String user_type_id) {
		String output = null;
		List key_source_52004_product = new ArrayList();
		key_source_52004_product.add("142035");
		key_source_52004_product.add("142848");
		
		List key_source_52001_user_type = new ArrayList();
		key_source_52001_user_type.add("143807");
		key_source_52001_user_type.add("900130");
		key_source_52001_user_type.add("900150");

		if (key_source_type_cd.equals("52007")) {
			output = "800,4006";
		} else if (key_source_type_cd.equals("52003")) {
			output = "17969����ֱ��";
		} else if (key_source_type_cd.equals("52005")) {
			output = "196";
		} else if (key_source_type_cd.equals("52006")) {
			output = "CPNҵ��";
		} else if (key_source_type_cd.equals("52004")
				&& !key_source_52004_product.contains(product_id)) {
			output = "����绰(NGN)";
		}else if (key_source_type_cd.equals("52004")
				&& product_id.equals("142848")) {
			output = "���л�����";
		}else if (key_source_type_cd.equals("52004")
				&& product_id.equals("142035")) {
			output = "һ��ͨ��";
		}else if (key_source_type_cd.equals("52001")
				&& !product_id.equals("142877") && !key_source_52001_user_type.contains(user_type_id)) {
			output = "����ҵ��";
		}else if (key_source_type_cd.equals("52001")
				&& product_id.equals("142877") ) {
			output = "��ͨ�´���";
		}else if (key_source_type_cd.equals("52001")
				&& (user_type_id.equals("143807") | user_type_id.equals("900150")) ) {
			output = "����";
		}else if (key_source_type_cd.equals("52001")
				&& (user_type_id.equals("900130")) ) {
			output = "����";
		}else if (key_source_type_cd.equals("52002")
				&& (product_id.equals("143668")
						|product_id.equals("143669")
						|product_id.equals("955243")
						|product_id.equals("955244")) ) {
			output = "DIA";
		}else if (key_source_type_cd.equals("52002")
				&& (product_id.equals("143678")
						|product_id.equals("143679")) ) {
			output = "IDC";
		}else if (key_source_type_cd.equals("52002")
				&& (product_id.equals("143674")
						|product_id.equals("143675")) ) {
			output = "DPLC";
		}else if (key_source_type_cd.equals("52002")
				&& (product_id.equals("143676")
						|product_id.equals("143677")) ) {
			output = "IPLC";
		}else if (key_source_type_cd.equals("52002")
				&& (product_id.equals("143672")
						|product_id.equals("143673")) ) {
			output = "MPLS VPN";
		}else if (key_source_type_cd.equals("52002")
				&& (product_id.equals("143670")
						|product_id.equals("143671")) ) {
			output = "FR VPN";
		}else if (key_source_type_cd.equals("52002")
				&& (product_id.equals("142149")
						|product_id.equals("142126")) ) {
			output = "WLAN";
		}else if (key_source_type_cd.equals("52002")
				&& (product_id.equals("143607")
						|product_id.equals("901359")
						|product_id.equals("901337")
						|product_id.equals("143604")) ) {
			output = "��Ԫ����";
		}else if (key_source_type_cd.equals("52002")
				&& (product_id.equals("901104")) ) {
			output = "������";
		}else if (key_source_type_cd.equals("52002")
				&& (product_id.equals("956101")
						|product_id.equals("956102")
						|product_id.equals("956103")
						|product_id.equals("956104")
						|product_id.equals("956105")
						|product_id.equals("956106")
						|product_id.equals("956107")
						|product_id.equals("956108")) ) {
			output = "165ZX";
		}else if (key_source_type_cd.equals("52014")) {
			output = "ICT";
		}else{
			output = "����ҵ��1";
		}
		
		return output;
	}
}
