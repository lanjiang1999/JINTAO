package day1;

public class Demo1 {

	public static void main(String[] args) {

		/*
		 * 算数运算符： （+）（-）（*）（/） 取模运算（%） 自增（++）自减（--）对操作数进行加或减1
		 * 
		 */
		System.out.println(8 % 3);// 取余
		// 前自增（减），先改变后使用
		// 后自增（减），先使用再改变
		int a = 2;
		a--;// 单独使用写在前后没有区别
		System.out.println("a=" + a);

		int c1 = 4, c2 = 6;
		int d1 = c1--;
		int d2 = ++c2;
		System.out.println("c1=" + c1);
		System.out.println("c2=" + c2);
		System.out.println("d1=" + d1);
		System.out.println("d2=" + d2);

		int x = 10, y = 20;
		int x1 = x++;// x1 = 10,x=11
		int y1 = --y;// y1 = 19,y=19
		System.out.println("x=" + x);
		System.out.println("y=" + y);
		System.out.println("x1=" + x1);
		System.out.println("y1=" + y1);

		int i = 5;
		System.out.println("i=" + i++);// 先输出i=5，i自增为6
		System.out.println("i=" + i);// 此时输出i为6

		System.out.println("i=" + i++);// 先输出

			for(int u = 1;u<=9;u++) {
				for(int k = 1;k<=u;k++) {
					
					System.out.print(" "+k+"*"+u+"="+u*k);
				}
				System.out.println();
			}
			
	}

}
