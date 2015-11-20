package org.apache.hadoop.hive.ql.udf;

import org.apache.hadoop.hive.ql.exec.UDF;
/*
 * 函数功能：业务品牌分档
 * Oracle中创建者：jiaoxiulian
 * Hive自定义函数创建：张海东
 * 创建时间：2015-06-09
 * 对应原Oracle函数：DW.F_CHANGE_BRAND
 * 传入参数：商标（brand），支付类型（pay mode）
 * 返回参数：分档
 * */
public class FBrand extends UDF{ 
	
	public String evaluate(String pay_mode,String brand) {
		if(pay_mode == "01" && brand == "10")
			return "01";//世界风
		else if(pay_mode == "01" && brand == "20")
			return "01";//世界风
		else if(pay_mode == "01" && brand == "40")
			return "02";//新势力
		else if(pay_mode == "01" && brand == "90")
			return "01";//世界风
		else if(pay_mode == "01" && brand == "30")
			return "01";//世界风
		else if(pay_mode == "01" && brand == "50")
			return "01";//世界风
		else if(pay_mode == "01" && brand == null)
			return "01";//世界风
		else if(pay_mode == "02" && brand == "10")
			return "03";//如意通
		else if(pay_mode == "02" && brand == "20")
			return "01";//新势力
		else if(pay_mode == "02" && brand == "30")
			return "01";//世界风
		else if(pay_mode == "02" && brand == "50")
			return "01";//世界风
		else if(pay_mode == "02" && brand == "40")
			return "02";//新势力
		else if(pay_mode == "02" && brand == "90")
			return "01";//世界风
		else if(pay_mode == "02" && brand == null)
			return "01";//世界风
		else if(pay_mode == "03")
			return "03";//如意通
		else if(pay_mode == "05")
			return "03";//如意通--OCS用户
		else if(pay_mode == "04" && brand == "10")
			return "03";//如意通
		else if(pay_mode == "04" && brand == "20")
			return "03";//如意通
		else if(pay_mode == "04" && brand == "30")
			return "03";//如意通
		else if(pay_mode == "04" && brand == "50")
			return "03";//如意通
		else if(pay_mode == "04" && brand == "40")
			return "02";//新势力
		else if(pay_mode == "04" && brand == "90")
			return "03";//如意通
		else if(pay_mode == "04" && brand == null)
			return "03";//如意通	
		return "01";
	}
}
