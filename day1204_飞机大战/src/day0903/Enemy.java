package day0903;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.Random;

public abstract class Enemy {
	static final int STAT_NORMAL 	= 0;
	static final int STAT_BOOM 		= 1;
	static final int STAT_DEAD 		= 2;
	//初始值要在子类构造方法中赋值
	BufferedImage[] imgs;
	BufferedImage img;
	int x;
	int y;
	int r;//半径
	int life;//生命值
	int stat = STAT_NORMAL;//状态
	
	int index;//爆炸时，下标递增，切换访问数组图
	

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
		//非正常状态，就不检测碰撞
		if(stat != STAT_NORMAL) {
			return false;
		}
		//敌人的中心点坐标
		int dx = x + img.getWidth()/2;
		int dy = y + img.getHeight()/2;
		//dx，dy，和子弹的x，y的距离
		int xx = dx - b.x;
		int yy = dy - b.y;
		double d = Math.sqrt(xx*xx + yy*yy);
		
		boolean peng = d <= r;
		if(peng) {
			life--;
			if(life == 0){
				//切换到BOOM状态
				stat = STAT_BOOM;
			}
		}
		return peng ;
	}
	public boolean isNormal() {
		return stat == STAT_NORMAL;
	}
	public boolean isBoom() {
		return stat == STAT_BOOM;
	}
	public boolean isDead() {
		return stat == STAT_DEAD;
	}
	
	public void boom() { 
		//每6帧，换一张爆炸图
		if(GamePanel.count % 6 == 0) {
			if(index == 5) {
				//状态切换到 DEAD
				stat = STAT_DEAD;
				return;
			}
			img = imgs[index++];
			
		}
	}
}
