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
		//�������е���
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
			count++;//֡��������
			bg.step();//�����ƶ�
			//���˳���
			enemysIn();
			//���е����ƶ�һ֡
			enemysStep();
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
	private void enemysIn() {
		//ÿ30֡����
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
				 * �ڵ��������ڼ�
				 * ������ʹ�ü�������ɾ����
				 * ���Ҫɾ�����ݣ�����ʹ�õ�������ɾ������
				 */
				//enemys.remove(e);
				it.remove();//ɾ���ո�ȡ��������
				
			}
			
			
			
		}
		
		
	}
	

}
