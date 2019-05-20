package day31010;

import java.util.Scanner;

public class Demo07 {

	public static void main(String[] args) {
		/**
		 * 猜数字小游戏 随机生成一个1到1000范围的随机数
		 * 
		 * 提示用户去猜 比较: 猜大了 猜小了 猜对了 按0结束
		 */

		// 0到1之间的随机小数，能取到0但取不到1
		Scanner sc = new Scanner(System.in);
		int num = (int) (Math.random() * 1000 + 1);// 乘以1000，+1后0-1000.999
		int a;
		int i = 0;

		do {
			System.out.println("请输入你猜的数字");
			a = sc.nextInt();
			if (a > num) {
				System.out.println("你猜大了");
			} else if (a == num) {
				System.out.println("你猜对了");
			} else if (a == 0) {
				System.out.println("游戏结束");
				break;
			} else {
				System.out.println("你猜小了");
			}
			i++;
			System.out.println("zuobi" + num);
		} while (a != num);
		
		System.out.println("猜了" + i + "次");

	}
}
