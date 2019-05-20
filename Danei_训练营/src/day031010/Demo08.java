package day031010;

public class Demo08 {

	public static void main(String[] args) {
		/**
		 * for(表达式1；表达式2；表达式3){ 循环语句； }
		 * 
		 * 1.表达式1为循环变量初始值 2.表达式2为循环条件 3.表达式3为循环变量的更新
		 */
		for (int a = 1; a < 10; a++) {
			System.out.println(a);
			if (a == 5) {
				break;
			}
		}

		// 1 3 5 7 ....99
		System.out.println("000000000000000000000");
		for (int i = 1; i < 100; i = i + 2) {
			System.out.println(i);
		}

		// 100 98 96...4 2
		System.out.println("000000000000000000000");
		for (int i = 100; i >= 2; i = i - 2) {
			System.out.println(i);
		}
		//练习：
		//计算1+2+3+...100
		System.out.println("0000000000000000000000000000");
		
		int m=0;
		for(int i = 1;i<=100;i++){
			m +=i;
		}
		System.out.println(m);
		
		
		
		

	}
}
