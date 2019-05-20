package day0901;

public interface Weapon { // 接口 interface
	// public static final //接口内只能定义常量
	int TYPE_COLD = 0;
	int TYPE_HOT = 1;
	int TYPE_NUCLEAR = 2;
	
	

	// public abstract void kill(); //公开的抽象方法
	void kill(); // 前两个关键字可以不写

	String getName();

	int getType();

}
