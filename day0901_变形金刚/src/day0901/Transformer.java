package day0901;

public class Transformer {
	//变形金刚使用的武器接口
	//定义武器接口类型的变量
	private Weapon w;
	public void setWeapon(Weapon w) {
		this.w = w;
	}
	public void attack() {
		//武器接口上没有接入武器  
		if (w == null){
			System.out.println("没得武器");
			return;
		}
		
		//使用冷兵器大宝剑进攻
		String type = null;
		switch(w.getType()){
		case Weapon.TYPE_COLD:type = "冷兵器"; break;
		case Weapon.TYPE_HOT:type = "热兵器"; break;
		case Weapon.TYPE_NUCLEAR:type = "核兵器"; break;
		}
		
		System.out.println("使用"+type+w.getName()+"进攻");
		w.kill();
	}

}
