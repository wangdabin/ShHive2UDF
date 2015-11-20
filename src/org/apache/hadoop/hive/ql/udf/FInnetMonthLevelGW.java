package org.apache.hadoop.hive.ql.udf;

import org.apache.hadoop.hive.ql.exec.UDF;
/*
 * 函数功能：入网时间分段类型
 * Oracle中创建者：jiaoxiulian
 * Hive自定义函数创建：张海东
 * 创建时间：2015-06-09
 * 对应原Oracle函数：DW.F_INNET_MONTH_LEVEL_GW
 * 传入参数：INNET_MONTH_LEVEL
 * 返回参数：分档
 * */
public class FInnetMonthLevelGW extends UDF{ 
	public String evaluate(int innet_momth_level) {
		
		if(innet_momth_level >= 0 && innet_momth_level <= 1)
			return "01";
		else if(innet_momth_level == 2)
			return "02";
		else if(innet_momth_level == 3)
			return "03";
		else if(innet_momth_level == 4)
			return "04";
		else if(innet_momth_level == 5)
			return "05";
		else if(innet_momth_level == 6)
			return "06";
		else if(innet_momth_level == 7)
			return "07";
		else if(innet_momth_level == 8)
			return "08";
		else if(innet_momth_level == 9)
			return "09";
		else if(innet_momth_level == 10)
			return "10";
		else if(innet_momth_level == 11)
			return "11";
		else if(innet_momth_level == 12)
			return "12";
		else if(innet_momth_level == 13)
			return "13";
		else if(innet_momth_level == 14)
			return "14";
		else if(innet_momth_level == 15)
			return "15";
		else if(innet_momth_level == 16)
			return "16";
		else if(innet_momth_level == 17)
			return "17";
		else if(innet_momth_level == 18)
			return "18";
		else if(innet_momth_level == 19)
			return "19";
		else if(innet_momth_level == 20)
			return "20";
		else if(innet_momth_level == 21)
			return "21";
		else if(innet_momth_level == 22)
			return "22";
		else if(innet_momth_level == 23)
			return "23";
		else if(innet_momth_level == 24)
			return "24";
		else if(innet_momth_level > 25 && innet_momth_level <= 36)
			return "25";
		else if(innet_momth_level > 37 && innet_momth_level <= 48)
			return "26";
		else if(innet_momth_level > 49 && innet_momth_level <= 60)
			return "27";
		else if(innet_momth_level > 61 && innet_momth_level <= 72)
			return "28";
		else if(innet_momth_level > 73 && innet_momth_level <= 84)
			return "29";
		else if(innet_momth_level > 85 && innet_momth_level <= 96)
			return "30";
		else if(innet_momth_level > 97)
			return "31";
		return "31";
	}
}

