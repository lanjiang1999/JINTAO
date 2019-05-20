package day1801;

import java.lang.reflect.Field;

public class Test3 {
	public static void main(String[] args) throws Exception {
		Class c = Student.class;
		Student s = new Student();
		
		//获得id变量
		Field id = c.getDeclaredField("id");
		//使私有变量可以被访问
		id.setAccessible(true);		
		//给变量id赋值，指定对象 s
		id.set(s, 9527);
		System.out.println(s.getId());
		System.out.println("\n\n----------------");
		//访问指定的对象s中的id变量值
		int a = (Integer) id.get(s);
		System.out.println(a);
		
		
		
		
	}
}
