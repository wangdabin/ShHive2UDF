package org.apache.hadoop.hive.ql.udf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.apache.hadoop.hive.ql.exec.UDF;
/*
 * 函数功能：返回在产品组类型
 * Oracle中创建者：徐杰
 * Hive自定义函数创建：张海东
 * 创建时间：2015-06-09
 * 对应原Oracle函数：DW. F_GW_GROUP_PRODUCT_TYPE
 * 传入参数：v_prod_type(单产品ID)     v_user_type(用户类型)    V_CUST_TYPE  V_GROUP_PRODUCT_TYPE
 * 返回参数：分档
 * */
public class FGWGroupProductType extends UDF{ 
	public String evaluate(int v_prod_type,int v_user_type,int v_cust_type,String v_group_product_type) {
		List<Integer> list = new ArrayList<Integer>(2);
		list.add(8); list.add(955238);
		List<Integer> listt = new ArrayList<Integer>(5);
		list.add(8); list.add(9);
		list.add(955238); list.add(955237); list.add(141729);
		List<Integer> listtt = new ArrayList<Integer>();
		list.add(0); list.add(4);
		List<Integer> li = new ArrayList<Integer>();
		list.add(9); list.add(955237);
		List<Integer> lis = new ArrayList<Integer>();
		list.add(141795); list.add(141797);
		if(v_prod_type == 141729 && v_user_type == 142551)
			return "99000001";
		else if(v_prod_type == 141729 && v_user_type != 142551)
			return "990000011";
		else if(list.contains(v_prod_type) && v_user_type == 900150)
			return "A1100";
		else if(list.contains(v_prod_type) && v_user_type == 142647)
			return "990000004";
		else if(list.contains(v_prod_type) && v_user_type == 900412)
			return "990000020";
		else if(list.contains(v_prod_type) && v_user_type == 142648)
			return "990000009";
		else if(v_prod_type == 8 && lis.contains(v_user_type) ||  list.contains(v_prod_type) && v_user_type == 0 && listtt.contains(v_cust_type))
			return "B1300";
		else if (v_prod_type == 9 && v_user_type == 141795 || (li.contains(v_prod_type) && v_user_type == 0 && listtt.contains(v_cust_type)))
			return "B1400";
	    else if(v_prod_type == 8 && v_user_type == 900582)
			return "B1800";
		else if(!listt.contains(v_prod_type))
			return v_group_product_type;
		else
			return "990000010";
	}
}
