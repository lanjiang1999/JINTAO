package day011008;

import java.util.Scanner;

public class Demo05 {

	public static void main(String[] args) {
		//String�ַ�������
		String a = "������������";
		System.out.println(a);
		int n = 1;
		System.out.println("n="+n);
		int h = a.length();
		System.out.println(h);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ������:");
		String k = sc.next();//��ȡ�ַ���
		k=k.replaceAll("SB", "**");//�ַ����滻
		System.out.println(k);
		sc.close();
		
		
		
		
		
		
	}

}