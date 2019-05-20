package day0704;

import javax.swing.JFrame;

public class Test1 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(400,400);
		f.setTitle("自定义面板");
		f.setDefaultCloseOperation(
				JFrame.EXIT_ON_CLOSE);
		
		//面板对象
		MyPanel panel = new MyPanel();
		//在窗口f中，添加面板panel
		f.add(panel);
		f.setVisible(true);
	}
	

}
