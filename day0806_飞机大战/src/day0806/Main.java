package day0806;

import java.awt.image.BufferedImage;
import java.math.BigInteger;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class Main {
	static BufferedImage bg;
	static BufferedImage bullet;
	static BufferedImage start;
	static BufferedImage over;
	static BufferedImage pause;
	
	static BufferedImage [] airplane;
	static BufferedImage [] bigPlane;
	static BufferedImage [] bee;
	static BufferedImage [] hero;
	static {
		try {
			bg = ImageIO.read(Main.class.getResource("/imgs/background.png"));
			bullet = ImageIO.read(Main.class.getResource("/imgs/bullet.png"));
			start = ImageIO.read(Main.class.getResource("/imgs/start.png"));
			over = ImageIO.read(Main.class.getResource("/imgs/gameover.png"));
			pause = ImageIO.read(Main.class.getResource("/imgs/pause.png"));
			airplane = new BufferedImage[5];
			for (int i = 0; i < airplane.length; i++) {
				airplane[i] = ImageIO.read(Main.class.getResource(
						"/imgs/airplane"+i+".png"));
			}
			bigPlane = new BufferedImage[5];
			for (int i = 0; i < bigPlane.length; i++) {
				bigPlane[i] = ImageIO.read(Main.class.getResource(
						"/imgs/bigPlane"+i+".png"));
			}
			bee = new BufferedImage[5];
			for (int i = 0; i < bee.length; i++) {
				bee[i] = ImageIO.read(Main.class.getResource(
						"/imgs/bee"+i+".png"));
			}
			hero = new BufferedImage[6];
			for (int i = 0; i < hero.length; i++) {
				hero[i] = ImageIO.read(Main.class.getResource(
						"/imgs/hero"+i+".png"));
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();//�����ӡ
		}
	}
	
	
	
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("�ɻ���ս");
		f.setDefaultCloseOperation(
				JFrame.EXIT_ON_CLOSE);
		f.setResizable(false);
		//�½� GamePanel ������ӵ�������
		GamePanel game = new GamePanel();
		f.add(game);
		//�ô��ڣ�ǡ�ð����ڲ������
		f.pack();
		
		//��ʾ
		f.setVisible(true);
		
		//������
		game.action();
	}

}
