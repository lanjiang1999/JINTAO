package day0207;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("��������a��");
		int a = sc.nextInt();
		
		System.out.println("��������b��");
		int b = sc.nextInt();
		
		System.out.println("��������c��");
		int c = sc.nextInt();
		
	/*	int max = a>b?a:b;			//��ȡa��b�е����ֵ�浽
		max = max>c?max:c;			//���»�ȡmax��c�����ֵ�浽max
		System.out.println("���ֵ��"+max);*/
		
		int max = a>b?(a>c?a:c):(b>c?b:c);		//Ƕ��
		System.out.println("���ֵΪ"+max);
	}

}
