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
		hero.paint(g);
	}
	
	//����������
	public void action() {
		//������������
		addMouseMotionListener(new MouseAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				hero.setTarget(e.getX(),e.getY());
			}
		});
		
		//����һ֡һ֡��ѭ������
		while(true) {
			bg.step();//�����ƶ�
			for (int i = 0; i < enemys.length; i++) {
				Enemy e = enemys[i];
				e.step();
				
			}
			hero.step();
			
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
