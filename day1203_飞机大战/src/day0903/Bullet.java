package day0903;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Bullet {
	BufferedImage img=Main.bullet;
	int x;
	int y;
	
	public void paint(Graphics g){
		g.drawImage(img, x, y,null);
	}
	public void step(){
		y-=6;
	}
	public boolean isOut(){
		return y<-img.getHeight()||
				x<-img.getWidth()||
				x>400;
	}
	
}
