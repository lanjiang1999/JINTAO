package day41011;

import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
		/**
		 * ����ӷ������� ��������1��100������� ������û� �û������� ��Լ�ʮ�� ��� ��0����
		 */
		Scanner sc = new Scanner(System.in);
		int sum;// ��ȷ��
		int answer;// �û������
		int score = 0;
		for (int i = 1; i <= 10; i++) {// iΪ�������
			int num1 = (int) (Math.random() * 100 + 1);
			int num2 = (int) (Math.random() * 100 + 1);
			System.out.println("��" + i + "��" + "." + num1 + "+" + num2 + "=");

			answer = sc.nextInt();
			sum = num1 + num2;
			if (answer == sum) {
				score = score + 10;
				System.out.println("��ϲ������+10��");
			} else if (answer == 0) {
				System.out.println("��Ϸ����");
				break;
			} else {
				System.out.println("�����");
			}
		}
		System.out.println("�ܹ��÷�" + score);

	}

}
