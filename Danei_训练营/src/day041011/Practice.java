package day041011;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {

		/**
		 * ��ϰ: ʹ��whileѭ������������С��Ϸ
		 */
		Scanner sc = new Scanner(System.in);
		int num = (int) (Math.random() * 1000 + 1);// ����1000��+1��0-1000.999
		System.out.println("����" + num);
		System.out.println("����µ�����");
		int guess = sc.nextInt();

		while (guess != num) {
			if (guess == 0) {
				System.out.println("��Ϸ����");
				break;
			} else if (guess < num) {
				System.out.println("��С��");
			} else if (guess > num) {
				System.out.println("�´���");
			}
			System.out.println("������");
			guess = sc.nextInt();
		}

		if (guess == num) {
			System.out.println("�¶���");

		}
		sc.close();

	}

}
