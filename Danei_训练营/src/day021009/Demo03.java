package day021009;

import java.util.Scanner;

public class Demo03 {

	public static void main(String[] args) {
		/**
		 * ��������:
		 * �ṹ����:
		 * boolean���ʽ?���ʽ1:���ʽ2;
		 * 1.�����ж�boolean���ʽ
		 * 2.������ִ�б��ʽ1
		 * 3.��������ִ�б��ʽ2
		 */
		int a = 30;
		int b = a>10?1:2;
		System.out.println(b);
		
		int age = 10;
		String r = age>=18?"������":"δ����";
		System.out.println(r);
		
		int c = -3;
		String c1 = c>0?"����":(c==0?"0":"����");
		System.out.println(c1);
		
		/**
		 * �����жϳ���:
		 * �û�����һ����ݣ������жϸ�����Ƿ�Ϊ����
		 * 
		 * 1.�ܱ�4�������ܱ�100����
		 * 2.�ܱ�400����
		 */
		Scanner sc = new Scanner(System.in);
//		System.out.println("������һ�����:");
//		int year = sc.nextInt();
//		boolean n =(year%4==0&&year%100!=0)||
//										(year%400==0);
//		String s = n?"������":"��������";
//		System.out.println(s);
		/**
		 * ��������ϵͳ:
		 * �������� 
		 * ����ʱ�� 
		 * ���ɽ�� 
		 * 
		 * �ܼۺ����� 
		 */
		System.out.println("��������:");
		double price = sc.nextDouble();
		System.out.println("����ʱ��:");
		double hour = sc.nextDouble();
		System.out.println("���ɽ��:");
		double money = sc.nextDouble();
		
		double totalPrice = price * hour;//������
		double change = money-totalPrice;//����
		
		System.out.println("������Ϊ:"+totalPrice);
		System.out.println("����Ϊ:"+change);
		
		
		
	}
}





