package day0403;

import java.util.Arrays;
import java.util.Random;

public class Test1 {

	public static void main(String[] args) {
//		红球33选6
//		蓝球16选1
		//准备红球和蓝球号码数组
		int[] r = zbsz(33);//准备33个红球号码数组
		int[] b = zbsz(16);//准备16个蓝球号码数组
		System.out.println(Arrays.toString(r));
		System.out.println(Arrays.toString(b));
		
		//从红球数组r，选出6个号码
		int [] red = xuanRed(r);
		//从蓝数组b，选出一个号码
		int blue = xuanBlue(b);
		
		System.out.println(Arrays.toString(red));
		System.out.println(blue);

	}

	private static int[] xuanRed(int[] r) {
		/*[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17,
		  18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33]
		 */
		//i循环访问前6个位置
		for(int i = 0;i < 6;i++) {
			int j = new Random().nextInt(33);
			//i和j位置交换
			int t = r[i];
			r[i] = r[j];
			r[j] = t;
		}
		//截取前6个位置，生成一个新的数组
		return Arrays.copyOf(r, 6);
	}

	private static int xuanBlue(int[] b) {
		return b[new Random().nextInt(16)];
		
	}

	private static int[] zbsz(int n) {
		int [] a = new int [n];
		for(int i = 0;i<a.length;i++){
			a[i] = i+1;
		}
		return a;
		
	}

}
