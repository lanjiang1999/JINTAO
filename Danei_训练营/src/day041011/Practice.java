package day041011;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {

		/**
		 * 练习: 使用while循环做出猜数字小游戏
		 */
		Scanner sc = new Scanner(System.in);
		int num = (int) (Math.random() * 1000 + 1);// 乘以1000，+1后0-1000.999
		System.out.println("作弊" + num);
		System.out.println("输入猜的数字");
		int guess = sc.nextInt();

		while (guess != num) {
			if (guess == 0) {
				System.out.println("游戏结束");
				break;
			} else if (guess < num) {
				System.out.println("猜小了");
			} else if (guess > num) {
				System.out.println("猜大了");
			}
			System.out.println("继续猜");
			guess = sc.nextInt();
		}

		if (guess == num) {
			System.out.println("猜对了");

		}
		sc.close();

	}

}
