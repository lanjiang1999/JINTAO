package day0603;
/**
 * 封装
 * 电子宠物的属性数据，运算方法
 * 封装成Dog类
 * @author Administrator
 *
 */
public class Dog {
	String name;//null
	int full;	//0
	int happy; //0
	
	public Dog(String name) {
		//有同名的局部变量
		//必须用this.name来访问成员变量
		this.name = name;
		 full = 50;
		 happy = 50;
	}
	public Dog(String name,int full,int happy) {
		this.name = name;
		this.full = full;
		this.happy = happy;
		
	}
	
	public void feed(){
		if(full == 100) {
			System.out.println(name+"吃不下了");
			return;
		}
		System.out.println("给"+name+"喂食");
		full += 10;
		System.out.println("饱食度"+full);
	}
	public void play(){
		if(full == 0) {
			System.out.println(name+"饿的玩不动了");
			return;
		}
		System.out.println("陪"+name+"玩耍");
		happy += 10;
		full -= 10;
		System.out.println("饱食度："+full+"快乐度："+happy);
	}
	public void punish(){
		System.out.println("打"+name+"的pp，"+name+"哭叫：汪~");
		happy -= 10;
		System.out.println("快乐度:"+happy);
	}

}
