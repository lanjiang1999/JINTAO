package day0502;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		//判断n是否是质数
		//从2到n开方加1，寻找能被n整除的数，找到则n不是质数，找不到则n是质数
		System.out.println("输入整数");
		int a = new Scanner(System.in).nextInt();
		
		if(isPrime(a)){
			System.out.println("是质数");
		}else {
			System.out.println("不是质数");
		}
	}

	private static boolean isPrime(int a) {
		if(a == 2){
			return true;
		}
		if(a < 2){
			return false;
		}
		//定义b 存储a开方+1的值
		double b = Math.sqrt(a)+1;
		//循环从2到 （n开方加1）
		for(int  i = 2;i < b;i++ ){
			if(a % i ==0){
				return false;
			}
			
		}
		return true;
	}

}
