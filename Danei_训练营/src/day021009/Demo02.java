package day021009;

import java.util.Scanner;

public class Demo02 {

	public static void main(String[] args) {
		/**
		 * ��ϵ�����: (>)(>=)(<)(<=) ����(==)����(!=)
		 */
		int max = 10;
		int num = 9;
		boolean a1 = max >= 10;// true
		boolean a2 = max % 2 == 1;// false
		boolean a3 = num / max != 0;// false

		/**
		 * �߼������: �߼����㽨���ڹ�ϵ�������֮�ϣ���������� ��Ҫ��˿��ǿ���ʹ�ã��߼���������� ��(&&)��(||)��(!)
		 */

		int score = 80;
		// �������������������ս������
		boolean b1 = score > 10 && score < 100;
		System.out.println(b1);

		boolean f = false;
		int n = 200;
		// ��:��������һ�����������ս������
		boolean m = f || (n > 10 && n <= 200);
		System.out.println(m);

		int s = 4;
		boolean u = s < 10;
		System.out.println(!u);

//�߼���·:����һ�����ʽ���ܾ������ս��ʱ�����潫����ִ��
		int i = 100, j = 200;
		boolean c1 = (i > j) && (++i > 100);
		System.out.println(c1);
		System.out.println(i);
		boolean c2 = j > 0 || (++j > 200);
		System.out.println(c2);
		System.out.println(j);

		/**
		 * ��ϰ: �����û�����������жϸ����� �Ƿ���18��30֮�� �������true���������false
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("����������:");
		int age = sc.nextInt();
		boolean p = age > 18 && age < 30;
		System.out.println(p);

	}
}
