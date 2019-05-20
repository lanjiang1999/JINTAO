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
		 
		int i = 0;//计次
		double d = 0;//保存随机值
		while(d <= 0.999){
			d = Math.random();
			i++;
		}
		System.out.println(i+"次"+d);
	}
	
	
	static void f2(){
		int i = 0;//计次
		double d = 0;//保存随机值
		do{
			d = Math.random();
			i++;
			//System.out.println(i+"次"+d);

		}while (d <= 0.999);
		System.out.println(i+"次"+d);
		

	}
}
