package day0902;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		Weapon w = f1();
		w.kill();
		System.out.println("-------------------");
		
		System.out.println("ʹ�õ���������");
		String n = new Scanner(System.in).nextLine();
		
		Weapon w2 = new Weapon() {

			@Override
			public void kill() {
				//�ֲ��ڲ����У�ʹ������ľֲ�����
				//�����final
				//jdk1.8��ȱʡ����
				
				System.out.println("ʹ��"+n+"����");
			}
			
		};
		f2(w2);
		
	}
	
	static void f2(Weapon w) {
		w.kill();
	}
	
	private static Weapon f1() {
		class AK47 implements Weapon{

			@Override
			public void kill() {
				System.out.println("ʹ��AK47����");
			}
		}
		
		AK47 a = new AK47();
		return a;
		
	}

}
