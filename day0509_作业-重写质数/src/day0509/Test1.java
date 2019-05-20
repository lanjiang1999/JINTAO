package day0509;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		//判断n是否是质数
		//从2到n开方加1，寻找能被n整除的数，找到则n不是质数，找不到则n是质数
		
		System.out.println("输入一个整数，判断是否为质数");
		int n = new Scanner(System.in).nextInt();
		
		if(isPrime(n)){
			System.out.println(n+"是质数");
		}else {
			System.out.println(n+"不是质数");
		}
	}

	private static boolean isPrime(int n) {
		if(n == 2){
			return true;
		}
		if(n < 2){
			return false;
		}
		double max =  Math.sqrt(n)+1;
		for(int  i = 2;i < max;i++){
			if(n % i == 0){
				return false;
			}
			
		}
		return true;
	}

}
