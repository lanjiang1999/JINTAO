package test;

import java.util.Scanner;

public class Test{
	public static void main(String[] args) {
		System.out.println("����һ������n���ж��������Ƿ�����������ӵ���n");
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

