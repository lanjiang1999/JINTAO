package day1801;

import java.lang.reflect.Field;

public class Test3 {
	public static void main(String[] args) throws Exception {
		Class c = Student.class;
		Student s = new Student();
		
		//���id����
		Field id = c.getDeclaredField("id");
		//ʹ˽�б������Ա�����
		id.setAccessible(true);		
		//������id��ֵ��ָ������ s
		id.set(s, 9527);
		System.out.println(s.getId());
		System.out.println("\n\n----------------");
		//����ָ���Ķ���s�е�id����ֵ
		int a = (Integer) id.get(s);
		System.out.println(a);
		
		
		
		
	}
}
