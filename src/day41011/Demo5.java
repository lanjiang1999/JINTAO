package day41011;

public class Demo5 {

	public static void main(String[] args) {
		// ѭ��Ƕ��
		// *****
		// *****
		// *****
		// *****
		// ***** �������5��5��* System.out.print("*");

		for (int k = 1; k <= 5; k++) {

			for (int i = 1; i <= 5; i++) { // ѭ�����һ��*
				System.out.print("*"); // ɾȥln ʵ��һ��*
			} //
			System.out.println(); // �������5��*
		}

		/*
		 * �������ͼ��
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

