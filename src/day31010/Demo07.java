package day31010;

import java.util.Scanner;

public class Demo07 {

	public static void main(String[] args) {
		/**
		 * ������С��Ϸ �������һ��1��1000��Χ�������
		 * 
		 * ��ʾ�û�ȥ�� �Ƚ�: �´��� ��С�� �¶��� ��0����
		 */

		// 0��1֮������С������ȡ��0��ȡ����1
		Scanner sc = new Scanner(System.in);
		int num = (int) (Math.random() * 1000 + 1);// ����1000��+1��0-1000.999
		int a;
		int i = 0;

		do {
			System.out.println("��������µ�����");
			a = sc.nextInt();
			if (a > num) {
				System.out.println("��´���");
			} else if (a == num) {
				System.out.println("��¶���");
			} else if (a == 0) {
				System.out.println("��Ϸ����");
				break;
			} else {
				System.out.println("���С��");
			}
			i++;
			System.out.println("zuobi" + num);
		} while (a != num);
		
		System.out.println("����" + i + "��");

	}
}
