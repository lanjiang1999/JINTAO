package day0903;

import java.awt.Graphics;
import java.awt.font.GraphicAttribute;
import java.awt.image.BufferedImage;
import java.util.Random;

public abstract class Enemy {
	//��ʼֵҪ�����๹�췽���и�ֵ
	BufferedImage [] imgs;
	BufferedImage img;
	int x;
	int y;
	
	public void paint(Graphics g){
	g.drawImage(img,x,y,null);
	}
	public abstract void step();
	
	public int rndx(){ 
		//[0,400-ͼƬ���)
		return new Random().nextInt(400-img.getWidth());
		
		
	}
}
