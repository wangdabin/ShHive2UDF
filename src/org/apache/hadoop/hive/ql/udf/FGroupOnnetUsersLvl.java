package org.apache.hadoop.hive.ql.udf;

import org.apache.hadoop.hive.ql.exec.UDF;

/*
 * 函数功能：集团网上用户数分档
 * Oracle中创建者：jiaoxiulian
 * Hive自定义函数创建：张海东
 * 创建时间：2015-06-09
 * 对应原Oracle函数：DW.F_GROUP_ONNET_USERS_LVL
 * 传入参数：用户数
 * 返回参数：分档
 * */

public class FGroupOnnetUsersLvl extends UDF{ 
	
	public String evaluate(int group_user) {
		
		if(group_user == 0)
			return "00";
		else if(group_user > 0 && group_user <= 10)
			return "01";
		else if(group_user > 10 && group_user <= 20)
			return "02";
		else if(group_user > 20 && group_user <= 50)
			return "03";
		else if(group_user > 50 && group_user <= 100)
			return "04";
		else if(group_user > 100 && group_user <= 200)
			return "05";
		else if(group_user > 200 && group_user <= 300)
			return "06";
		else if(group_user > 300 && group_user <= 500)
			return "07";
		else if(group_user > 500 && group_user <= 1000)
			return "08";
		else if(group_user > 1000 && group_user <= 2000)
			return "09";
		else if(group_user > 2000 && group_user <= 2500)
			return "10";
		else if(group_user > 2500 && group_user <= 3000)
			return "11";
		else if(group_user > 3000 && group_user <= 3500)
			return "12";
		else if(group_user > 3500 && group_user <= 4000)
			return "13";
		else if(group_user > 4000 && group_user <= 4500)
			return "14";
		else if(group_user > 4500 && group_user <= 5000)
			return "15";
		else if(group_user > 5000)
			return "16";
		return "00";
	}
}
