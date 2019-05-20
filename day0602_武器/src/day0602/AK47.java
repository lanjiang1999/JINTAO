package day0602;
/**
 * 封装
 * 武器相关的数据，逻辑运算方法
 * 封装一个“类”组件
 * @author Administrator
 *
 */
public class AK47 {
	/**
	 *属性数据
	 *成员变量
	 */
	int bullet = 10;//子弹数量
	
	public AK47() {
		
	}
	
	//构造方法,没有返回类型
	public AK47(int b){
		//参数值b，保存到成员变量bullet
		bullet = b;
		
	}
	
	/**
	 * 成员方法
	 */
	public void fire(){
		if(bullet == 0){
			System.out.println("已经没有子弹了");
			return;
		}
		bullet--;
		System.out.println("发射");
		System.out.println("子弹数量:"+bullet);
	}
	
	public void load(){
		System.out.println("装载");
		bullet = 10;
	}
	
}
