package day1501;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class Test1 {
	public static void main(String[] args) throws Exception {
		String s = "abc���Ć��F";
		System.out.println(s);
		
		byte[] a;
		a = f(s, null);
		System.out.println(Arrays.toString(a));
		a = f(s, "GBK");
		System.out.println(Arrays.toString(a));
		a = f(s, "GB2312");
		System.out.println(Arrays.toString(a));
		a = f(s, "UTF-8");
		System.out.println(Arrays.toString(a));  
	}

	/*
	 * �ַ����� encoding
	 * �ַ��� charset
	 */
	private static byte[] f(
			String s, String charset) throws Exception {
		if(charset == null) {
			return s.getBytes();
		} else {
			return s.getBytes(charset);
		}
	}
}




