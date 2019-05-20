package day0806;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;

public class GamePanel extends JPanel{
	Background bg = new Background();
	Enemy [] enemys = {
			new Airplane(),
			new BigPlane(),
			new Bee()
	};
	
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
		for (int i = 0; i < enemys.length; i++) {
			Enemy e = enemys[i];
			e.paint(g); 		
		}
	}
	
	//����������
	public void action() {
		//����һ֡һ֡��ѭ������
		while(true) {
			bg.step();//�����ƶ�
			for (int i = 0; i < enemys.length; i++) {
				Enemy e = enemys[i];
				e.step();
				
			}
			
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
