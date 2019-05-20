package day0805;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;

public class GamePanel extends JPanel{
	Background bg = new Background();
	
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
		bg.paint(g);
	}
	
	//����������
	public void action() {
		//����һ֡һ֡��ѭ������
		while(true) {
			bg.step();//�����ƶ�
			
			//֪ͨ�ײ�ϵͳ���ػ滭��
			//ϵͳ�յ�֪ͨ�󣬻��Զ�����paint()
			repaint();
			//��ͣ 1/60��(60 fps)
			try {
				Thread.sleep(1000/60);
			} catch (InterruptedException e) {
				
			}
		}
	}
	

}
