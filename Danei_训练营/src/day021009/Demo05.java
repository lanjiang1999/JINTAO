package day021009;

import java.util.Scanner;

public class Demo05 {
	public static void main(String[] args) {
		/**
		 * ��������ϵͳ: �������� ����ʱ�� ���ɽ��
		 * 
		 * ���û����ѳ���100Ԫʱ������� ���û�����Ǯ��ʱ�����ܼۺ����� ���û�����Ǯ����ʱ��ʾ����
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("��������:");
		double price = sc.nextDouble();
		System.out.println("����ʱ��:");
		double hour = sc.nextDouble();
		System.out.println("���ɽ��");
		double money = sc.nextDouble();
		double totalPrice = price * hour;// ������
		if (totalPrice >= 100) {// ����
			totalPrice = totalPrice * 0.8;
		}
		if (money >= totalPrice) {
			double change = money - totalPrice;// ����
			System.out.println("������Ϊ:" + totalPrice);
			System.out.println("����Ϊ:" + change);
		} else {
			System.out.println("����");
		}

	}
}
