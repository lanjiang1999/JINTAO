package day1001;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		/**
		 * email
		 * abc@def.com
		 * 提取名字部分abc
		 */
		System.out.println("输入email");
		String e = new Scanner(System.in).nextLine();
		
		String name = getName(e);
		System.out.println(name);
		
	}

	private static String getName(String e) {
		/**
		 * 从参数e中，查找@符号的下表位置存到变量i
		 * 如果没有@符号，返回“格式错误”
		 * 
		 * 从e截取[0,i)部分字串，返回
		 * 
		 */
		e = e.trim();
		int i = e.indexOf("@");
		if(i == -1) {
			return "输入错误";
		}
		return  e.substring(0,i);
	}

}
