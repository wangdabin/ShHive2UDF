package com.bonc.data.anquan.jiami.func;

import org.apache.hadoop.hive.ql.exec.UDF;  

import com.bonc.data.anquan.jiami.de_secret_key.DeSecretKey;
import com.bonc.data.anquan.jiami.func.EncryptionDecryption;


/*  Author:Lizhi & Bingtong
 *  hive-name: decrypt
 */

public class UDFDecrypt extends UDF{  

    public String evaluate(Object strIn){  
    	String strRet="";
    	String strEncrypt="";
    	
        if (strIn == null){  
            return null;  
        }
        
        //strEncrypt=store.strDefaultDeKey;
        
        DeSecretKey dsk = new DeSecretKey();
        strEncrypt=dsk.getDeSecretKey();
        
        try {
			strRet = EncryptionDecryption.decryption(strEncrypt, strIn.toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 
        return strRet;
    }
}
