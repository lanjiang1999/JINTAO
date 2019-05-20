package day0509;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		System.out.println("输入整数n，求n内的质数数量");
		int n = new Scanner(System.in).nextInt();
		
		int count =f(n);
		System.out.println(count);
	}

	private static int f(int n) {
		if(n == 2){
			return 1;
		}
		if(n < 2){
			return 0;
		}
		
		int count = 1;
		outer:
		for(int i = 3;i <= n;i++) {
			double max = Math.sqrt(i)+1;
			for(int j = 2;j < max;j++  ){
				if(i % j == 0){
					continue outer;
				}
			}
			count ++;
		}
		return count;
	}

}
