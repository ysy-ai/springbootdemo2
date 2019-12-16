package com.example.springbootdemo2.controller;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;

public class DescUtil {

    /** 加密解密KEY */
    private static final String KEY = "fbfbdfbb1bb24d858a37ac14df7061a9";

    /** 加密解密算法 */
    private final static String ALGORITHM = "DES";

    public static void main(String[] args) throws Exception {
        String data = "这就是一个测试";
        String str = DescUtil.encrypt(data, KEY);
        System.out.println("str: " + str);
        str = DescUtil.decrypt(str, KEY);
        System.out.println("str: " + str);
    }

    /**
     * 加密
     * @param data 未加密数据
     * @param key  加密key
     * @return
     * @throws Exception
     */
    public static String encrypt(String data, String key) throws Exception {

        byte[] dataBytes = data.getBytes(StandardCharsets.UTF_8);

        byte[] keyBytes = key.getBytes(StandardCharsets.UTF_8);

        // DES算法要求有一个可信任的随机数源
        SecureRandom sr = new SecureRandom();

        // 从原始密匙数据创建DESKeySpec对象
        DESKeySpec dks = new DESKeySpec(keyBytes);

        // 创建一个密匙工厂，然后用它把DESKeySpec转换成
        // 一个SecretKey对象
        SecretKeyFactory keyFactory = SecretKeyFactory.getInstance(ALGORITHM);
        SecretKey securekey = keyFactory.generateSecret(dks);

        // Cipher对象实际完成加密操作
        Cipher cipher = Cipher.getInstance(ALGORITHM);

        // 用密匙初始化Cipher对象
        cipher.init(Cipher.ENCRYPT_MODE, securekey, sr);

        // 正式执行加密操作
        byte[] bytes = cipher.doFinal(dataBytes);
        return byte2hex(bytes);
    }

    /**
     * 解密
     * @param data 加密后的数据
     * @param key  加密key
     * @return
     * @throws Exception
     */
    private static String decrypt(String data, String key) throws Exception {

        byte[] dataBytes = data.getBytes(StandardCharsets.UTF_8);
        byte[] hex2byte = hex2byte(dataBytes);
        byte[] keyBytes = key.getBytes(StandardCharsets.UTF_8);

        // DES算法要求有一个可信任的随机数源
        SecureRandom sr = new SecureRandom();

        // 从原始密匙数据创建一个DESKeySpec对象
        DESKeySpec dks = new DESKeySpec(keyBytes);

        // 创建一个密匙工厂，然后用它把DESKeySpec对象转换成
        // 一个SecretKey对象
        SecretKeyFactory keyFactory = SecretKeyFactory.getInstance(ALGORITHM);
        SecretKey securekey = keyFactory.generateSecret(dks);

        // Cipher对象实际完成解密操作
        Cipher cipher = Cipher.getInstance(ALGORITHM);

        // 用密匙初始化Cipher对象
        cipher.init(Cipher.DECRYPT_MODE, securekey, sr);

        // 正式执行解密操作
        byte[] doFinal = cipher.doFinal(hex2byte);

        return new String(doFinal, StandardCharsets.UTF_8);
    }

    private static byte[] hex2byte(byte[] b) throws UnsupportedEncodingException {
        if ((b.length % 2) != 0) {
            throw new IllegalArgumentException("长度不是偶数");
        }
        byte[] b2 = new byte[b.length / 2];
        for (int n = 0; n < b.length; n += 2) {
            String item = new String(b, n, 2, StandardCharsets.UTF_8);
            b2[n / 2] = (byte) Integer.parseInt(item, 16);
        }
        return b2;
    }

    private static String byte2hex(byte[] b) {
        StringBuilder bulid = new StringBuilder();
        String stmp = "";
        for (int n = 0; n < b.length; n++) {
            stmp = (Integer.toHexString(b[n] & 0XFF));
            if (stmp.length() == 1) {
                bulid.append("0").append(stmp);
            } else {
                bulid.append(stmp);
            }
        }
        return bulid.toString().toUpperCase();
    }

}

