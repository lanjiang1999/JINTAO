package test;


class MyClass{
	public final double i = Math.random();
	public static double j = Math.random();
	
}

public class Demo1_class {

	public static void main(String[] args) {
		MyClass myclass1 = new MyClass();
		MyClass myclass2 = new MyClass();
		System.out.println("i:"+myclass1.i);
		System.out.println("i:"+myclass2.i);//i的值不同
		
		System.out.println("j:"+myclass1.j);
		System.out.println("j:"+myclass2.j);//j的值相同
		//static在类加载时候加载，之后初始化对象就不变了，final在每次新建对象
		
	}

}
