package day0302;

public class Test1 {

	public static void main(String[] args) {
		System.out.println("\n\n---打印1到10---------");
		f1();
		System.out.println("\n\n---打印10到1---------");
		f2();
		System.out.println("\n\n---打印2,4,6,8,10---------");
		f3();
		System.out.println("\n\n---打印8,88,888,...,888888888--------");
		f4();
		System.out.println("\n\n---死循环--------");
		f5();
		
		
	}
	
	static void f1(){
		for(int i = 1;i <= 10;i++){
			System.out.print(" "+i);
		}
		
	}
	static void f2(){
		for(int i = 10;i > 0;i--){
			System.out.print(" "+i);
		}
		
	}
	static void f3(){
		for(int i = 2;i <= 10;i+=2){
			System.out.print(" "+i);
		}
		
	}
	static void f4(){
		for(long i = 8;i <= 888888888L;i = i*10+8){
			System.out.print(" "+i);
		}
		
	}
	static void f5(){
		for(int i = 1;;i++){
		System.out.println(i);	
		}
	}
}

