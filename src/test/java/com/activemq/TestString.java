/**
 * 
 */
package com.activemq;

import java.net.URLDecoder;
import java.net.URLEncoder;

/**
 * @author zhengyi
 * 2014年1月22日
 */
public class TestString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String bb=new String("%7B%22amt%22%3A%225000%22%2C%22cardno%22%3A%2213976080199437934%22%2C%22accesstype%22%3A%22C%22%2C%22cardtype%22%3A%220203%22%2C%22paytype%22%3A%220203%22%2C%22continuebettype%22%3A%22%22%2C%22orderid%22%3A%22%22%2C%22subchannel%22%3A%2200092493%22%2C%22channel%22%3A%222%22%2C%22userno%22%3A%2200000610%22%2C%22bankid%22%3A%22gyj001%22%2C%22card_no%22%3A%2213976080199437934%22%2C%22card_pwd%22%3A%22081928715200797023%22%2C%22totalAmount%22%3A%225000%22%7D");
		System.out.println(URLDecoder.decode(bb));
	}

}
