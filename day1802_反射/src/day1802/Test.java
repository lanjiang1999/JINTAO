package day1802;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//对自定义注解进行注解（元注解）
//@Target({ElementType.METHOD,ElementType.FIELD,ElementType.CONSTRUCTOR,ElementType.PARAMETER})
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Test {
	int id() default 0;
	/*
	 * *) 属性名可以任意命名
	 * *) 名字叫 value 的属性名，有特殊待遇
	 *    *) 单独赋值时，可以不写属性名
	 *    
	 *    @Test(id=9527, value="....")
	 *    @Test("....")
	 */
	String value() default "";
}







