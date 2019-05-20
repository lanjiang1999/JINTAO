package day0508;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		System.out.println("玩几层汉诺塔");
		int n = new Scanner(System.in).nextInt();
		
		f(n,"A","B","C");
		
	}

	private static void f(int n, 
			String z1,
			String z2,
			String z3) {
		if(n == 1){
			System.out.println(z1+"->"+z3);
			return;
		}
		//n-1层，从z->z3->z2
		f(n-1,z1,z3,z2);
		//底部的一层，从z1->z2->z3
		f(1,z1,z2,z3);
		//z2上的n-1层，从z2->z1->z3
		f(n-1,z2,z1,z3);
		
	}

}
