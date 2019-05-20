package day0903;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Hero {
	BufferedImage[] imgs = Main.hero;
	BufferedImage img = imgs[1];
	
	int x = 152;
	int y = 480;
	//目标位置
	int tx;
	int ty;
	
	public void paint(Graphics g) {
		g.drawImage(img, x,y,null);
	}
	/**
	 * 当鼠标移动时，设置英雄机移动的目标位置
	 * 参数x，y是鼠标的位置坐标
	 */
	public void setTarget(int x,int y) {
		tx = x-48;
		ty = y-62;
	}
	
	public void step() {
		//目标位置和英雄机当前位置
		//是否是同一位置
		if(x == tx && y == ty) {
			img = imgs[1];	//静止图片
		}else {
			 x = tx;
			 y = ty;
			 img = imgs[0];	//加速图片
		}
	}

}
