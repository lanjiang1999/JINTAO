package day41011;

import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
		/**
		 * 随机加法运算器 产生两个1到100的随机数 出题给用户 用户计算结果 答对加十分 答错 按0结束
		 */
		Scanner sc = new Scanner(System.in);
		int sum;// 正确答案
		int answer;// 用户输入答案
		int score = 0;
		for (int i = 1; i <= 10; i++) {// i为答题次数
			int num1 = (int) (Math.random() * 100 + 1);
			int num2 = (int) (Math.random() * 100 + 1);
			System.out.println("第" + i + "题" + "." + num1 + "+" + num2 + "=");

			answer = sc.nextInt();
			sum = num1 + num2;
			if (answer == sum) {
				score = score + 10;
				System.out.println("恭喜你答对了+10分");
			} else if (answer == 0) {
				System.out.println("游戏结束");
				break;
			} else {
				System.out.println("答错了");
			}
		}
		System.out.println("总共得分" + score);

	}

}
