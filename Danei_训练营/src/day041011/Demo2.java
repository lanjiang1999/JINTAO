package day041011;

public class Demo2 {

	public static void main(String[] args) {
		/**
		 * ��100��999֮������е�ˮ�ɻ��� ����λ��ʮλ����λ�������ͼ��������ڱ���
		 */

		int a; // ��λ
		int b; // ʮλ
		int c; // ��λ
		int h;
		for (int i = 100; i <= 999; i++) {
			a = i / 100;
			b = i / 10 % 10;
			c = i % 10;

			if (a * a * a + b * b * b + c * c * c == i) {
				System.out.println(i);
			}

		}

		// ��η�
		double x = Math.pow(4, 2);//4��2�η�
		System.out.println(x);
	}

}
