package day41011;

public class Demo6 {

	public static void main(String[] args) {
				/**�žų˷���
				 * 1*1=1
				 * 1*2=2 2*2=4
				 * ...
				 * 1*9=9...9*9=81
				 */
		
		for(int i = 1;i <= 9;i++){
			for(int k = 1;k <=i;k++){
				System.out.print(" "+k+"*"+i+"="+(i*k));
			}
			System.out.println();
		}
	}

}
