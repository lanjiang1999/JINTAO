package day1104;

import java.util.Arrays;
import java.util.Random;

public class GuessLetterGame extends GuessGame{

	@Override
	public String suiJi() {
		StringBuilder sb = new StringBuilder("ABCDEFGHJKLMNOPQRSTUVWXYZ");
		for(int i = 0;i < 5;i++) {
		int j = new Random().nextInt(26);
		char t = sb.charAt(i);
		sb.setCharAt(i, sb.charAt(j));
		sb.setCharAt(j, t);
		}
		sb.delete(5, 26);
		System.out.println(sb);
		return sb.toString();
	}

	@Override
	public void tiShi() {
		System.out.println("已经产生了5个不重复的大写字母");
		System.out.println("请猜这5个字母");
	}

	@Override
	public String biJiao(String c, String r) {
		//两个计数变量
		int a = 0;
		int b = 0;
		for(int i = 0;i < 5;i++) {			//遍历c字符串
			for(int j = 0;j < 5;j++) {		//遍历r字符串
				//比较i位置字符和j位置字符
				if(c.charAt(i) == r.charAt(j)) {
					if(i == j) {		//比较i和j下标
						a++;
					}else {
						b++;
					}
					break;
				}
				
				
			}
			
		}
		return a+"A"+b+"B";
	}

	@Override
	public boolean caiDui(String result) {
		return "5A0B".equals(result);
	}
	

}
