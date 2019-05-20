package day0903;

import java.util.ArrayList;

public class EightWeapon implements Weapon{

	@Override
	public ArrayList<Bullet> fire(Hero hero) {
		ArrayList<Bullet> list=new ArrayList<Bullet>();
		Bullet b1=new Bullet();
		Bullet b2=new Bullet();
		Bullet b3=new Bullet();
		Bullet b4=new Bullet();
		Bullet b5=new Bullet();
		Bullet b6=new Bullet();
		Bullet b7=new Bullet();
		Bullet b8=new Bullet();
		Bullet b9=new Bullet();
		Bullet b10=new Bullet();
		Bullet b11=new Bullet();
		Bullet b12=new Bullet();
		Bullet b13=new Bullet();
		Bullet b14=new Bullet();
		Bullet b15=new Bullet();
		Bullet b16=new Bullet();
		
//		b.x=hero.x+hero.img.getWidth()/2-b.img.getWidth()/2;
		b1.x=hero.x+10;
		b1.y=hero.y+29;
		
		b2.x=hero.x-10;
		b2.y=hero.y+29;
		
		b3.x=hero.x+40;
		b3.y=hero.y+29;
		
		b4.x=hero.x-40;
		b4.y=hero.y+29;
		
		b5.x=hero.x+60;
		b5.y=hero.y+29;
		
		b6.x=hero.x-60;
		b6.y=hero.y+29;
		
		b7.x=hero.x+80;
		b7.y=hero.y+29;
		
		b8.x=hero.x-80;
		b8.y=hero.y+29;
		
		b9.x=hero.x+100;
		b9.y=hero.y+29;
		
		b10.x=hero.x-100;
		b10.y=hero.y+29;
		
		b11.x=hero.x+120;
		b11.y=hero.y+29;
		
		b12.x=hero.x-120;
		b12.y=hero.y+29;
		
		b13.x=hero.x+140;
		b13.y=hero.y+29;
		
		b14.x=hero.x-140;
		b14.y=hero.y+29;
		
		b15.x=hero.x+160;
		b15.y=hero.y+29;
		
		b16.x=hero.x-170;
		b16.y=hero.y+29;
		if(!b1.isOut()){
			list.add(b1);
		}
		if(!b2.isOut()){
			list.add(b2);
		}
		if(!b3.isOut()){
			list.add(b3);
		}
		if(!b4.isOut()){
			list.add(b4);
		}
		if(!b5.isOut()){
			list.add(b5);
		}
		if(!b6.isOut()){
			list.add(b6);
		}
		if(!b7.isOut()){
			list.add(b7);
		}
		if(!b8.isOut()){
			list.add(b8);
		}
		if(!b9.isOut()){
			list.add(b9);
		}
		if(!b10.isOut()){
			list.add(b10);
		}
		if(!b11.isOut()){
			list.add(b11);
		}
		if(!b12.isOut()){
			list.add(b12);
		}
		if(!b13.isOut()){
			list.add(b13);
		}
		if(!b14.isOut()){
			list.add(b14);
		}
		if(!b15.isOut()){
			list.add(b15);
		}
		if(!b16.isOut()){
			list.add(b16);
		}
		return list;
	}
	

}
