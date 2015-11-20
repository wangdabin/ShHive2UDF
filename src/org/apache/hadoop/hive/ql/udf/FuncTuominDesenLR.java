package org.apache.hadoop.hive.ql.udf;

import org.apache.hadoop.hive.ql.exec.UDF;  

/*  Author:Lizhi & Bingtong
 *  hive-name: desenlr
 */

public class FuncTuominDesenLR extends UDF{  
	
    public String evaluate(final String strIn,final int tmstart,final int type,final String strMask){  
    	String strRet="";
    	String strEncrypt="";
    	
        if (strIn == null){  
            return null;  
        }
        if (strMask == null){  
        	strEncrypt="*"; 
        }
        else
        {
        	strEncrypt=strMask;
        }
        
        try {
			strRet = tm2(strIn,tmstart,type, strEncrypt);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 
        return strRet;
    }
    
    /**
     * �ַ������� �滻Ϊ   �ַ���xxxxxx ��  xxxxx�ַ�������0��ʼ
     * 
     * @param str �ַ���
     * @param tmstart ������ʼλ�� ��0��ʼ
     * @param type	type>=0 ����������type<0 ��������
     * @param t		����λ�滻�ַ�
     * @return      ���Ұ�����ʼ�����󲻰���
     */
	
    public static String tm2(String str,int tmstart,int type,String t){
    	if(t==null || t.equals("")){
    		t = "*";
    	}
    	String s = "";
    	String e = "";
    	String x = "";
    	
    	if(type>=0){
    		if(str.length()>tmstart){
    			s = str.substring(0,tmstart);
    			for (int i=0;i<str.length()-tmstart;i++){
    				x +=t;
    			}
    		}else{
    			return str;
    		}
    	}else{
    		if(str.length()>tmstart){
    			e = str.substring(tmstart,str.length());
    			for (int i=0;i<tmstart;i++){
    				x +=t;
    			}
    		}else{
    			for (int i=0;i<tmstart;i++){
    				x +=t;
    			}
    		}
    	}
    	return s+x+e;
    } 
}
