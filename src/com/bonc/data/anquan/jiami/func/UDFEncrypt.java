package com.bonc.data.anquan.jiami.func;

import org.apache.hadoop.hive.ql.exec.UDF;  

import com.bonc.data.anquan.jiami.en_secret_key.EnSecretKey;
import com.bonc.data.anquan.jiami.func.EncryptionDecryption;

import enstore.store;

/*  Author:Lizhi & Bingtong
 *  hive-name: encrypt
 */

public class UDFEncrypt extends UDF{  

    public String evaluate(Object strIn){  
    	String strRet="";
    	String strEncrypt="";
    	
        if (strIn == null){  
            return null;  
        }
        
        //strEncrypt=store.strDefaultEnKey;
        
        EnSecretKey esk = new EnSecretKey();
        strEncrypt=esk.getEnSecretKey();
        
        try {
			strRet = EncryptionDecryption.encryption(strEncrypt, strIn.toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 
        return strRet;
    }
} 