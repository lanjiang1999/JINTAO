package day0401;

import java.util.Scanner;

public class Test1 {
		static String[] names = {"肾xs","华为Mate20","荣耀Magic2","小米Mix3","Vivo NEX"};
		static double[] price = {7777,6666,5555,4444,3333};
		static int [] numbers = {10,20,30,40,50};
		
	public static void main(String[] args) {
		/**
		 * -------------
		 * 1.商品列表
		 * 2.商品录入
		 * 3.商品查询
		 * 4.统计信息
		 * 5.退出
		 */	
		outer:		//循环命名
		while(true){
			menu();
			int c = new Scanner(System.in).nextInt();
			
			switch(c){
			case 1: f1();break;
			case 2: f2();break;
			case 3: f3();break;
			case 4: f4();break;
			case 5: break outer;  //中断名字叫outer的循环
				
			
			}
			
		}
	}

	private static void menu() {
		System.out.println("-------------");
		System.out.println("1.商品列表");
		System.out.println("2.商品录入");
		System.out.println("3.商品查询");
		System.out.println("4.统计信息");
		System.out.println("5.退出");
		System.out.println("-------------");
		System.out.println("选择：");
	}
	//1.商品列表
	private static void f1() {
		/**
		 * 
		 */
		for(int i = 0;i <names.length;i ++){
			String n = names[i];
			double p = price[i];
			int  b = numbers[i];
			System.out.println(
			(i+1)+".名称: "+n+",价格"+p+", 数量: "+b);
		}
	}
	//2.商品录入
	private static void f2() {
		 for(int i = 0;i < names.length;i++){
			 System.out.println("录入第"+(i+1)+"件商品");
			 System.out.print("名称:");
			 String n = new Scanner(System.in).nextLine();
			 System.out.print("价格:");
			 double p = new Scanner(System.in).nextDouble();
			 System.out.print("数量:");
			 int b = new Scanner(System.in).nextInt();
			 names[i] = n;
			 price[i] = p;
			 numbers[i] = b;
		 }
		 //重新显示列表
		 f1();
	}
	//3.商品查询
	private static void f3() {
		System.out.println("输入查询的商品名称");
		String t = new Scanner(System.in).nextLine();
		for(int i = 0;i < names.length;i++){
			//t和names[i]是否相等
			//比较字符串是否相等，用equals()方法
			if(t.equals(names[i])){
				String n = names[i];
				double p = price[i];
				int b = numbers[i];
				System.out.println(
				(i+1)+".名称: "+n+",价格"+p+", 数量: "+b	);
				return;
			}
		}
		System.out.println("找不到此商品");

	}
	//4.统计信息
	private static void f4() {
		/**
		 * 	商品总价
		 * 	单价均价
		 * 	最高总价
		 * 	最高单价
		 */
		double spzj = 0;//商品总价
		double djzj = 0;//单价总价
		double zgzj = 0;//最高总价
		double zgdj = 0;//最高单价
		
		for(int i = 0;i < names.length;i++) {
			spzj += price[i]*numbers[i];
			djzj += price[i];
			if(price[i]*numbers[i] > zgzj){
				zgzj = price[i]*numbers[i];
			}
			if(price[i] > zgdj){
				zgdj = price[i];
			}	
		}
		System.out.println("商品总价"+spzj);
		System.out.println("单价均价"+(djzj/names.length));
		System.out.println("最高总价"+zgzj);
		System.out.println("最高单价"+zgdj);
		
		
	}

}
