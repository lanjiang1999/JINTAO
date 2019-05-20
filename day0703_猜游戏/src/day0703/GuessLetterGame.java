package day0703;

import java.util.Random;

public class GuessLetterGame extends GuessGame{

	@Override
	public String suiJi() {
		String[] a = new String []{"A","B","C","D","E","F","G","H","I",
							"J","K","L","M","N","O","P","Q","R",
							"S","T","U","V","W","X","Y","Z"};
		String  b = null;
		for(int i = 0;i < 5;i++) {
			int j = new Random().nextInt(26);
			b = b+a[i];
			
		}
		// TODO:稍后再完成
		return b;
	}

	@Override
	public void tiShi() {
		System.out.println("已经产生了5个不重复的大写字母");
		System.out.println("请猜这5个字母");
	}

	@Override
	public String biJiao(String c, String r) {
		// TODO:稍后再完成
		return "2A2B";
	}

	@Override
	public boolean caiDui(String result) {
		return "5A0B".equals(result);
	}
	

}
