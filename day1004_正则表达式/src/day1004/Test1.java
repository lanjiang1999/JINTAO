package day1004;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		/**
		 * "\n"����
		 * "\t"�Ʊ��
		 * \ java��ת�������   ת���ַ�
		 */
		System.out.println("\\");
		System.out.println("\\\\");
		System.out.println("\\d");
		System.out.println("\n------------");
		
		
		System.out.println("�������֤��:");
		String id = new Scanner(System.in).nextLine();
		System.out.println("����̶��绰:");
		String tel = new Scanner(System.in).nextLine();

		if(f1(id)) {
			System.out.println("���֤��ʽ��ȷ");
		}else {
			System.out.println("���֤��ʽ����");
		}
		if(f2(tel)) {
			System.out.println("�绰��ʽ��ȷ");
		}else {
			System.out.println("�绰��ʽ����");
		}
		
		
	}

	private static boolean f1(String id) {
		/**
		 * 123456789012345
		 * 123456789012345678
		 * 12345678901234567x
		 * \d{15}
		 * \d{15}|\d{17}
		 * \d{15}|\d{17}[\dxX]
		 */
		String regex = "\\d{15}|\\d{17}[\\dxX]";
		//����id���ܷ�ƥ��������ʽregex
		return id.matches(regex);
	}

	private static boolean f2(String tel) {
		/**	
		 * 	
		 * 
		 */
		String regex = "(\\d{3,4}-|\\(\\d{3,4}\\))?\\d{7,8}";
		
		return tel.matches(regex);
	}

}
