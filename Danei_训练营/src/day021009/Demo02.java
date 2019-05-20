package day021009;

import java.util.Scanner;

public class Demo02 {

	public static void main(String[] args) {
		/**
		 * 关系运算符: (>)(>=)(<)(<=) 等于(==)不等(!=)
		 */
		int max = 10;
		int num = 9;
		boolean a1 = max >= 10;// true
		boolean a2 = max % 2 == 1;// false
		boolean a3 = num / max != 0;// false

		/**
		 * 逻辑运算符: 逻辑运算建立在关系运算基础之上，当多个条件 需要兼顾考虑可以使用，逻辑运算符包括 与(&&)或(||)非(!)
		 */

		int score = 80;
		// 所有条件都成立，最终结果成立
		boolean b1 = score > 10 && score < 100;
		System.out.println(b1);

		boolean f = false;
		int n = 200;
		// 或:成立任意一个条件，最终结果成立
		boolean m = f || (n > 10 && n <= 200);
		System.out.println(m);

		int s = 4;
		boolean u = s < 10;
		System.out.println(!u);

//逻辑短路:当第一个表达式就能决定最终结果时，后面将不会执行
		int i = 100, j = 200;
		boolean c1 = (i > j) && (++i > 100);
		System.out.println(c1);
		System.out.println(i);
		boolean c2 = j > 0 || (++j > 200);
		System.out.println(c2);
		System.out.println(j);

		/**
		 * 练习: 根据用户输入的年龄判断该年龄 是否在18到30之间 是则输出true不是则输出false
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入年龄:");
		int age = sc.nextInt();
		boolean p = age > 18 && age < 30;
		System.out.println(p);

	}
}
