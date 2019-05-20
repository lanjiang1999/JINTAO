package day0402;

import java.util.Arrays;
import java.util.Random;

public class Test1 {

	public static void main(String[] args) {
		System.out.println("\n\n-----------");
		int a = f1();
		System.out.println(a);
		
		System.out.println("\n\n-----------");
		char b = f2();
		System.out.println(b);

		System.out.println("\n\n-----------");
		int [] c = f3();
		System.out.println(Arrays.toString(c));
	}
	
	static int f1(){
		return new Random().nextInt(5);
	}
	
	static char f2(){
		//'a'+[0,26)
		return (char)
				('a'+new Random().nextInt(26));
	}
	
	static int[] f3(){
	    int [] a = new int [5];
		for(int i = 0;i < a.length;i++){
			a[i] = new Random().nextInt(100);
		}
		return a;
	}

}
