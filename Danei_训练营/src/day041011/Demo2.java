package day041011;

public class Demo2 {

	public static void main(String[] args) {
		/**
		 * 求100到999之间的所有的水仙花数 （百位，十位，各位的立方和加起来等于本身）
		 */

		int a; // 百位
		int b; // 十位
		int c; // 个位
		int h;
		for (int i = 100; i <= 999; i++) {
			a = i / 100;
			b = i / 10 % 10;
			c = i % 10;

			if (a * a * a + b * b * b + c * c * c == i) {
				System.out.println(i);
			}

		}

		// 多次方
		double x = Math.pow(4, 2);//4的2次方
		System.out.println(x);
	}

}
