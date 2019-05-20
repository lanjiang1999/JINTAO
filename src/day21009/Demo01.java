package day21009;

import java.util.Scanner;

public class Demo01 {

	public static void main(String[] args) {
		/**
		 * 猜数字小游戏
		 * 随机生成一个1到1000范围的随机数
		 * 
		 * 提示用户去猜
		 * 获取用户猜的值
		 * 比较
		 * 猜大了，猜小了，猜中了，按0结束游戏
		 */
		//0到1之间的随机数能取到0取不到1
		int num = (int)(Math.random()*1000+1);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入你猜的数字");
		int guess;
		
		do {
			 guess = sc.nextInt();
			if(guess==0) {
				System.out.println("游戏结束");
				break;
			}
			
			if(guess>num) {
				System.out.println("猜大了");
			}else if(guess<num) {
				System.out.println("猜小了");
			}else if(guess==num) {
				System.out.println("猜对了");
				break;
			}
			
		}while(guess!=num);
		sc.close();
		System.out.println();
		
		
		
	}
	
}
