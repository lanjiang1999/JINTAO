package day0306;

public class Test1 {
	public static void main(String[] args) {
		System.out.println("\n\n--while-----");
		f1();
		System.out.println("\n\n--do-while-----");
		f2();
	}
	static void f1(){
		// > 0.999
		 
		int i = 0;//�ƴ�
		double d = 0;//�������ֵ
		while(d <= 0.999){
			d = Math.random();
			i++;
		}
		System.out.println(i+"��"+d);
	}
	
	
	static void f2(){
		int i = 0;//�ƴ�
		double d = 0;//�������ֵ
		do{
			d = Math.random();
			i++;
			//System.out.println(i+"��"+d);

		}while (d <= 0.999);
		System.out.println(i+"��"+d);
		

	}
}
