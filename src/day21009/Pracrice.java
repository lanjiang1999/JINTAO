package day21009;

public class Pracrice {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
		
		
		
		
		
		//��ϰ
		//row�����У���ӡ������ֽ�����
		
		for(int row = 1;row <= 5;row++) {
			//colum�����У����forѭ��ȷ����ӡÿ����ٸ��ո�
			for(int colum = 1;colum <= 5 - row;colum++) {
				System.out.println(" ");
				
			}
			
			//��������forѭ��ȷ����i���ӡi i-1 ... 1 ... i-1 i �Գ��γɵ�����
			for(int num = row; num >= 1; num--){
				System.out.println(num);
			}
			for(int num = 2;num <= row;num++) {
				System.out.println(num);
			}
			//����
			System.out.println();
		}
	}

}

