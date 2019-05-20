package day0502;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		System.out.println("输入整数n，求n内质数的数量");
		int n = new Scanner(System.in).nextInt();
		int count = f(n);
		System.out.println(count);
	}

	private static int f(int n) {
		if(n == 2){
			return 1;
		}
		if(n < 2){
			return 0;
		}
		//计数变量，有一个已知的质数
		int count = 1;
		//从3到n寻找质数
		outer:
		for(int i = 3;i <= n;i++){					//n = 7   count = 4
			//判断i是不是质数
			//i开方+1
			double max = Math.sqrt(i)+1;
			//从2到max范围，找能把i整除的值
			for(int j = 2;j < max;j++){
				if(i % j == 0){ //i不是质数
					continue outer;
				}
			}
			count ++;
			
		}

		return count;
	}

}
