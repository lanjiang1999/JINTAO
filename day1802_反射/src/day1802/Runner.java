package day1802;

import java.lang.reflect.Method;

public class Runner {
	public static void launch(Class c) {
		try {
			//����ʵ��
			Object obj = c.newInstance();
			//��ȡ���з���
			Method[] a = c.getMethods();
			//��������
			for (Method m : a) {
				//��÷����ϵ�@Testע����Ϣ
				//û��@Testע�⣬�õ�nullֵ
				Test test = 
					m.getAnnotation(Test.class);
				//��@Testע��
				if(test != null) {
					//���ע����������
					int id = test.id();
					String msg = test.value();
					System.out.println("\n\n-----------------");
					System.out.println(id);
					System.out.println(msg+"\n");
					m.invoke(obj);//������ô˷���
				}
			}
			
		} catch (Exception e) {
			System.out.println("ִ��ʧ��");
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		Runner.launch(A.class);
	}
	
	
}
