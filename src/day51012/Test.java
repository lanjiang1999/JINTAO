package day51012;

public class Test {

	public static void main(String[] args) {
		 /* 2. 
		 *       *		4	0   5 (4空格+1*）              星数等于行数
		 *      * * 	3	1	6（4空格+2*） 
		 *     * * *	2	2	7（4空格+3*） 
		 *    * * * *	1	3	8（4空格+4*） 
		 *   * * * * * 	0	4	9（4空格+5*） 
		 */
		for(int a = 1;a <= 5;a ++) {		//a控制层数，总共五层
			for(int b = 1;b <= 5-a;b++) {   //b控制空格
				System.out.print(" ");
			}
		
			
			for(int c = a;c >a;c++) {			//c控制每层输出
				System.out.print(" *");
			}
			for(int c = 0; c < a;c++) {
				System.out.print(" *");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
				
	}

}


