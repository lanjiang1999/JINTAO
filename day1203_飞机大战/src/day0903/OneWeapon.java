package day0903;

import java.util.ArrayList;

public class OneWeapon implements Weapon{

	@Override
	public ArrayList<Bullet> fire(Hero hero) {
		ArrayList<Bullet> list=new ArrayList<Bullet>();
		Bullet b=new Bullet();
//		list.add(b);
//		b.x=hero.x+hero.img.getWidth()/2-b.img.getWidth()/2;
		b.x=hero.x+45;
		b.y=hero.y-14;
		if(!b.isOut()){
			list.add(b);
		}
		return list;
	}
	

}
