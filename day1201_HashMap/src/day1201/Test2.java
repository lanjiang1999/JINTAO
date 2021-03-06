package day1201;

import java.util.HashMap;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		/**
		 * 统计字符串中每个字符出现的次数
		 * 
		 * 
		 * "abaccdcce"
		 * 
		 * 
		 * key value
		 * a	2
		 * b	1
		 * c	4
		 * d	1
		 * e	1
		 */
		System.out.println("输入:");
		String s = new Scanner(System.in).nextLine();
		
		HashMap<Character, Integer> map = new HashMap<>();
		/**
		 * i循环，遍历字符串s
		 * 		取出i位置字符存到变量c
		 * 		从map提取c对应的计数值
		 * 		存到Intgeger变量count
		 * 		如果count是null
		 * 		放入c 和 1
		 * 		否则，放入c和count
		 * 循环结束，打印map
		 */
		for(int i = 0;i < s.length();i++) {
			char c = s.charAt(i);
			//map.get(c);
			Integer count = map.get(c);
			if(count == null) {
				map.put(c, 1);
			}else {
				map.put(c, count+1);
			}
		}
		System.out.println(map);
	}

}
