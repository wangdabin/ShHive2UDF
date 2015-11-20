package org.apache.hadoop.hive.ql.udf;

import java.util.ArrayList;
import java.util.List;

import org.apache.hadoop.hive.ql.exec.UDF;

/*
 * 函数功能：
 * Oracle中创建者：
 * Hive自定义函数创建：平晓刚
 * 创建时间：2015-06-08
 * 对应原Oracle函数：DW.FUNC_INCOME_LEVEL_CODE
 * 传入参数1：
 * 传入参数2：
 * 传入参数3：
 * 返回参数：
 * */
public class FuncIncomeLevelCode extends UDF {
	public String evaluate(String key_source_type_cd, String product_id,
			String user_type_id) {
		String output = null;
		
		List key_source_52004 = new ArrayList();
		key_source_52004.add("142035");
		key_source_52004.add("142848");
		
		List key_source_52001_user_type = new ArrayList();
		key_source_52001_user_type.add("143807");
		key_source_52001_user_type.add("900130");
		key_source_52001_user_type.add("900150");

		
		if (key_source_type_cd.equals("52007") ){
			output="C08";
		}else if(key_source_type_cd.equals("52003")){
			output="C11";
		}else if(key_source_type_cd.equals("52005")){
			output="C12";
		}else if(key_source_type_cd.equals("52006")){
			output="C17";
		}else if(key_source_type_cd.equals("52004") && !key_source_52004.contains(product_id)){
			output="C03";
		}else if(key_source_type_cd.equals("52004") && product_id.equals("142848")){
			output="C06";
		}else if(key_source_type_cd.equals("52004") && product_id.equals("142035")){
			output="C07";
		}else if(key_source_type_cd.equals("52001") && product_id!=("142877") && !key_source_52001_user_type.contains(user_type_id)){
			output="C02";
		}else if(key_source_type_cd.equals("52001") && product_id.equals("142877")){
			output="C04";
		}else if(key_source_type_cd.equals("52001") && user_type_id.equals("900130")){
			output="C05";
		}else if(key_source_type_cd.equals("52001") && (user_type_id.equals("143807") | user_type_id.equals("900150"))){
			output="C01";
		}else if(key_source_type_cd.equals("52002") && (product_id.equals("143668") | product_id.equals("143669")|product_id.equals("955243") | product_id.equals("955244"))){
			output="C15";
		}else if(key_source_type_cd.equals("52002") && (product_id.equals("143678") | product_id.equals("143679"))){
			output="C19";
		}else if(key_source_type_cd.equals("52002") && (product_id.equals("143674") | product_id.equals("143675"))){
			output="C16";
		}else if(key_source_type_cd.equals("52002") && (product_id.equals("143676") | product_id.equals("143677"))){
			output="C20";
		}else if(key_source_type_cd.equals("52002") && (product_id.equals("143672") | product_id.equals("143673"))){
			output="C21";
		}else if(key_source_type_cd.equals("52002") && (product_id.equals("143670") | product_id.equals("143671"))){
			output="C18";
		}else if(key_source_type_cd.equals("52002") && (product_id.equals("142149") | product_id.equals("142126"))){
			output="C22";
		}else if(key_source_type_cd.equals("52002") && (product_id.equals("143607") | product_id.equals("901359")|product_id.equals("901337") | product_id.equals("143604"))){
			output="C00";
		}else if(key_source_type_cd.equals("52002") && product_id.equals("901104")){
			output="C24";
		}else if(key_source_type_cd.equals("52002") && (product_id.equals("956101") | product_id.equals("956102")|product_id.equals("956103") | product_id.equals("956104") | product_id.equals("956105") | product_id.equals("956106")|product_id.equals("956107") | product_id.equals("956108"))){
			output="C25";
		}else if(key_source_type_cd.equals("52014") ){
			output="C23";
		}else{
			output="C99";
		}
		
		return output;
	}
}
