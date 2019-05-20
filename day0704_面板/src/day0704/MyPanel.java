package day0704;

import java.awt.Graphics;

import javax.swing.JPanel;

public class MyPanel extends JPanel {
	/*	固定的绘制方法
		面板被绘制时或被重绘时
		系统会自动调用这个方法
		参数g：一张画布
	*/
	@Override
	public void paint(Graphics g) {
		g.fillOval(100, 100, 80, 40);
		g.drawLine(50, 50, 200, 150);
		g.drawRect(20, 80, 200, 120);
		
	}
}
