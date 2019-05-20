package day1004;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		/**
		 * "\n"换行
		 * "\t"制表符
		 * \ java的转移运算符   转义字符
		 */
		System.out.println("\\");
		System.out.println("\\\\");
		System.out.println("\\d");
		System.out.println("\n------------");
		
		
		System.out.println("输入身份证号:");
		String id = new Scanner(System.in).nextLine();
		System.out.println("输入固定电话:");
		String tel = new Scanner(System.in).nextLine();

		if(f1(id)) {
			System.out.println("身份证格式正确");
		}else {
			System.out.println("身份证格式错误");
		}
		if(f2(tel)) {
			System.out.println("电话格式正确");
		}else {
			System.out.println("电话格式错误");
		}
		
		
	}

	private static boolean f1(String id) {
		/**
		 * 123456789012345
		 * 123456789012345678
		 * 12345678901234567x
		 * \d{15}
		 * \d{15}|\d{17}
		 * \d{15}|\d{17}[\dxX]
		 */
		String regex = "\\d{15}|\\d{17}[\\dxX]";
		//参数id，能否匹配正则表达式regex
		return id.matches(regex);
	}

	private static boolean f2(String tel) {
		/**	
		 * 	
		 * 
		 */
		String regex = "(\\d{3,4}-|\\(\\d{3,4}\\))?\\d{7,8}";
		
		return tel.matches(regex);
	}

}
