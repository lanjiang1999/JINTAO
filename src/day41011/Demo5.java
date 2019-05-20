package day41011;

public class Demo5 {

	public static void main(String[] args) {
		// 循环嵌套
		// *****
		// *****
		// *****
		// *****
		// ***** 单个输出5行5列* System.out.print("*");

		for (int k = 1; k <= 5; k++) {

			for (int i = 1; i <= 5; i++) { // 循环输出一排*
				System.out.print("*"); // 删去ln 实现一行*
			} //
			System.out.println(); // 换行输出5行*
		}

		/*
		 * 输出以下图形
		 * 			   88788
		 * 			   77777
		 *       	   88788
		 * 			   88788
		 * for(int i =1;i <= 5;i++){
		 *  if(i==3){ System.out.print("7"); }else{
		 * System.out.print("8"); } } System.out.println();
		 */

		for (int k = 1; k <= 5; k++) {
			for (int i = 1; i <= 5; i++) {
				if (i == 3 || k == 3) {
					System.out.print("7");
				} else {
					System.out.print("8");

				}
			}
			System.out.println();
		}
	}

}

