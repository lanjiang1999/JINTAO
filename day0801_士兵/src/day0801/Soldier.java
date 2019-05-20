package day0801;

import java.util.Random;


/**
 * 封装
 * 把士兵相关的属性数据，和逻辑运算方法
 * 封装成一个“类”组件
 * 
 */

public class Soldier {


	
	//属性变量
	//成员变量
	int id;
	int blood = 100;
	
	//静态士兵计数变量
	static int count;
	
	//构造方法
	public Soldier(){
		System.out.println("Soldier构造器");
		Soldier.count ++;
	}
	
	/**
	 * 成员方法
	 */
	public void go() {
		System.out.println(id+"号士兵前进");
	}
	
	public void attack() {
		if(blood == 0){
			System.out.println("这是"+id+"号士兵的尸体");
			return;
			
		}
		System.out.println(id+"号士兵进攻");
		//随机的减血量
		int d = new Random().nextInt(10);
		//减血
		blood -= d;
		if(blood < 0){
			blood = 0;
		}
		System.out.println("血量"+blood);
		//血量是0，阵亡
		if(blood == 0){
			System.out.println(id+"号士兵阵亡");
			Soldier.count --;
			
		}
		

	}

}
