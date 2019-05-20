package day0404;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		System.out.println("输入二进制数");
		String s = new Scanner(System.in).nextLine();
		//如果s的长度超过32位，结束，不处理
		if(s.length() > 32){
			System.out.println("不能超过32位");
			return;
		}
		
		//10111--> 23
		int a = binaryStringToInt(s);
		System.out.println(a);
	}

	private static int binaryStringToInt(String s) {
		/**
		 * 	
		 */
		//保存结果的整数变量r,从0开始
		
		int r = 0;
		
		//遍历字符串s
		for(int i = 0;i < s.length();i ++){
			//从s提取i位置的字符
			char c = s.charAt(i);
			if(c == '1'){
				//移动位数
				int w = s.length()-i-1;
				//int中对应的位置成1
				r = (1<<w) | r;
			}
			
		}
		return r;
	}

}
