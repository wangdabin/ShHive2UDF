package org.apache.hadoop.hive.ql.udf;

import org.apache.hadoop.hive.ql.exec.UDF;  


/*  Author:Lizhi & Bingtong
 *  hive-name: desen
 */

public class FuncTuominDesen extends UDF{  
	
    public String evaluate(final String strIn,final int tmstart,final int tmend,final String strMask){  
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
			strRet = tm(strIn,tmstart,tmend, strEncrypt);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 
        return strRet;
    }
    
    /**
     * �ַ������� �滻Ϊxxxxxx
     * 
     * @param str �ַ���
     * @param tmstart ������ʼλ�� ��0��ʼ
     * @param tmend	��������λ��
     * @param t		����λ�滻�ַ�
     * @return ������ʼ������������
     */
	  
    public static String tm(String str,int tmstart,int tmend,String t){
    	if(t==null || t.equals("")){
    		t = "*";
    	}
    	String s = "";
    	String e = "";
    	String x = "";
    	if (tmstart > tmend){
    		return str;
    	} else if (tmstart > str.length()){
    		return str;
    	} else if (tmend >str.length()){
    		s = str.substring(0,tmstart);
    		for(int i=0;i<tmend-str.length();i++){
    			x +=t;
    		}
    	} else {
    		//�����㷨
    		s = str.substring(0,tmstart);
    		e = str.substring(tmend,str.length());
    		for(int i=0;i<tmend-tmstart;i++){
    			x +=t;
    		}
    	}
    	return s+x+e;
    }
    
}
