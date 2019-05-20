package day0702;

import java.util.Random;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		System.out.println("按回车执行");
		while(true) {
			 new Scanner(System.in).nextLine();
			 int r = new Random().nextInt(4);
			 
			 switch(r) {
			 case 0:
				 System.out.println("抽象父类不能创建对象");
				 	break;
			 case 1:f(new Line());break;
			 case 2:f(new Square());break;
			 case 3:f(new Circle());break;
			 
			 }
			
			 
			 
			 
			 
		}
	}

	private static void f(Shape shape) {
		//向上转型后，只能调用父类定义的的通用成员
		//子类特有的成员不呢个调用
		//shape.length();
		//判断shape所引用的类型是line
		if(shape instanceof Line){
		//对Line类型要进行特殊处理
		//向下转回来，再处理
		Line line = (Line)shape;
		line.length();
		}
		shape.draw();
		new Scanner(System.in).nextLine();
		shape.clear();
		
	}

}
