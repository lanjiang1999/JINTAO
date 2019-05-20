package day0804;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class GamePanel extends JPanel{
	
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
		g.drawImage(Main.bg,0,0,null);
		g.drawImage(Main.hero[0],180,400,null);
		g.drawImage(Main.bee[0],100,150,null);
		
	}
	

}
