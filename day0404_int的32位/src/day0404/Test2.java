package day0404;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		System.out.println("�����������");
		String s = new Scanner(System.in).nextLine();
		//���s�ĳ��ȳ���32λ��������������
		if(s.length() > 32){
			System.out.println("���ܳ���32λ");
			return;
		}
		
		//10111--> 23
		int a = binaryStringToInt(s);
		System.out.println(a);
	}

	private static int binaryStringToInt(String s) {
		/**
		 * 	
		 */
		//����������������r,��0��ʼ
		
		int r = 0;
		
		//�����ַ���s
		for(int i = 0;i < s.length();i ++){
			//��s��ȡiλ�õ��ַ�
			char c = s.charAt(i);
			if(c == '1'){
				//�ƶ�λ��
				int w = s.length()-i-1;
				//int�ж�Ӧ��λ�ó�1
				r = (1<<w) | r;
			}
			
		}
		return r;
	}

}
