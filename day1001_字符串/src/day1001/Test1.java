package day1001;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		/**
		 * email
		 * abc@def.com
		 * ��ȡ���ֲ���abc
		 */
		System.out.println("����email");
		String e = new Scanner(System.in).nextLine();
		
		String name = getName(e);
		System.out.println(name);
		
	}

	private static String getName(String e) {
		/**
		 * �Ӳ���e�У�����@���ŵ��±�λ�ô浽����i
		 * ���û��@���ţ����ء���ʽ����
		 * 
		 * ��e��ȡ[0,i)�����ִ�������
		 * 
		 */
		e = e.trim();
		int i = e.indexOf("@");
		if(i == -1) {
			return "�������";
		}
		return  e.substring(0,i);
	}

}
