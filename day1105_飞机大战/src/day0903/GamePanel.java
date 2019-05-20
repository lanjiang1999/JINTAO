package day0903;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JPanel;

public class GamePanel extends JPanel{
	Background bg = new Background();
//	Enemy [] enemys = {
//			new Airplane(),
//			new BigPlane(),
//			new Bee()
//	};
	Hero hero = new Hero();
	ArrayList<Enemy> enemys = new ArrayList<>();
	private int count;
	
	
	public GamePanel() {
		//设置面板的期望大小
		setPreferredSize(new Dimension(400,654) );
	}
	/**
	 * 固定的绘图方法
	 * 系统自动调用
	 */
	@Override
	public void paint(Graphics g) {
		bg.paint(g);
		//绘制所有敌人
		painEnemts(g);
		hero.paint(g);
	}
	
	private void painEnemts(Graphics g) {
		Iterator<Enemy> it = enemys.iterator();
		while(it.hasNext()) {
			Enemy e = it.next();
			e.paint(g);
			
			
		}
	}
	//动起来方法
	public void action() {
		//设置鼠标监听器
		addMouseMotionListener(new MouseAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				hero.setTarget(e.getX(),e.getY());
			}
		});
		
		//画面一帧一帧的循环播放
		while(true) {
			count++;//帧计数增加
			bg.step();//背景移动
			//敌人出现
			enemysIn();
			//所有敌人移动一帧
			enemysStep();
			hero.step();
			
			//通知底层系统，重绘画面
			//系统收到通知后，会自动调用paint()
			repaint();
			//暂停 1/60秒(60 fps)
			try {
				Thread.sleep(1000/60);
			} catch (InterruptedException e) {
				
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
	private void enemysStep() {
		Iterator<Enemy> it = enemys.iterator();
		while(it.hasNext()) {
			Enemy e = it.next();
			e.step();
			
			if(e.isOut()) {
				/**
				 * 在迭代遍历期间
				 * 不允许使用集合来增删数据
				 * 如果要删除数据，必须使用迭代器的删除方法
				 */
				//enemys.remove(e);
				it.remove();//删除刚刚取出的数据
				
			}
			
			
			
		}
		
		
	}
	

}
