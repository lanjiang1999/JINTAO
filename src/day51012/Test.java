package day51012;

public class Test {

	public static void main(String[] args) {
		 /* 2. 
		 *       *		4	0   5 (4�ո�+1*��              ������������
		 *      * * 	3	1	6��4�ո�+2*�� 
		 *     * * *	2	2	7��4�ո�+3*�� 
		 *    * * * *	1	3	8��4�ո�+4*�� 
		 *   * * * * * 	0	4	9��4�ո�+5*�� 
		 */
		for(int a = 1;a <= 5;a ++) {		//a���Ʋ������ܹ����
			for(int b = 1;b <= 5-a;b++) {   //b���ƿո�
				System.out.print(" ");
			}
		
			
			for(int c = a;c >a;c++) {			//c����ÿ�����
				System.out.print(" *");
			}
			for(int c = 0; c < a;c++) {
				System.out.print(" *");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
				
	}

}


