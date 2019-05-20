package day011008;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class Demo06 {
	public static void main(String[] args) {
		/**
		 * 基本类型装换:
		 * 1.自动类型转化:小类型到大类型可以自动完成
		 * 2.强制类型转化:大类型到小类型需要强制转换符
		 * byte short char int long float double
		 */
		int a = 100,b=200;
		long c = a+b;
		
		long x = 1024;
		int y =(int)x;
		System.out.println(y);
		
		float n = (float)3.14;
		
		
		double a1 = 80/100;
		//当大类型和小类型同时运算，结果转化为大类型
		double a2 = 80.0/100;
		System.out.println("a1="+a1);
		System.out.println("a2="+a2);	
		
		
		
		
		
		
		
	}
}
