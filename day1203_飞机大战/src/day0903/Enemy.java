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
	int r;//半径

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
	
	public boolean hitBullet(Bullet b) {
		//敌人的中心点坐标
		int dx = x + img.getWidth()/2;
		int dy = y + img.getHeight()/2;
		//dx，dy，和子弹的x，y的距离
		int xx = dx - b.x;
		int yy = dy - b.y;
		double d = Math.sqrt(xx*xx + yy*yy);
		
		return d <= r;
		
		
	}
}
