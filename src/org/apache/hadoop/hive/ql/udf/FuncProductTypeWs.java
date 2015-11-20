package org.apache.hadoop.hive.ql.udf;

import org.apache.hadoop.hive.ql.exec.UDF;

/*
 * �������ܣ���Ʒ���ຯ��
 * Oracle�д����ߣ�����
 * Hive�Զ��庯��������ƽ����
 * ����ʱ�䣺2015-06-08
 * ��ӦԭOracle������DW.2.34 FUNC_PRODUCT_TYPE_ID
 * �������1��
 * �������2��
 * �������3��
 * ���ز�����
 * */
public class FuncProductTypeWs extends UDF {
	public String evaluate(String key_source_type, String product_id,
			String user_type) {
		String output = null;

		if (product_id.equals("901272") && key_source_type.equals("52014")
				&& (user_type.equals("142565") | user_type.equals("901191"))) {
			output = "020101";// �������ֳ�����
		} else if (product_id.equals("901212")
				&& key_source_type.equals("52014")
				&& user_type.equals("901191")) {
			output = "020102";// ��������Ӳ������
		} else if (product_id.equals("901208")
				&& key_source_type.equals("52014")
				&& user_type.equals("901195")) {
			output = "020103";// �������
		} else if (product_id.equals("901207")
				&& key_source_type.equals("52014")
				&& (user_type.equals("901186") | user_type.equals("901187") | user_type
						.equals("901188"))) {
			output = "020104";// ϵͳ����
		} else if (product_id.equals("") && key_source_type.equals("IP")
				&& (user_type.equals("0") | user_type.equals(""))) {
			output = "020201";// IP
		} else if ((product_id.equals("3022") | product_id.equals("955232"))
				&& key_source_type.equals("52001")
				&& (user_type.equals("142837") | user_type.equals("143807"))) {
			output = "020202";// ����
		} else if ((product_id.equals("141974") | product_id.equals("142027") | product_id
				.equals("142763"))
				&& key_source_type.equals("52004")
				&& (user_type.equals("142157") | user_type.equals("142158")
						| user_type.equals("142160") | user_type
						.equals("142284"))) {
			output = "020203";// ��ͥ�̻�
		} else if ((product_id.equals("8") | product_id.equals("9"))
				&& key_source_type.equals("52001")
				&& (user_type.equals("141794") | user_type.equals("141795")
						| user_type.equals("141797")
						| user_type.equals("142647")
						| user_type.equals("142648")
						| user_type.equals("900412") | user_type
						.equals("900582"))) {
			output = "020204";// ��ͥģ����
		} else if ((product_id.equals("901143") | product_id.equals("955239"))
				&& (key_source_type.equals("52001") | key_source_type
						.equals("52004"))
				&& (user_type.equals("142158") | user_type.equals("142159")
						| user_type.equals("142283") | user_type
						.equals("900412"))) {
			output = "020205";// ��ҵ�̻�
		} else if ((product_id.equals("143263") | product_id.equals("955237") | product_id
				.equals("955238"))
				&& (key_source_type.equals("52001"))
				&& (user_type.equals("141794") | user_type.equals("141795")
						| user_type.equals("141797")
						| user_type.equals("142647")
						| user_type.equals("142648") | user_type
						.equals("900412"))) {
			output = "020206";// ��ҵģ����
		} else if ((product_id.equals("900097") | product_id.equals("955234")
				| product_id.equals("955235") | product_id.equals("955236"))
				&& (key_source_type.equals("52001"))
				&& (user_type.equals("901037") | user_type.equals("901038"))) {
			output = "020207";// �����м���
		} else if ((product_id.equals("955391"))
				&& (key_source_type.equals("52019"))
				&& (user_type.equals("142562"))) {
			output = "020208";// У԰�绰��
		} else if ((product_id.equals("")) && (key_source_type.equals("165"))
				&& (user_type.equals("0") | user_type.equals(""))) {
			output = "020301";// 165
		} else if ((product_id.equals("956101") | product_id.equals("956102"))
				&& (key_source_type.equals("52002"))
				&& (user_type.equals("142565"))) {
			output = "020302";// 165ZX
		} else if ((product_id.equals("")) && (key_source_type.equals("BST"))
				&& (user_type.equals("0") | user_type.equals(""))) {
			output = "020303";// BST
		} else if ((product_id.equals("3078") | product_id.equals("50963")
				| product_id.equals("954973") | product_id.equals("955392") | product_id
				.equals(""))
				&& (key_source_type.equals("52006") | key_source_type
						.equals("52019"))
				&& (user_type.equals("") | user_type.equals("141794")
						| user_type.equals("141795")
						| user_type.equals("142005")
						| user_type.equals("142565")
						| user_type.equals("142932") | user_type
						.equals("900582"))) {
			output = "020304";// CPN
		} else if ((product_id.equals("143668") | product_id.equals("143669")
				| product_id.equals("955243") | product_id.equals("955244") | product_id
				.equals("DIA"))
				&& (key_source_type.equals("52002"))
				&& (user_type.equals("0") | user_type.equals("142565")
						| user_type.equals("143667")
						| user_type.equals("900712") | user_type.equals(""))) {
			output = "020305";// DIA
		} else if ((product_id.equals("901104"))
				&& (key_source_type.equals("52002"))
				&& (user_type.equals("142565"))) {
			output = "020306";// ISP�����
		} else if ((product_id.equals("900502"))
				&& (key_source_type.equals("52013"))
				&& (user_type.equals("900582"))) {
			output = "020307";// ����1+(�̻�+CPN)
		} else if ((product_id.equals("143678") | product_id.equals("143679")
				| product_id.equals("956107") | product_id.equals("956108") | product_id
				.equals("IDC"))
				&& (key_source_type.equals("52002"))
				&& (user_type.equals("142565") | user_type.equals("142566") | user_type
						.equals(""))) {
			output = "020401";// IDC
		} else if ((product_id.equals("955393"))
				&& (key_source_type.equals("52019"))
				&& (user_type.equals("142511"))) {
			output = "020402";// WLAN��
		} else if ((product_id.equals("142155") | product_id.equals("900636") | product_id
				.equals("901612"))
				&& (key_source_type.equals("52002") | key_source_type
						.equals("52017"))
				&& (user_type.equals("141794") | user_type.equals("142565"))) {
			output = "020403";// ������ý����
		} else if ((product_id.equals("900038") | product_id.equals("901227"))
				&& (key_source_type.equals("52002") | key_source_type
						.equals("52017"))
				&& (user_type.equals("141794") | user_type.equals("142565"))) {
			output = "020404";// ����
		} else if ((product_id.equals("955193"))
				&& (key_source_type.equals("52017"))
				&& (user_type.equals("141794"))) {
			output = "020405";// ������Ϣ��ȫ
		} else if ((product_id.equals("142877"))
				&& (key_source_type.equals("52001"))
				&& (user_type.equals("141794") | user_type.equals("141795"))) {
			output = "020406";// ��ͨ�´���
		} else if ((product_id.equals("955248"))
				&& (key_source_type.equals("52004"))
				&& (user_type.equals("141794"))) {
			output = "020407";// �»᳡
		} else if ((product_id.equals("956348"))
				&& (key_source_type.equals("52002"))
				&& (user_type.equals("142565"))) {
			output = "020408";// �Ƽ���
		} else if ((product_id.equals("956103") | product_id.equals("956104"))
				&& (key_source_type.equals("52002"))
				&& (user_type.equals("142565"))) {
			output = "020501";// 165ZX
		} else if ((product_id.equals("143064") | product_id.equals("143202")
				| product_id.equals("143202") | product_id.equals("143674")
				| product_id.equals("143675") | product_id.equals("901047")
				| product_id.equals("901049") | product_id.equals("���ֵ�·")
				| product_id.equals("TeleHouse") | product_id.equals("��̫��ר��"))
				&& (key_source_type.equals("52002")
						| key_source_type.equals("52002")
						| key_source_type.equals("52010") | key_source_type
						.equals("52002"))
				&& (user_type.equals("141794") | user_type.equals("142562")
						| user_type.equals("142564")
						| user_type.equals("142565")
						| user_type.equals("143667") | user_type.equals(""))) {
			output = "020502";// DPLC
		} else if ((product_id.equals("143676") | product_id.equals("143677")
				| product_id.equals("ATM") | product_id.equals("DDN") | product_id
				.equals("ATM�˿�"))
				&& (key_source_type.equals("52002"))
				&& (user_type.equals("142565") | user_type.equals(""))) {
			output = "020503";// IPLC
		} else if ((product_id.equals("901337") | product_id.equals("901359") | product_id
				.equals("���ʻ�����ʩ"))
				&& (key_source_type.equals("52002"))
				&& (user_type.equals("142565") | user_type.equals(""))) {
			output = "020504";// ��Ԫ����
		} else if ((product_id.equals("142608") | product_id.equals("142609")
				| product_id.equals("143829") | product_id.equals("956185") | product_id
				.equals("956409"))
				&& (key_source_type.equals("52007"))
				&& (user_type.equals("141794") | user_type.equals("901037"))) {
			output = "020601";// 400/800
		} else if ((product_id.equals("955684") | product_id.equals("956087"))
				&& (key_source_type.equals("52018"))
				&& (user_type.equals("141794") | user_type.equals("141795"))) {
			output = "020602";// �����ܻ�
		} else if ((product_id.equals("142774") | product_id.equals("956412"))
				&& (key_source_type.equals("52009") | key_source_type
						.equals("52018"))
				&& (user_type.equals("141794") | user_type.equals(""))) {
			output = "020603";// ����
		} else if ((product_id.equals("955669"))
				&& (key_source_type.equals("52004"))
				&& (user_type.equals("141794"))) {
			output = "020604";// ��ҵ�̻�
		} else if ((product_id.equals("954757"))
				&& (key_source_type.equals("52018"))
				&& (user_type.equals("143667"))) {
			output = "020605";// �ں���
		} else if ((product_id.equals("954954"))
				&& (key_source_type.equals("52018"))
				&& (user_type.equals("141794"))) {
			output = "020606";// ��Ѷ��
		} else if ((product_id.equals("900536"))
				&& (key_source_type.equals("52018"))
				&& (user_type.equals("141794"))) {
			output = "020607";// ͨ������
		} else if ((product_id.equals("901613") | product_id.equals("956190"))
				&& (key_source_type.equals("52018"))
				&& (user_type.equals("141794"))) {
			output = "020608";// �����������
		} else if ((product_id.equals("900296"))
				&& (key_source_type.equals("52012"))
				&& (user_type.equals("141794") | user_type.equals(""))) {
			output = "020609";// ��ҵ��Ϣ
		} else if ((product_id.equals("142035") | product_id.equals("955152"))
				&& (key_source_type.equals("52004"))
				&& (user_type.equals("141794") | user_type.equals("141795"))) {
			output = "020610";// һ��ͨ
		} else if (product_id.equals("955327")
				&& key_source_type.equals("52001")
				&& user_type.equals("141794")) {
			output = "020611";// ����
		} else if ((product_id.equals("50981") | product_id.equals("50985")
				| product_id.equals("50986") | product_id.equals("955241"))
				&& key_source_type.equals("52003")
				&& (user_type.equals("0") | user_type.equals("141794") | user_type
						.equals("141795"))) {
			output = "020701";// 17969
		} else if ((product_id.equals("")) && key_source_type.equals("193")
				&& (user_type.equals("0") | user_type.equals(""))) {
			output = "020702";// 193
		} else if ((product_id.equals("141782") | product_id.equals("2754")
				| product_id.equals("3027") | product_id.equals("901165"))
				&& key_source_type.equals("52005")
				&& (user_type.equals("141794") | user_type.equals("141795")
						| user_type.equals("141796") | user_type
						.equals("142511"))) {
			output = "020703";// 196
		} else if ((product_id.equals("956105") | product_id.equals("956106"))
				&& key_source_type.equals("52002")
				&& (user_type.equals("142565"))) {
			output = "020801";// 165ZX
		} else if ((product_id.equals("143670") | product_id.equals("143671")
				| product_id.equals("FR") | product_id.equals("FR�˿�") | product_id
				.equals("FR�˿�"))
				&& key_source_type.equals("52002")
				&& (user_type.equals("142565") | user_type.equals(""))) {
			output = "020802";// FR VPN
		} else if ((product_id.equals("")) && key_source_type.equals("ZX")
				&& (user_type.equals("0") | user_type.equals(""))) {
			output = "020803";// ZX
		} else if ((product_id.equals("143672") | product_id.equals("143673") | product_id
				.equals("MPLS-VPN"))
				&& key_source_type.equals("52002")
				&& (user_type.equals("142565") | user_type.equals("143667") | user_type
						.equals(""))) {
			output = "020901";// MPLS VPN
		} else if ((product_id.equals("900236"))
				&& key_source_type.equals("52011")
				&& (user_type.equals("141794"))) {
			output = "021001";// �ȿ�
		} else if ((product_id.equals("")) && key_source_type.equals("")
				&& (user_type.equals(""))) {
			output = "021101";// ��Ϣ��ý+��
		} else {
			output = "021102";// ����
		}
		
		return output;
	}
}
