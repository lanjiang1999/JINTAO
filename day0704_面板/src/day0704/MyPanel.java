package day0704;

import java.awt.Graphics;

import javax.swing.JPanel;

public class MyPanel extends JPanel {
	/*	�̶��Ļ��Ʒ���
		��屻����ʱ���ػ�ʱ
		ϵͳ���Զ������������
		����g��һ�Ż���
	*/
	@Override
	public void paint(Graphics g) {
		g.fillOval(100, 100, 80, 40);
		g.drawLine(50, 50, 200, 150);
		g.drawRect(20, 80, 200, 120);
		
	}
}
