package day011008;

public class Demo02 {
	public static void main(String[] args) {
		/**
		 * 基本数据类型:(整数)
		 * byte:-128~127
		 * short:-32768~32767
		 * int:-2147483648~2147483647
		 * long:
		 */
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		System.out.println(Short.MAX_VALUE);
		
//		int a1 = 3.14;类型不对
//		int a2 = 10000000000;超范围
		int a3 = 5;
		int a4 = 2;
		//运算结果保留整数
		System.out.println(a3/a4);
		System.out.println(a4/a3*100);//0
		System.out.println(100*a4/a3);//40
		
		//溢出
		int a = 2147483647;
		int b = -2147483648;
		a = a+1;
		b = b-1;
		System.out.println(a);
		System.out.println(b);
		
		
		//整型直接量:直接出现的整数类型是int
		long n = 10000000000L;
		System.out.println(n);
		
		
		
		
	}
}
