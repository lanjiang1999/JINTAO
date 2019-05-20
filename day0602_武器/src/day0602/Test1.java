package day0602;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		//新建AK47对象
		//把内存地址，存到变量a
		 AK47 a = new AK47();
		 AK47 b = new AK47();
		 
		 System.out.println("按回车进攻");
		 System.out.println("输入a，装载a枪");
		 System.out.println("输入b，装载b枪");
		 
		 while(true){
			String s = new Scanner(System.in).nextLine();
			if(s.equals("a")) {
				a.load();
				continue;
				}else if(s.equals("b")) {
					b.load();
					continue;
				}
			System.out.println("a枪发射");
			a.fire();
			System.out.println("b枪发射");
			b.fire();
			System.out.println("-----------");
			
			
			
			 
		 }
	}

}
