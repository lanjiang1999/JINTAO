package day0505;

public class Test1 {

	public static void main(String[] args) {
		char [] [] a = {
				{'μ','��','��','��','��','��','��'},
				{'��','��','��','��','��','ɫ','��'},
				{'Ȱ','��','��','��','һ','��','��'},
				{'��','��','��','��','��','��','��'}
		};			
		
		/**
		 * ��������������ʾ
		 * 	i  j 
		 * 	0	��Ȱ��μ
		 *	1	�������
		 *	2	�����೯
		 */
		for(int i = 0;i < a[0].length;i++){
			for(int j = a.length-1;j  >= 0;j--){
				System.out.print(a[j][i]);
				
			}
			System.out.println();
		}
		
		
	}

}
