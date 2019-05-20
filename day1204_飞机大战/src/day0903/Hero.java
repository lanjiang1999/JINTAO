package day0903;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class Hero {
	BufferedImage[] imgs=Main.hero;
	BufferedImage img=imgs[1];
	int x=152;
	int y=480;
	//Ŀ��λ��
	int tx=x;
	int ty=y;
	
//	Weapon weapon=new OneWeapon();
	//Weapon weapon=new TwoWeapon();
	Weapon weapon=new EightWeapon();;
	public void paint(Graphics g){
		g.drawImage(img, x,y, null);
	}
	/*
	 * ������ƶ�ʱ������Ӣ�ۻ��ƶ���Ŀ��λ��
	 * ����x,y������λ������
	 */
	public void setTarget(int x,int y){
		tx=x-48;
		ty=y-62;
	}
	public void step(){
		//Ŀ��λ�ú�Ӣ�ۻ���ǰλ���Ƿ���ͬһ��λ��
		if(x==tx&&y==ty){
			img=imgs[1];//��ֹͼƬ
		}else{
			x=tx;
			y=ty;
			img=imgs[0];//����ͼƬ
		}
	}
	
	public ArrayList<Bullet> shoot(){
		return weapon.fire(this);
	}
}
