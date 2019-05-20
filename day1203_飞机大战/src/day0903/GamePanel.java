package day0903;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JPanel;

public class GamePanel extends JPanel{
	    Background bg=new Background();
//	    Enemy[] enemys={
//	    new Airplane(),
//	    new BigPlane(),
//	    new Bee()
//	    };
	    Hero hero=new Hero();
	    ArrayList<Enemy> enemys=new ArrayList<>();
	    ArrayList<Bullet> bullets=new ArrayList<>();
	    //帧计数
	    int count;
	  
	    
	    public GamePanel() {
			//设置面板的期望大小
	    	setPreferredSize(new Dimension(400, 654));
		}
	    /*
	     * 固定的绘图方法，
	     * 由系统自动调用
	     */
		@Override
		public void paint(Graphics g) {
//			g.drawImage(Main.bg,0,0,null);
//			g.drawImage(Main.hero[0],180,400,null);
//			g.drawImage(Main.bee[0],100,150,null);
			bg.paint(g);
//			for (int i = 0; i < enemys.length; i++) {
//				Enemy e = enemys[i];
//				e.paint(g);
//			}
			//绘制所有敌人
			paintEnemys(g);
			paintBullets(g);
			hero.paint(g);
		}
		private void paintBullets(Graphics g) {
			Iterator<Bullet> it = bullets.iterator();
			while(it.hasNext()){
				Bullet b=it.next();
			    b.paint(g);
			}
		}
		private void paintEnemys(Graphics g) {
			Iterator<Enemy> it = enemys.iterator();
			while(it.hasNext()){
				Enemy e=it.next();
			    e.paint(g);
			}
		}
		//动起来方法
		public void action(){
			//设置鼠标监听器
			addMouseMotionListener(new MouseAdapter() {
				@Override
				public void mouseMoved(MouseEvent e) {
					hero.setTarget(e.getX(), e.getY());
				}
			});
			//画面一帧一帧的循环播放
			while(true){
				count++;
				bg.step();//背景移动
//				for (int i = 0; i < enemys.length; i++) {
//					Enemy e = enemys[i];
//					e.step();
//				}
				//敌人出现
				enemysIn();
				//所有敌人移动一帧
				enemysStep();
				
				//子弹出现
				bulletsIn();
				//所有子弹移动一帧
				bulletsStep();
				hero.step();
				
				///敌人和子弹碰撞
				hitBullet();
				
				//通知底层系统，重绘画面
				//系统收到通知后，会自动调用paint方法
				repaint();
				//暂停1/60秒（60fps）
				try {
					Thread.sleep(1000/140);
				} catch (InterruptedException e) {
				}
			}
		}
		private void hitBullet() {
			//遍历敌人
			for (Enemy e : enemys) {
				//判断所有子弹是否碰撞敌人e
				hitBullet(e);
				
			}
		}
		private void hitBullet(Enemy e) {
			//遍历子弹
			for (Iterator it = bullets.iterator(); it.hasNext();) {
				Bullet b = (Bullet) it.next();
				//敌人e是否碰撞子弹b
				if(e.hitBullet(b)) {
					it.remove();//子弹消失
					//TODO:敌人生命值减少
					//TODO:英雄得分增加
					
				}
				
			}
		}
		private void bulletsIn() {
			//每15帧发射一次
			if(count % 15 == 0) {
				ArrayList<Bullet> list = hero.shoot();
				bullets.addAll(list);
			}
		}
		private void bulletsStep() {
			Iterator<Bullet> it = bullets.iterator();
			while(it.hasNext()){
				Bullet b=it.next();
			    b.step();
			    if(b.isOut()){
			    	it.remove();//删除刚刚取出的数据
			    }
			}
		}
		private void enemysIn() {
			//每30帧出现
			if(count % 30 == 0) {
				double r = Math.random();
				if(r < 0.6) {
					enemys.add(new Airplane());
				}else if(r < 0.9) {
					enemys.add(new BigPlane());
				}else {
					enemys.add(new Bee());
				}
			}
		}
		
		private void enemysStep(){
			Iterator<Enemy> it = enemys.iterator();
			while(it.hasNext()){
				Enemy e=it.next();
			    e.step();
			    if(e.isOut()){
			    	it.remove();//删除刚刚取出的数据
			    }
			}
		}
		
}
