package day0509;

import java.util.Arrays;
import java.util.Random;

public class Test1 {

	public static void main(String[] args) {
		int [] a =suiJi();
		System.out.println("-------------");
		System.out.println(Arrays.toString(a));
		
		sort(a);
		System.out.println("-------------------");
		System.out.println(Arrays.toString(a));
	}

	private static int[] suiJi() {
		//�������һ������ֵ���浽n
		//��Χ5+[0,6)
		int n = 5 + new Random().nextInt(6);
		//�½�int[]���飬�浽����a
		//����n
		int [] a = new int [n];
		//����a���飬1~100�������
		for(int i = 0;i < a.length;i++){
			a[i] = new Random().nextInt(100);
		}
		return a;
	}

	private static void sort(int[] a) {
		// TODO Auto-generated method stub
		
	}

}
