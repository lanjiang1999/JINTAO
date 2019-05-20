package day0903;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.Random;

public abstract class Enemy {
	//初始值要在子类构造方法中赋值
	BufferedImage[] imgs;
	BufferedImage img;
	int x;
	int y;

	public void paint(Graphics g){
         g.drawImage(img, x,y,null);
	}
	public abstract void step();
	public int rndX(){
		//[0,400-图片宽度]
		return new Random().nextInt(400-img.getWidth());
	}
	
	public boolean isOut(){
		return y>654||x<-img.getWidth()||x>400;
	}
}
