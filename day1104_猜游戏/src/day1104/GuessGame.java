package day1104;

import java.util.ArrayList;
import java.util.Scanner;

public abstract  class GuessGame {
	public void start() {
		//两种游戏的通用流程
		//产生随机值
		String r = suiJi();
		System.out.println("作弊"+r);
		tiShi();
		ArrayList<String> list = new ArrayList<>();
		
		while(true) {
			System.out.println("猜(第"+(list.size()+1)+"次):");
			String c = new Scanner(System.in).nextLine();
			//判断是否猜过
			if(list.contains(c)){
				System.out.println(c+"已经猜过了");
				continue;
			}
			list.add(c);
			//比较c和r，并得到比较的结果
			String result = biJiao(c,r);
			System.out.println(result);
			//判断result是否为猜对的结果
			if(caiDui(result)) {
				break;
				
			}
			
		}
	}

	public abstract String suiJi();

	public abstract void tiShi();

	public abstract String biJiao(String c, String r);

	public abstract boolean caiDui(String result);

}
