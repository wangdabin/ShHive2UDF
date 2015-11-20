package org.apache.hadoop.hive.ql.udf;

import org.apache.hadoop.hive.ql.exec.UDF;

/*
 * 函数功能：产品分类函数
 * Oracle中创建者：王松
 * Hive自定义函数创建：平晓刚
 * 创建时间：2015-06-08
 * 对应原Oracle函数：DW.2.34 FUNC_PRODUCT_TYPE_ID
 * 传入参数1：
 * 传入参数2：
 * 传入参数3：
 * 返回参数：
 * */
public class FuncProductTypeWs extends UDF {
	public String evaluate(String key_source_type, String product_id,
			String user_type) {
		String output = null;

		if (product_id.equals("901272") && key_source_type.equals("52014")
				&& (user_type.equals("142565") | user_type.equals("901191"))) {
			output = "020101";// 备件与现场服务
		} else if (product_id.equals("901212")
				&& key_source_type.equals("52014")
				&& user_type.equals("901191")) {
			output = "020102";// 第三方软硬件销售
		} else if (product_id.equals("901208")
				&& key_source_type.equals("52014")
				&& user_type.equals("901195")) {
			output = "020103";// 外包服务
		} else if (product_id.equals("901207")
				&& key_source_type.equals("52014")
				&& (user_type.equals("901186") | user_type.equals("901187") | user_type
						.equals("901188"))) {
			output = "020104";// 系统集成
		} else if (product_id.equals("") && key_source_type.equals("IP")
				&& (user_type.equals("0") | user_type.equals(""))) {
			output = "020201";// IP
		} else if ((product_id.equals("3022") | product_id.equals("955232"))
				&& key_source_type.equals("52001")
				&& (user_type.equals("142837") | user_type.equals("143807"))) {
			output = "020202";// 公话
		} else if ((product_id.equals("141974") | product_id.equals("142027") | product_id
				.equals("142763"))
				&& key_source_type.equals("52004")
				&& (user_type.equals("142157") | user_type.equals("142158")
						| user_type.equals("142160") | user_type
						.equals("142284"))) {
			output = "020203";// 家庭固话
		} else if ((product_id.equals("8") | product_id.equals("9"))
				&& key_source_type.equals("52001")
				&& (user_type.equals("141794") | user_type.equals("141795")
						| user_type.equals("141797")
						| user_type.equals("142647")
						| user_type.equals("142648")
						| user_type.equals("900412") | user_type
						.equals("900582"))) {
			output = "020204";// 家庭模拟线
		} else if ((product_id.equals("901143") | product_id.equals("955239"))
				&& (key_source_type.equals("52001") | key_source_type
						.equals("52004"))
				&& (user_type.equals("142158") | user_type.equals("142159")
						| user_type.equals("142283") | user_type
						.equals("900412"))) {
			output = "020205";// 企业固话
		} else if ((product_id.equals("143263") | product_id.equals("955237") | product_id
				.equals("955238"))
				&& (key_source_type.equals("52001"))
				&& (user_type.equals("141794") | user_type.equals("141795")
						| user_type.equals("141797")
						| user_type.equals("142647")
						| user_type.equals("142648") | user_type
						.equals("900412"))) {
			output = "020206";// 企业模拟线
		} else if ((product_id.equals("900097") | product_id.equals("955234")
				| product_id.equals("955235") | product_id.equals("955236"))
				&& (key_source_type.equals("52001"))
				&& (user_type.equals("901037") | user_type.equals("901038"))) {
			output = "020207";// 数字中继线
		} else if ((product_id.equals("955391"))
				&& (key_source_type.equals("52019"))
				&& (user_type.equals("142562"))) {
			output = "020208";// 校园电话卡
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
			output = "020306";// ISP大带宽
		} else if ((product_id.equals("900502"))
				&& (key_source_type.equals("52013"))
				&& (user_type.equals("900582"))) {
			output = "020307";// 亲情1+(固话+CPN)
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
			output = "020402";// WLAN卡
		} else if ((product_id.equals("142155") | product_id.equals("900636") | product_id
				.equals("901612"))
				&& (key_source_type.equals("52002") | key_source_type
						.equals("52017"))
				&& (user_type.equals("141794") | user_type.equals("142565"))) {
			output = "020403";// 互联网媒体广告
		} else if ((product_id.equals("900038") | product_id.equals("901227"))
				&& (key_source_type.equals("52002") | key_source_type
						.equals("52017"))
				&& (user_type.equals("141794") | user_type.equals("142565"))) {
			output = "020404";// 其他
		} else if ((product_id.equals("955193"))
				&& (key_source_type.equals("52017"))
				&& (user_type.equals("141794"))) {
			output = "020405";// 网络信息安全
		} else if ((product_id.equals("142877"))
				&& (key_source_type.equals("52001"))
				&& (user_type.equals("141794") | user_type.equals("141795"))) {
			output = "020406";// 网通新传真
		} else if ((product_id.equals("955248"))
				&& (key_source_type.equals("52004"))
				&& (user_type.equals("141794"))) {
			output = "020407";// 新会场
		} else if ((product_id.equals("956348"))
				&& (key_source_type.equals("52002"))
				&& (user_type.equals("142565"))) {
			output = "020408";// 云计算
		} else if ((product_id.equals("956103") | product_id.equals("956104"))
				&& (key_source_type.equals("52002"))
				&& (user_type.equals("142565"))) {
			output = "020501";// 165ZX
		} else if ((product_id.equals("143064") | product_id.equals("143202")
				| product_id.equals("143202") | product_id.equals("143674")
				| product_id.equals("143675") | product_id.equals("901047")
				| product_id.equals("901049") | product_id.equals("数字电路")
				| product_id.equals("TeleHouse") | product_id.equals("以太网专线"))
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
				.equals("ATM端口"))
				&& (key_source_type.equals("52002"))
				&& (user_type.equals("142565") | user_type.equals(""))) {
			output = "020503";// IPLC
		} else if ((product_id.equals("901337") | product_id.equals("901359") | product_id
				.equals("国际基础设施"))
				&& (key_source_type.equals("52002"))
				&& (user_type.equals("142565") | user_type.equals(""))) {
			output = "020504";// 网元出租
		} else if ((product_id.equals("142608") | product_id.equals("142609")
				| product_id.equals("143829") | product_id.equals("956185") | product_id
				.equals("956409"))
				&& (key_source_type.equals("52007"))
				&& (user_type.equals("141794") | user_type.equals("901037"))) {
			output = "020601";// 400/800
		} else if ((product_id.equals("955684") | product_id.equals("956087"))
				&& (key_source_type.equals("52018"))
				&& (user_type.equals("141794") | user_type.equals("141795"))) {
			output = "020602";// 超级总机
		} else if ((product_id.equals("142774") | product_id.equals("956412"))
				&& (key_source_type.equals("52009") | key_source_type
						.equals("52018"))
				&& (user_type.equals("141794") | user_type.equals(""))) {
			output = "020603";// 其他
		} else if ((product_id.equals("955669"))
				&& (key_source_type.equals("52004"))
				&& (user_type.equals("141794"))) {
			output = "020604";// 企业固话
		} else if ((product_id.equals("954757"))
				&& (key_source_type.equals("52018"))
				&& (user_type.equals("143667"))) {
			output = "020605";// 融合类
		} else if ((product_id.equals("954954"))
				&& (key_source_type.equals("52018"))
				&& (user_type.equals("141794"))) {
			output = "020606";// 声讯类
		} else if ((product_id.equals("900536"))
				&& (key_source_type.equals("52018"))
				&& (user_type.equals("141794"))) {
			output = "020607";// 通信助理
		} else if ((product_id.equals("901613") | product_id.equals("956190"))
				&& (key_source_type.equals("52018"))
				&& (user_type.equals("141794"))) {
			output = "020608";// 外包呼叫中心
		} else if ((product_id.equals("900296"))
				&& (key_source_type.equals("52012"))
				&& (user_type.equals("141794") | user_type.equals(""))) {
			output = "020609";// 行业信息
		} else if ((product_id.equals("142035") | product_id.equals("955152"))
				&& (key_source_type.equals("52004"))
				&& (user_type.equals("141794") | user_type.equals("141795"))) {
			output = "020610";// 一号通
		} else if (product_id.equals("955327")
				&& key_source_type.equals("52001")
				&& user_type.equals("141794")) {
			output = "020611";// 悦铃
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
				| product_id.equals("FR") | product_id.equals("FR端口") | product_id
				.equals("FR端口"))
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
			output = "021001";// 橙卡
		} else if ((product_id.equals("")) && key_source_type.equals("")
				&& (user_type.equals(""))) {
			output = "021101";// 信息传媒+卡
		} else {
			output = "021102";// 其他
		}
		
		return output;
	}
}
