package day011008;

public class Demo03 {
	public static void main(String[] args) {
		
		double a = 3.14;
		float b = 1.1F;//极少使用
		
		System.out.println(Double.MAX_VALUE);
		//1.25E3: 1.25乘以10的3次方
		
		//舍入误差
		double a1 = 3.0;
		double a2 = 2.9;
		System.out.println(a1-a2);

		
	
		
		
		
		
		//字符类型char
		//unicode编码:
		char b1 = '中';
		char b2 = '\u4e2d';
		System.out.println(b1);
		System.out.println(b2);
		
		int c1 = b1;
		System.out.println(c1);
		
		char c2 = 'p';
		char c3 = '犇';
		char c4 = '&';
		char c5 = ' ';
//		char c6 = '你好';只能存储单个字符
//		char c7 = '';不能为空
//		char c8 = 中;没有单引号
		//转义字符:\
		char c9 = '\'';
		char c10 = '\\';
		System.out.println(c10);
		
	}
}