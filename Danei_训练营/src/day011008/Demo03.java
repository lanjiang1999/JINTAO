package day011008;

public class Demo03 {
	public static void main(String[] args) {
		
		double a = 3.14;
		float b = 1.1F;//����ʹ��
		
		System.out.println(Double.MAX_VALUE);
		//1.25E3: 1.25����10��3�η�
		
		//�������
		double a1 = 3.0;
		double a2 = 2.9;
		System.out.println(a1-a2);

		
	
		
		
		
		
		//�ַ�����char
		//unicode����:
		char b1 = '��';
		char b2 = '\u4e2d';
		System.out.println(b1);
		System.out.println(b2);
		
		int c1 = b1;
		System.out.println(c1);
		
		char c2 = 'p';
		char c3 = '��';
		char c4 = '&';
		char c5 = ' ';
//		char c6 = '���';ֻ�ܴ洢�����ַ�
//		char c7 = '';����Ϊ��
//		char c8 = ��;û�е�����
		//ת���ַ�:\
		char c9 = '\'';
		char c10 = '\\';
		System.out.println(c10);
		
	}
}