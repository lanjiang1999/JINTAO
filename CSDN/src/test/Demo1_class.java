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
		System.out.println("i:"+myclass2.i);//i��ֵ��ͬ
		
		System.out.println("j:"+myclass1.j);
		System.out.println("j:"+myclass2.j);//j��ֵ��ͬ
		//static�������ʱ����أ�֮���ʼ������Ͳ����ˣ�final��ÿ���½�����
		
	}

}
