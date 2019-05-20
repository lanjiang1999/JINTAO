package day0403;

import java.util.Arrays;
import java.util.Random;

public class Test1 {

	public static void main(String[] args) {
//		����33ѡ6
//		����16ѡ1
		//׼������������������
		int[] r = zbsz(33);//׼��33�������������
		int[] b = zbsz(16);//׼��16�������������
		System.out.println(Arrays.toString(r));
		System.out.println(Arrays.toString(b));
		
		//�Ӻ�������r��ѡ��6������
		int [] red = xuanRed(r);
		//��������b��ѡ��һ������
		int blue = xuanBlue(b);
		
		System.out.println(Arrays.toString(red));
		System.out.println(blue);

	}

	private static int[] xuanRed(int[] r) {
		/*[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17,
		  18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33]
		 */
		//iѭ������ǰ6��λ��
		for(int i = 0;i < 6;i++) {
			int j = new Random().nextInt(33);
			//i��jλ�ý���
			int t = r[i];
			r[i] = r[j];
			r[j] = t;
		}
		//��ȡǰ6��λ�ã�����һ���µ�����
		return Arrays.copyOf(r, 6);
	}

	private static int xuanBlue(int[] b) {
		return b[new Random().nextInt(16)];
		
	}

	private static int[] zbsz(int n) {
		int [] a = new int [n];
		for(int i = 0;i<a.length;i++){
			a[i] = i+1;
		}
		return a;
		
	}

}
