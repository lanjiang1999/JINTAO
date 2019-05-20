package day21009;

public class Pracrice {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
		
		
		
		
		
		//练习
		//row控制行，打印五层数字金字塔
		
		for(int row = 1;row <= 5;row++) {
			//colum控制列，这个for循环确定打印每层多少个空格
			for(int colum = 1;colum <= 5 - row;colum++) {
				System.out.println(" ");
				
			}
			
			//下面两个for循环确定第i层打印i i-1 ... 1 ... i-1 i 对称形成的数字
			for(int num = row; num >= 1; num--){
				System.out.println(num);
			}
			for(int num = 2;num <= row;num++) {
				System.out.println(num);
			}
			//换行
			System.out.println();
		}
	}

}

