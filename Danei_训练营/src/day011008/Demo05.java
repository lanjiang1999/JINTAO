package day011008;

import java.util.Scanner;

public class Demo05 {

	public static void main(String[] args) {
		//String字符串类型
		String a = "今天天气不错";
		System.out.println(a);
		int n = 1;
		System.out.println("n="+n);
		int h = a.length();
		System.out.println(h);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一段文字:");
		String k = sc.next();//获取字符串
		k=k.replaceAll("SB", "**");//字符串替换
		System.out.println(k);
		sc.close();
		
		
		
		
		
		
	}

}