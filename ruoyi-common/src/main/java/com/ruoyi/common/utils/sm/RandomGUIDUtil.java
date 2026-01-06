package com.ruoyi.common.utils.sm;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RandomGUIDUtil {
	protected final Logger logger = LoggerFactory.getLogger(RandomGUIDUtil.class.getName());

	public String valueBeforeMD5 = "";
	public String valueAfterMD5 = "";
	private static Random myRand;
	private static SecureRandom mySecureRand = new SecureRandom();
	private static String s_id;
	private static final int PAD_BELOW = 16;
	private static final int TWO_BYTES = 255;

	static {
		long secureInitializer = mySecureRand.nextLong();
		myRand = new Random(secureInitializer);
		try {
			s_id = InetAddress.getLocalHost().toString();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}

	public RandomGUIDUtil() {
		getRandomGUIDUtil(false);
	}

	public RandomGUIDUtil(boolean secure) {
		getRandomGUIDUtil(secure);
	}

	private void getRandomGUIDUtil(boolean secure) {
		MessageDigest md5 = null;
		StringBuffer sbValueBeforeMD5 = new StringBuffer(128);
		try {
			md5 = MessageDigest.getInstance("MD5");
		} catch (NoSuchAlgorithmException e) {
			this.logger.error("Error: " + e);
		}
		try {
			long time = System.currentTimeMillis();
			long rand = 0L;

			if (secure)
				rand = mySecureRand.nextLong();
			else {
				rand = myRand.nextLong();
			}
			sbValueBeforeMD5.append(s_id);
			sbValueBeforeMD5.append(":");
			sbValueBeforeMD5.append(Long.toString(time));
			sbValueBeforeMD5.append(":");
			sbValueBeforeMD5.append(Long.toString(rand));

			this.valueBeforeMD5 = sbValueBeforeMD5.toString();
			md5.update(this.valueBeforeMD5.getBytes());

			byte[] array = md5.digest();
			StringBuffer sb = new StringBuffer(32);
			for (int j = 0; j < array.length; j++) {
				int b = array[j] & 0xFF;
				if (b < 16) {
					sb.append('0');
				}
				sb.append(Integer.toHexString(b));
			}
			this.valueAfterMD5 = sb.toString();
		} catch (Exception e) {
			this.logger.error("Error:" + e);
		}
	}

	public String toString() {
		String raw = this.valueAfterMD5.toUpperCase();
		StringBuffer sb = new StringBuffer(64);
		sb.append(raw.substring(0, 8));
		sb.append("-");
		sb.append(raw.substring(8, 12));
		sb.append("-");
		sb.append(raw.substring(12, 16));
		sb.append("-");
		sb.append(raw.substring(16, 20));
		sb.append("-");
		sb.append(raw.substring(20));

		return sb.toString();
	}

	public static String getRawGUID() {
		RandomGUIDUtil randomGUID = new RandomGUIDUtil();
		return randomGUID.valueAfterMD5.toUpperCase();
	}

	public static String getGUID() {
		RandomGUIDUtil randomGUID = new RandomGUIDUtil();
		return randomGUID.toString();
	}

	public static String getLastNum() {
		return getRawGUID().substring(0, 11);
	}

	/**
	 * 获取指定位数随机数字
	 * 
	 * @param length
	 * @return
	 */
	public static String randomString(int length) {
		char[] c = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
		String str = "";
		for (int i = 0; i < length; i++) {
			str += c[new Random().nextInt(c.length)];
		}
		return str;
	}

	public static void main(String[] args) {
//    System.out.println(getGUID());
//    System.out.println(getRawGUID());

		System.out.println(getLastNum());

	}
}