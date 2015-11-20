package org.apache.hadoop.hive.ql.udf;

import org.apache.hadoop.hive.ql.exec.UDF;
/*
 * 函数功能：返回在网时长分档
 * Oracle中创建者：徐杰
 * Hive自定义函数创建：张海东
 * 创建时间：2015-06-09
 * 对应原Oracle函数：DW.F_INNET_TIME
 * 传入参数：时长（V_TIME）
 * 返回参数：分档
 * */
public class FGwInnetTimeLevel extends UDF{ 
	public int evaluate(int v_time) {
		if(v_time <= 0)
			return -1;
		else if(v_time > 0 && v_time <= 1)
			return 1;
	    else if(v_time > 1 && v_time <= 2)
			return 2;
		else if(v_time > 2 && v_time <= 3)
			return 3;
		else if(v_time > 3 && v_time <= 4)
			return 4;
		else if(v_time > 4 && v_time <= 5)
			return 5;
		else if(v_time > 5 && v_time <= 6)
			return 6;
		else if(v_time > 6 && v_time <= 7)
			return 7;
		else if(v_time > 7 && v_time <= 8)
			return 8;
		else if(v_time > 8 && v_time <= 9)
			return 9;
		else if(v_time > 9 && v_time <= 10)
			return 10;
		else if(v_time > 10 && v_time <= 11)
			return 11;
		else if(v_time > 11 && v_time <= 12)
			return 12;
		else if(v_time > 12 && v_time <= 13)
			return 13;
		else if(v_time > 13 && v_time <= 14)
			return 14;
		else if(v_time > 14 && v_time <= 15)
			return 15;
		else if(v_time > 15 && v_time <= 16)
			return 16;
		else if(v_time > 16 && v_time <= 17)
			return 17;
		else if(v_time > 17 && v_time <= 18)
			return 18;
		else if(v_time > 18 && v_time <= 19)
			return 19;
		else if(v_time > 19 && v_time <= 20)
			return 20;
		else if(v_time > 20 && v_time <= 21)
			return 21;
		else if(v_time > 21 && v_time <= 22)
			return 22;
		else if(v_time > 22 && v_time <= 23)
			return 23;
		else if(v_time > 23 && v_time <= 24)
			return 24;
		return 25;
	}
}
