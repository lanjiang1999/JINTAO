package day1201;

import java.util.HashMap;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		/**
		 * ͳ���ַ�����ÿ���ַ����ֵĴ���
		 * 
		 * 
		 * "abaccdcce"
		 * 
		 * 
		 * key value
		 * a	2
		 * b	1
		 * c	4
		 * d	1
		 * e	1
		 */
		System.out.println("����:");
		String s = new Scanner(System.in).nextLine();
		
		HashMap<Character, Integer> map = new HashMap<>();
		/**
		 * iѭ���������ַ���s
		 * 		ȡ��iλ���ַ��浽����c
		 * 		��map��ȡc��Ӧ�ļ���ֵ
		 * 		�浽Intgeger����count
		 * 		���count��null
		 * 		����c �� 1
		 * 		���򣬷���c��count
		 * ѭ����������ӡmap
		 */
		for(int i = 0;i < s.length();i++) {
			char c = s.charAt(i);
			//map.get(c);
			Integer count = map.get(c);
			if(count == null) {
				map.put(c, 1);
			}else {
				map.put(c, count+1);
			}
		}
		System.out.println(map);
	}

}