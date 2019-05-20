package day0903;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;

public class GamePanel extends JPanel{
	Background bg = new Background();
	Enemy [] enemys = {
			new Airplane(),
			new BigPlane(),
			new Bee()
	};
	Hero hero = new Hero();
	
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
		for (int i = 0; i < enemys.length; i++) {
			Enemy e = enemys[i];
			e.paint(g); 		
		}
		hero.paint(g);
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
			bg.step();//背景移动
			for (int i = 0; i < enemys.length; i++) {
				Enemy e = enemys[i];
				e.step();
				
			}
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
	

}
