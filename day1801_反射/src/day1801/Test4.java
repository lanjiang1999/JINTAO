package day1801;

import java.lang.reflect.Method;

public class Test4 {
	public static void main(String[] args) throws Exception {
		Class c = Student.class;
		Student s = new Student();
		
		//���getName()��setName()����
		Method getname =
			c.getMethod("getName");
		Method setname =
		    c.getMethod("setName", String.class);
		
		setname.invoke(s, "�Ʋ���");
		
		Object r = getname.invoke(s);
		System.out.println(r);
		
	}
}




