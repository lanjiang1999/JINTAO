package day21009;

public class Practice2 {

	public static void main(String[] args) {
		// row�����У���ӡ������ֽ�����
		for (int row = 1; row <= 5; row++) {
			// colum�����У����forѭ��ȷ����ӡÿ����ٸ��ո�
			for (int colum = 1; colum <= 5 - row; colum++) {
				System.out.print(" ");

			}

			// ��������forѭ��ȷ����i���ӡi i-1 ... 1 ... i-1 i �Գ��γɵ�����
			for (int num = row; num >= 1; num--) {
				System.out.print(num);
			}
			
			for (int num = 2; num <= row; num++) {
				System.out.print(num);
			}
			
			// ����
			System.out.println();
		}
	}

}
