package day1802;

import java.lang.reflect.Method;

public class Runner {
	public static void launch(Class c) {
		try {
			//创建实例
			Object obj = c.newInstance();
			//获取所有方法
			Method[] a = c.getMethods();
			//遍历方法
			for (Method m : a) {
				//获得方法上的@Test注解信息
				//没有@Test注解，得到null值
				Test test = 
					m.getAnnotation(Test.class);
				//有@Test注解
				if(test != null) {
					//获得注解属性数据
					int id = test.id();
					String msg = test.value();
					System.out.println("\n\n-----------------");
					System.out.println(id);
					System.out.println(msg+"\n");
					m.invoke(obj);//反射调用此方法
				}
			}
			
		} catch (Exception e) {
			System.out.println("执行失败");
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		Runner.launch(A.class);
	}
	
	
}
