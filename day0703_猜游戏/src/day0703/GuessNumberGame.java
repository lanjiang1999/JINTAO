package day0703;

import java.util.Random;


public class GuessNumberGame extends GuessGame{

	@Override
	public String suiJi() {
		int r = 1 + new Random().nextInt(1000);
		//把整数，变成字符串类型
		return String.valueOf(r);
	}

	@Override
	public void tiShi() {
		System.out.println("已经随机产生了一个[1,1001)范围的整数");
		System.out.println("请猜这个数是几");
	}

	@Override
	public String biJiao(String c, String r) {
		//字符串解析成int
		int cc = Integer.parseInt(c);	//c	用户猜的值
		int rr = Integer.parseInt(r);	//r 随机产生的值
		if(cc > rr) {
			return "大";
		}else if(cc < rr) {
			return "小";
		}else {
			return "对";
		}
	}

	@Override
	public boolean caiDui(String result) {
		return "对".equals(result);
	}


}
