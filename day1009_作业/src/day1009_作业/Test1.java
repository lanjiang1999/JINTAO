package day1009_��ҵ;

import java.util.Scanner;

public class Test1 {

	private static Object i;

	public static void main(String[] args) {
		 /*�����Ӵ����ֵ�����λ��
		  �����ַ�����abcabcabc
		  ������ҵ��Ӵ���bc
		  1 4 7
		  aaaaaa
		  aaaa
		  0	1 	2
		  aaaaaa
		  a
		  0 1 2 3 4 5
		 abcabcabc
		  |
		  index
		 s.indexOf("c", 6)
		     */
		System.out.println("�����ַ���");
		String s = new Scanner(System.in).nextLine();
		System.out.println("������ҵ��ִ�");
		String c = new Scanner(System.in).nextLine();
		
		String target = getTarget(s,c);
		System.out.println(target);
		
	}

	private static String getTarget(String s,String c) {
		/**
		 * 123456
		 *	c  23
		 */
		int index = 0;
		for(int i = 0;i < s.length();i = index+1) {
			index = s.indexOf(c,i);
			if(index == -1) {
				break;
			}
			System.out.print(index);
		}
		
		return null;
	}

}
