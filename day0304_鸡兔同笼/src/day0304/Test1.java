package day0304;

public class Test1 {
	public static void main(String[] args) {
			//��			��
			//1			34
			//2			33
			//...		...
			//35		0
		
		System.out.println("���ù�35ֻ");
		System.out.println("��94ֻ��");
		System.out.println("���ø�����ֻ");

		for(int j = 0,t = 35;j <= 35;j++,t--){
			if(j*2+t*4==94){
				System.out.println("��"+j+"ֻ,"+"��"+t+"ֻ");
			}
		}
		
	}

}
