package day0905;

public class Test1 {

	public static void main(String[] args) {
		char[] a = {'h','e','l','l','o'};
		String s1 = new String(a);//�·����ڴ�
		
		String s2 = "hello";//�������·����ڴ�
		String s3 = "hello";//���ʳ����ش��ڵĶ���
		
		System.out.println(s1 == s2);
		System.out.println(s2 == s3);
		System.out.println(s1.equals(s2));
		
		
	}

}
