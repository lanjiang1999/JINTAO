package practice;

public class Demo01 {
	// continue��break������
	public static void main(String[] args) {
		int j = 8;
		for (int i = 0; i <= 10; i++) {
			// j = j + i;
			if (i == j)
				continue;// 1+2+3+4+5

			System.out.println(i);
		}
		System.out.println();
		// ��1-100�ڵ�������
		int sum = 0;
		for (int a = 1; a <= 99; a += 2) {
			sum += a;
		}
		System.out.println(sum);
		System.out.println();

		// ���1~100��ǰ������Ա����������� ���101~��200�ڵ�����
		int d = 1; //
		int e = 0; // ���ڼ���
		while (d <= 100) {
			if (d % 3 == 0) {
				System.out.println(d);
				e ++;
				if (e == 5) {
					break;
				}
			}
			d ++; //12
		}

	}

}
