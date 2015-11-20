package com.bonc.data.anquan.jiami.func;

/*  Author:Lizhi & Bingtong
 *  hive-name: decrypt
 */

//�Զ�������㷨 �ַ����ļ��ܽ���
import java.security.Key;
import java.security.Security;
import javax.crypto.Cipher;

public class EncryptionDecryption  {
	
	 
  /** ���ܹ��� */
  private Cipher encryptCipher = null;

  /** ���ܹ��� */
  private Cipher decryptCipher = null;
  
	/**
	 * ���ַ������м���
	 * 
	 * @param key ���ܷ�ʽ
	 * @param str �����ַ���
	 * @return ���ܺ���ַ���
	 * @throws Exception
	 */
	public static String encryption(String key,String str) throws Exception {
		EncryptionDecryption des = new EncryptionDecryption(key);// �Զ�����Կ
		String nstr = "";
		nstr = des.encrypt(str);
		return nstr;
	}
	
	/**
	 * ���ַ������н���
	 * 
	 * @param key ���ܷ�ʽ
	 * @param str ���ܵ��ַ���
	 * @return ���ܺ���ַ���
	 * @throws Exception
	 */
	public static String decryption(String key,String str) throws Exception{
		EncryptionDecryption des = new EncryptionDecryption(key);// �Զ�����Կ
		String nstr = "";
		nstr = des.decrypt(str);
		return nstr;
	}
	
  /**
   * ��byte����ת��Ϊ��ʾ16����ֵ���ַ����� �磺byte[]{8,18}ת��Ϊ��0813�� ��public static byte[]
   * hexStr2ByteArr(String strIn) ��Ϊ�����ת������
   *
   * @param arrB
   *            ��Ҫת����byte����
   * @return ת������ַ���
   * @throws Exception
   * 
   */
  private  String byteArr2HexStr(byte[] arrB) throws Exception {
      int iLen = arrB.length;
      // ÿ��byte�������ַ����ܱ�ʾ�������ַ����ĳ��������鳤�ȵ�����
      StringBuffer sb = new StringBuffer(iLen * 2);
      for (int i = 0; i < iLen; i++) {
          int intTmp = arrB[i];
          // �Ѹ���ת��Ϊ����
          while (intTmp < 0) {
              intTmp = intTmp + 256;
          }
          // С��0F������Ҫ��ǰ�油0
          if (intTmp < 16) {
              sb.append("0");
          }
          sb.append(Integer.toString(intTmp, 16));
      }
      return sb.toString();
  }

  /**
   * ����ʾ16����ֵ���ַ���ת��Ϊbyte���飬 ��public static String byteArr2HexStr(byte[] arrB)
   * ��Ϊ�����ת������
   *
   * @param strIn ��Ҫת�����ַ���
   * @return ת�����byte����
   * @throws Exception
   *
   */
  private  byte[] hexStr2ByteArr(String strIn) throws Exception {
      byte[] arrB = strIn.getBytes();
      int iLen = arrB.length;

      // �����ַ���ʾһ���ֽڣ������ֽ����鳤�����ַ������ȳ���2
      byte[] arrOut = new byte[iLen / 2];
      for (int i = 0; i < iLen; i = i + 2) {
          String strTmp = new String(arrB, i, 2);
          arrOut[i / 2] = (byte) Integer.parseInt(strTmp, 16);
      }
      return arrOut;
  }

  /**
   * Ĭ�Ϲ��췽����ʹ��Ĭ����Կ
   *
   * @throws Exception
   */
  /*public EncryptionDecryption() throws Exception {
      this(strDefaultKey);
  }*/

  /**
   * ָ����Կ���췽��
   *
   * @param strKey
   *            ָ������Կ
   * @throws Exception
   */
  public EncryptionDecryption(String strKey) throws Exception {
      Security.addProvider(new com.sun.crypto.provider.SunJCE());
      Key key = getKey(strKey.getBytes());

      encryptCipher = Cipher.getInstance("DES");
      encryptCipher.init(Cipher.ENCRYPT_MODE, key);

      decryptCipher = Cipher.getInstance("DES");
      decryptCipher.init(Cipher.DECRYPT_MODE, key);
  }

  /**
   * �����ֽ�����
   *
   * @param arrB
   *            ����ܵ��ֽ�����
   * @return ���ܺ���ֽ�����
   * @throws Exception
   */
  public byte[] encrypt(byte[] arrB) throws Exception {
      return encryptCipher.doFinal(arrB);
  }

  /**
   * �����ַ���
   *
   * @param strIn
   *            ����ܵ��ַ���
   * @return ���ܺ���ַ���
   * @throws Exception
   */
  public String encrypt(String strIn) throws Exception {
      return byteArr2HexStr(encrypt(strIn.getBytes()));
  }

  /**
   * �����ֽ�����
   *
   * @param arrB
   *            ����ܵ��ֽ�����
   * @return ���ܺ���ֽ�����
   * @throws Exception
   */
  public byte[] decrypt(byte[] arrB) throws Exception {
      return decryptCipher.doFinal(arrB);
  }

  /**
   * �����ַ���
   *
   * @param strIn
   *            ����ܵ��ַ���
   * @return ���ܺ���ַ���
   * @throws Exception
   */
  public String decrypt(String strIn) throws Exception {
      try {
          return new String(decrypt(hexStr2ByteArr(strIn)));
      } catch (Exception e) {
          return "";
      }
  }

  /**
   * ��ָ���ַ���������Կ����Կ������ֽ����鳤��Ϊ8λ ����8λʱ���油0������8λֻȡǰ8λ
   *
   * @param arrBTmp
   *            ���ɸ��ַ������ֽ�����
   * @return ���ɵ���Կ
   * @throws java.lang.Exception
   */
  private Key getKey(byte[] arrBTmp) throws Exception {
      // ����һ���յ�8λ�ֽ����飨Ĭ��ֵΪ0��
      byte[] arrB = new byte[8];

      // ��ԭʼ�ֽ�����ת��Ϊ8λ
      for (int i = 0; i < arrBTmp.length && i < arrB.length; i++) {
          arrB[i] = arrBTmp[i];
      }

      // ������Կ
      Key key = new javax.crypto.spec.SecretKeySpec(arrB, "DES");

      return key;
  }
	
}

