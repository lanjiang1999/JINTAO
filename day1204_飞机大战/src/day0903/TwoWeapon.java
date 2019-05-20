package day0903;

import java.util.ArrayList;

public class TwoWeapon implements Weapon{

	@Override
	public ArrayList<Bullet> fire(Hero hero) {
		ArrayList<Bullet> list=new ArrayList<Bullet>();
		Bullet b1=new Bullet();
		Bullet b2=new Bullet();
		
//		b.x=hero.x+hero.img.getWidth()/2-b.img.getWidth()/2;
		b1.x=hero.x+13;
		b1.y=hero.y+29;
		
		b2.x=hero.x+76;
		b2.y=hero.y+29;
		if(!b1.isOut()){
			list.add(b1);
		}
		if(!b2.isOut()){
			list.add(b2);
		}
		return list;
	}
	

}
