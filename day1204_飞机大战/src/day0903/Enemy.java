package day0903;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.Random;

public abstract class Enemy {
	static final int STAT_NORMAL 	= 0;
	static final int STAT_BOOM 		= 1;
	static final int STAT_DEAD 		= 2;
	//��ʼֵҪ�����๹�췽���и�ֵ
	BufferedImage[] imgs;
	BufferedImage img;
	int x;
	int y;
	int r;//�뾶
	int life;//����ֵ
	int stat = STAT_NORMAL;//״̬
	
	int index;//��ըʱ���±�������л���������ͼ
	

	public void paint(Graphics g){
         g.drawImage(img, x,y,null);
	}
	public abstract void step();
	public int rndX(){
		//[0,400-ͼƬ���]
		return new Random().nextInt(400-img.getWidth());
	}
	
	public boolean isOut(){
		return y>654||x<-img.getWidth()||x>400;
	}
	
	public boolean hitBullet(Bullet b) {
		//������״̬���Ͳ������ײ
		if(stat != STAT_NORMAL) {
			return false;
		}
		//���˵����ĵ�����
		int dx = x + img.getWidth()/2;
		int dy = y + img.getHeight()/2;
		//dx��dy�����ӵ���x��y�ľ���
		int xx = dx - b.x;
		int yy = dy - b.y;
		double d = Math.sqrt(xx*xx + yy*yy);
		
		boolean peng = d <= r;
		if(peng) {
			life--;
			if(life == 0){
				//�л���BOOM״̬
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
		//ÿ6֡����һ�ű�ըͼ
		if(GamePanel.count % 6 == 0) {
			if(index == 5) {
				//״̬�л��� DEAD
				stat = STAT_DEAD;
				return;
			}
			img = imgs[index++];
			
		}
	}
}
