package day0404;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		System.out.println("��������");
		int a = new Scanner(System.in).nextInt();
		
		//��a��ֵ���ݵ�binaryString()
		//�õ�int��32λ�������ַ���
		String s = binartString(a);
		System.out.println(s);
	}

	private static String binartString(int a) {
		/**
		 * 00000000 00000000 00000000 00000000
		 */
		//׼��һ�����ַ���
		String s = "";
		//iѭ�� ��0��31
		for(int i = 0;i <= 31;i ++){
			//a��(1<<i)��λ��
			//���ж�λ��Ľ���Ƿ���0
			if((a & (1<<i)) == 0){
				s = 0 + s;
		}else {
			s = 1 + s;
		}
	}
		return s;

}
}