package day0801;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		/**
		 * 创建一组士兵对象
		 * 循环一轮一轮的进攻
		 * 直到所有士兵阵亡
		 */
		//新建 Soldier[] 数组
		Soldier [] a = new Soldier[5];
		//遍历数组，创建5个士兵对象，存入数组
		for(int i = 0;i < a.length;i ++) {
			a[i] = new Soldier();
			a[i].id = i + 1;
			
		}
		System.out.println("已经创建"+Soldier.count+"个士兵");
		System.out.println("按回车进攻");
		//当还有存活的士兵
		while(Soldier.count != 0) {
			new Scanner(System.in).nextLine();
			for(int i = 0;i < a.length; i ++) {
				//遍历进攻
				a[i].attack();	
				
				
			}
			
		}
		
	}
}
