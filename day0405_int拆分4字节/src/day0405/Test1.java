package day0405;

import java.util.Arrays;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		System.out.println("输入一个整数");
		int n = new Scanner(System.in).nextInt();
		//把n的值，传递到chaiFen()方法
		//拆分成4个byte值，存入一个数组
		byte [] a = chaiFen(n);
		System.out.println("字节拆分后存入一个数组 "+Arrays.toString(a));
		System.out.println("\n\n---------");
		//把a数组中的4个字节合并成int整数
		int t = heBing(a);
		System.out.println("合并后 "+t);
	}

	private static int heBing(byte[] a) {
		//保存结果的变量a
		int r =0;
		//数组中的字节值
		//与0x000000ff 求位与，把左侧24位抹成0
		//再向左移动24,16,8,0
		//再与r求位或，结果保存到r
		
		r = r | ((a[0]&0x000000ff) << 24);
		r = r | ((a[1]&0x000000ff) << 16);
		r = r | ((a[2]&0x000000ff) << 8);
		r = r | ((a[3]&0x000000ff) << 0);
		return r;
	}

	private static byte[] chaiFen(int n) {
		//新建byte[]数组，用来存放4个字节
		byte [] a = new byte [4];
		//n右移24,16,8,0位，再强转成byte
		a [0] = (byte) (n>>24);
		a [1] = (byte) (n>>16);
		a [2] = (byte) (n>>8);
		a [3] = (byte) (n>>0);
		return a;
	}

}
