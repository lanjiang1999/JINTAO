package day0804;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class GamePanel extends JPanel{
	
	public GamePanel() {
		//��������������С
		setPreferredSize(new Dimension(400,654) );
	}
	/**
	 * �̶��Ļ�ͼ����
	 * ϵͳ�Զ�����
	 */
	@Override
	public void paint(Graphics g) {
		g.drawImage(Main.bg,0,0,null);
		g.drawImage(Main.hero[0],180,400,null);
		g.drawImage(Main.bee[0],100,150,null);
		
	}
	

}
