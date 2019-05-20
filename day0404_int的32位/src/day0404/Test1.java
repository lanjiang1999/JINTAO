package day0404;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		System.out.println("输入整数");
		int a = new Scanner(System.in).nextInt();
		
		//把a的值传递到binaryString()
		//得到int的32位二进制字符串
		String s = binartString(a);
		System.out.println(s);
	}

	private static String binartString(int a) {
		/**
		 * 00000000 00000000 00000000 00000000
		 */
		//准备一个空字符串
		String s = "";
		//i循环 从0到31
		for(int i = 0;i <= 31;i ++){
			//a和(1<<i)求位与
			//并判断位与的结果是否是0
			if((a & (1<<i)) == 0){
				s = 0 + s;
		}else {
			s = 1 + s;
		}
	}
		return s;

}
}