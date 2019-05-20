package day0701;
/**
 * 封装
 * 电子宠物的属性数据，运算方法
 * 封装成Dog类
 * @author Administrator
 *
 */
public class Dog extends Pet{
	public Dog(String name){
		super(name);
		
	}
	
	@Override
	public String cry() {
		return "汪~";
	}
	
}
