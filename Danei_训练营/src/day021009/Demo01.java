package day021009;

public class Demo01 {

	public static void main(String[] args) {
		/**
		 * 算数运算符: (+)(-)(*)(/) 取模运算(%) 自增(++)自减(--)
		 */
		System.out.println(8 % 3);// 整除

		int a = 2;
		a--;// 单独使用写在前后没有区别
		System.out.println("a=" + a);

		int c1 = 4, c2 = 6;
		int d1 = c1--;// d1=4 c1=3
		int d2 = ++c2;// c2=7 d2=7
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(d1);
		System.out.println(d2);

		int i = 5;
		System.out.println("i=" + i++);
		System.out.println(i);

		int n = 10;
		boolean m = ++n > 10;
		System.out.println(m);
		System.out.println(n);

	}

}