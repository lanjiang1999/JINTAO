package day0704;

import javax.swing.JFrame;

public class Test1 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(400,400);
		f.setTitle("�Զ������");
		f.setDefaultCloseOperation(
				JFrame.EXIT_ON_CLOSE);
		
		//������
		MyPanel panel = new MyPanel();
		//�ڴ���f�У�������panel
		f.add(panel);
		f.setVisible(true);
	}
	

}
