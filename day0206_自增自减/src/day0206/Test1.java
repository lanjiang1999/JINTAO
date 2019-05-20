package day0206;

public class Test1 {

	public static void main(String[] args) {
		int a;
		
		a = 5;
		System.out.println(a++);		//5
		
		a = 5;
		System.out.println(++a);		//6
		
		a = 5;
		int b = a++;
		System.out.println(a);			//6
		System.out.println(b);			//5
	}
	

}
