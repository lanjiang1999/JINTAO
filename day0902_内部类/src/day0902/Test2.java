package day0902;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		Weapon w = f1();
		w.kill();
		System.out.println("-------------------");
		
		System.out.println("使用的武器名称");
		String n = new Scanner(System.in).nextLine();
		
		Weapon w2 = new Weapon() {

			@Override
			public void kill() {
				//局部内部类中，使用外面的局部变量
				//必须加final
				//jdk1.8后，缺省存在
				
				System.out.println("使用"+n+"进攻");
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
				System.out.println("使用AK47进攻");
			}
		}
		
		AK47 a = new AK47();
		return a;
		
	}

}
