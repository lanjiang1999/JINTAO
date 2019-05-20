package day0903;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JPanel;

public class GamePanel extends JPanel{
	    Background bg=new Background();
//	    Enemy[] enemys={
//	    new Airplane(),
//	    new BigPlane(),
//	    new Bee()
//	    };
	    Hero hero=new Hero();
	    ArrayList<Enemy> enemys=new ArrayList<>();
	    ArrayList<Bullet> bullets=new ArrayList<>();
	    //֡����
	    int count;
	  
	    
	    public GamePanel() {
			//��������������С
	    	setPreferredSize(new Dimension(400, 654));
		}
	    /*
	     * �̶��Ļ�ͼ������
	     * ��ϵͳ�Զ�����
	     */
		@Override
		public void paint(Graphics g) {
//			g.drawImage(Main.bg,0,0,null);
//			g.drawImage(Main.hero[0],180,400,null);
//			g.drawImage(Main.bee[0],100,150,null);
			bg.paint(g);
//			for (int i = 0; i < enemys.length; i++) {
//				Enemy e = enemys[i];
//				e.paint(g);
//			}
			//�������е���
			paintEnemys(g);
			paintBullets(g);
			hero.paint(g);
		}
		private void paintBullets(Graphics g) {
			Iterator<Bullet> it = bullets.iterator();
			while(it.hasNext()){
				Bullet b=it.next();
			    b.paint(g);
			}
		}
		private void paintEnemys(Graphics g) {
			Iterator<Enemy> it = enemys.iterator();
			while(it.hasNext()){
				Enemy e=it.next();
			    e.paint(g);
			}
		}
		//����������
		public void action(){
			//������������
			addMouseMotionListener(new MouseAdapter() {
				@Override
				public void mouseMoved(MouseEvent e) {
					hero.setTarget(e.getX(), e.getY());
				}
			});
			//����һ֡һ֡��ѭ������
			while(true){
				count++;
				bg.step();//�����ƶ�
//				for (int i = 0; i < enemys.length; i++) {
//					Enemy e = enemys[i];
//					e.step();
//				}
				//���˳���
				enemysIn();
				//���е����ƶ�һ֡
				enemysStep();
				
				//�ӵ�����
				bulletsIn();
				//�����ӵ��ƶ�һ֡
				bulletsStep();
				hero.step();
				
				///���˺��ӵ���ײ
				hitBullet();
				
				//֪ͨ�ײ�ϵͳ���ػ滭��
				//ϵͳ�յ�֪ͨ�󣬻��Զ�����paint����
				repaint();
				//��ͣ1/60�루60fps��
				try {
					Thread.sleep(1000/140);
				} catch (InterruptedException e) {
				}
			}
		}
		private void hitBullet() {
			//��������
			for (Enemy e : enemys) {
				//�ж������ӵ��Ƿ���ײ����e
				hitBullet(e);
				
			}
		}
		private void hitBullet(Enemy e) {
			//�����ӵ�
			for (Iterator it = bullets.iterator(); it.hasNext();) {
				Bullet b = (Bullet) it.next();
				//����e�Ƿ���ײ�ӵ�b
				if(e.hitBullet(b)) {
					it.remove();//�ӵ���ʧ
					//TODO:��������ֵ����
					//TODO:Ӣ�۵÷�����
					
				}
				
			}
		}
		private void bulletsIn() {
			//ÿ15֡����һ��
			if(count % 15 == 0) {
				ArrayList<Bullet> list = hero.shoot();
				bullets.addAll(list);
			}
		}
		private void bulletsStep() {
			Iterator<Bullet> it = bullets.iterator();
			while(it.hasNext()){
				Bullet b=it.next();
			    b.step();
			    if(b.isOut()){
			    	it.remove();//ɾ���ո�ȡ��������
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
		
		private void enemysStep(){
			Iterator<Enemy> it = enemys.iterator();
			while(it.hasNext()){
				Enemy e=it.next();
			    e.step();
			    if(e.isOut()){
			    	it.remove();//ɾ���ո�ȡ��������
			    }
			}
		}
		
}
