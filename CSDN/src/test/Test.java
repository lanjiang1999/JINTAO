package test;

import java.util.Scanner;

public class Test{
	public static void main(String[] args) {
		System.out.println("输入一个数字n来判断数组内是否有两个数相加等于n");
		boolean c;
		int n = new Scanner(System.in).nextInt();
		int [] a = new int [] {11,15,6,8,9,10};
		for(int i = 0;i < a.length; i ++) {
			for(int j = i+1;j < a.length-1;j++) {
				if(a[i] + a[j] == n) {
					c = true;
				}else {
					c = false;
				}
				System.out.println(c);
			}
			
		}
	}
}

