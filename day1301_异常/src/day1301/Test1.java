package day1301;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		while(true) { 
			try {
				f();
				break;
			} catch (ArrayIndexOutOfBoundsException e) {	//下标越界
				System.out.println("输入两个，两个，两个");
			}catch (ArithmeticException e) {				//数学错误 /0
				System.out.println("不能除0");
			}catch (Exception e) {
				System.out.println("出错，请重试");
			}finally{
				System.out.println("-----------------");
			}
		}
	}

	private static void f() {
		/**
		 * 输入两个整数
		 * 334，56
		 * -->["334","64"]
		 * 3345/64
		 */
		System.out.println("输入逗号隔开的两个整数");
		String s = new Scanner(System.in).nextLine();
		String [] a = s.split(",");
		int n1 = Integer.parseInt(a[0]);
		int n2 = Integer.parseInt(a[1]);
		int r = n1/n2;
		System.out.println(r);
		/**
		 * 34,12
		 * 34
		 * sadsadsad,sadsa
		 * 150,0
		 */
	}

}
