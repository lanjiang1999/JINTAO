package day1001;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		/**
		 * 判断一个字符串是否为“回文”
		 *  abcba
		 */
		System.out.println("输入回文");
		String s = new Scanner(System.in).nextLine();
		
		if(huiWen(s)){
			System.out.println("是回文");
		}else {
			System.out.println("不是回文");
			}
	}

	private static boolean huiWen(String s) {
		/**
		 * abcdedcba
		 * i      j
		 * 循环
		 * i = o,j = s.length()-1;i < j;i++,j--
		 * 如果i位置字符与j位置字符不相等
		 * 返回false
		 * 循环结束，返回true
		 */
		for(int i = 0, j = s.length()-1;i <j;i++,j--) {
			if(s.charAt(i) != s.charAt(j)) {
				return false;
			}
		}
		
		return true;
	}

}
