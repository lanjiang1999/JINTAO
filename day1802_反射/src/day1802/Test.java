package day1802;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//���Զ���ע�����ע�⣨Ԫע�⣩
//@Target({ElementType.METHOD,ElementType.FIELD,ElementType.CONSTRUCTOR,ElementType.PARAMETER})
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Test {
	int id() default 0;
	/*
	 * *) ������������������
	 * *) ���ֽ� value �������������������
	 *    *) ������ֵʱ�����Բ�д������
	 *    
	 *    @Test(id=9527, value="....")
	 *    @Test("....")
	 */
	String value() default "";
}







