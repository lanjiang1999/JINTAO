package day1801;

import java.lang.reflect.Constructor;
import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) throws Exception {
		System.out.println("����������");
		String s = new Scanner(System.in).nextLine();
		Class<?> c = Class.forName(s);
		
		Object o1 = null;
		Object o2 = null;
		try {
			o1 = c.newInstance();
			System.out.println(o1);
		} catch (Exception e) {
			System.out.println("����ִ���޲ι���");
		}
		System.out.println("\n\n---------------------");
		try {
			Constructor<?> t = c.getConstructor(int.class);
			o2 = t.newInstance(100);
			System.out.println(o2);
		} catch (Exception e) {
			System.out.println(
			 "����ִ�� int �����Ĺ��췽��");
		}
	}
}






