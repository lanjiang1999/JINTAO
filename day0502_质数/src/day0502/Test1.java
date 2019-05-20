package day0502;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		//判断n是否是质数
		//从2到n开方加1，寻找能被n整除的数，找到则n不是质数，找不到则n是质数
		System.out.println("输入整数");
		int n = new Scanner(System.in).nextInt();
		
		if(isPrime(n)) {
			System.out.println("是质数");
			
		}else {
			System.out.println("不是质数");
		}
	}

	private static boolean isPrime(int n) {
		if(n == 2){
			return true;
		}
		if(n < 2){
			return false;
			
		}
		//求n开方+1
		double max = Math.sqrt(n)+1;
		//在2到max范围，找到把n整除的值
		for(int i = 2;i < max;i++) {
			if(n % i == 0){
				//不是质数
				return false;
			}
			
		}
		return true;//n是质数
	}

}
