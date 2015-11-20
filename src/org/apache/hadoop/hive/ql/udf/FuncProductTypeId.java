package org.apache.hadoop.hive.ql.udf;

import java.util.ArrayList;
import java.util.List;

import org.apache.hadoop.hive.ql.exec.UDF;

/*
 * �������ܣ���Ʒ���ຯ��
 * Oracle�д����ߣ�
 * Hive�Զ��庯��������ƽ����
 * ����ʱ�䣺2015-06-08
 * ��ӦԭOracle������DW.2.34 FUNC_PRODUCT_TYPE_ID
 * �������1��
 * �������2��
 * �������3��
 * ���ز�����
 * */
public class FuncProductTypeId extends UDF {
	public String evaluate(String key_source_type, String product_id,
			String user_type) {
		String output = null;

		List key_source_52001_user_type = new ArrayList();
		key_source_52001_user_type.add("143807");
		key_source_52001_user_type.add("900130");
		key_source_52001_user_type.add("900150");

		List key_source_52004_product = new ArrayList();
		key_source_52004_product.add("142035");
		key_source_52004_product.add("142848");

		List key_source_52001_product = new ArrayList();
		key_source_52001_product.add("142717");
		key_source_52001_product.add("141792");
		key_source_52001_product.add("900097");
		key_source_52001_product.add("3074");
		key_source_52001_product.add("141727");
		key_source_52001_product.add("141729");
		key_source_52001_product.add("8");
		key_source_52001_product.add("9");
		key_source_52001_product.add("141974");
		key_source_52001_product.add("142763");
		key_source_52001_product.add("955239");
		key_source_52001_product.add("955240");
		key_source_52001_product.add("955238");
		key_source_52001_product.add("955237");
		key_source_52001_product.add("142877");

		if (key_source_type.equals("52007")) {
			output = "020201";// 800,4006
		} else if (key_source_type.equals("52001")
				&& (product_id.equals("142717") | product_id.equals("141792")
						| product_id.equals("900097")
						| product_id.equals("3074")
						| product_id.equals("141727") | product_id
						.equals("141729"))
				&& !key_source_52001_user_type.contains(user_type)) {
			output = "020202";// 'e1'
		} else if (key_source_type.equals("52004")
				&& !key_source_52004_product.contains(product_id)) {
			output = "020203";// ��ͥ�̻� ԭ'����绰(NGN)'
		} else if (key_source_type.equals("52001")
				&& (product_id.equals("8") | product_id.equals("9")
						| product_id.equals("141974") | product_id
						.equals("142763"))
				&& !key_source_52001_user_type.contains(user_type)) {
			output = "020204";// ��ͥģ����
		} else if (key_source_type.equals("52001")
				&& (product_id.equals("955239") | product_id.equals("955240")
						| product_id.equals("955238") | product_id
						.equals("955237"))
				&& !key_source_52001_user_type.contains(user_type)) {
			output = "020205";// ��ҵģ����
		} else if (key_source_type.equals("52001")
				&& product_id.equals("142877")) {
			output = "020206";// ��ͨ�´���
		} else if (key_source_type.equals("52001")
				&& (user_type.equals("143807") | user_type.equals("900150"))) {
			output = "020207";// ����
		} else if (key_source_type.equals("52001")
				&& user_type.equals("900130")) {
			output = "020208";// ����
		} else if (key_source_type.equals("52004")
				&& product_id.equals("142848")) {
			output = "020209";// ���л�����
		} else if (key_source_type.equals("52004")
				&& product_id.equals("142035")) {
			output = "020210";// һ��ͨ��
		} else if (key_source_type.equals("52001")
				&& !key_source_52001_product.contains(product_id)
				&& !key_source_52001_user_type.contains(user_type)) {
			output = "020211";// ��������ҵ��
		} else if (key_source_type.equals("52002")
				&& (product_id.equals("143668") | product_id.equals("143669")
						| product_id.equals("955243") | product_id
						.equals("955244"))) {
			output = "020101";// DIA
		} else if (key_source_type.equals("52002")
				&& (product_id.equals("143674") | product_id.equals("143675"))) {
			output = "020102";// DPLC
		} else if (key_source_type.equals("52002")
				&& (product_id.equals("143678") | product_id.equals("143679"))) {
			output = "020103";// IDC
		} else if (key_source_type.equals("52006")) {
			output = "020104";// CPN
		} else if (key_source_type.equals("52002")
				&& (product_id.equals("143676") | product_id.equals("143677"))) {
			output = "020105";// IPLC
		} else if (key_source_type.equals("52002")
				&& (product_id.equals("143672") | product_id.equals("143673"))) {
			output = "020106";// MPLS VPN
		} else if (key_source_type.equals("52002")
				&& (product_id.equals("143670") | product_id.equals("143671"))) {
			output = "020107";// FR VPN
		} else if (key_source_type.equals("52002")
				&& (product_id.equals("142149") | product_id.equals("142126"))) {
			output = "020108";// WLAN
		} else if (key_source_type.equals("52002")
				&& (product_id.equals("143607") | product_id.equals("901359")
						| product_id.equals("901337") | product_id
						.equals("143604"))) {
			output = "020109";// ��Ԫ����
		} else if (key_source_type.equals("52002")
				&& product_id.equals("901104")) {
			output = "020110";// ������
		} else if (key_source_type.equals("52002")
				&& (product_id.equals("956101") | product_id.equals("956102")
						| product_id.equals("956103")
						| product_id.equals("956104")
						| product_id.equals("956105")
						| product_id.equals("956106")
						| product_id.equals("956107") | product_id
						.equals("956108"))) {
			output = "020111";// 165ZX
		} else if (key_source_type.equals("-1")
				&& product_id.equals("99999901")) {
			output = "020302";// 196200196201��
		} else if (key_source_type.equals("-1")
				&& product_id.equals("99999902")) {
			output = "020112";// ����
		} else if (key_source_type.equals("-1")
				&& product_id.equals("99999903")) {
			output = "020303";// ��Ϣ��ý
		} else if (key_source_type.equals("-1")
				&& product_id.equals("99999904")) {
			output = "020113";// ��������DA
		} else if (key_source_type.equals("-1")
				&& product_id.equals("99999905")) {
			output = "020114";// �����ؼ���DA
		} else if (key_source_type.equals("-1")
				&& product_id.equals("99999906")) {
			output = "020115";// ������DA
		} else {
			output = "020301";// ����
		}

		return output;
	}
}
