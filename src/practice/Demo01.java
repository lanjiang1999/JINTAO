package practice;

public class Demo01 {
	// continue与break的区别
	public static void main(String[] args) {
		int j = 8;
		for (int i = 0; i <= 10; i++) {
			// j = j + i;
			if (i == j)
				continue;// 1+2+3+4+5

			System.out.println(i);
		}
		System.out.println();
		// 求1-100内的奇数和
		int sum = 0;
		for (int a = 1; a <= 99; a += 2) {
			sum += a;
		}
		System.out.println(sum);
		System.out.println();

		// 输出1~100内前五个可以被三整除的数 输出101~·200内的质数
		int d = 1; //
		int e = 0; // 用于计数
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
