package day060;

import javax.swing.JFrame;

public class Test1 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		//对窗口的属性进行设置
		f.setSize(300,200);//尺寸
		f.setTitle("窗口标题");//标题栏文字
		f.setResizable(false);//不可改变大小
		f.setDefaultCloseOperation(
				JFrame.EXIT_ON_CLOSE);//直接退出
		//通知窗口服务对象，在屏幕上绘制窗口
		f.setVisible(true);
		
		//第二个窗口
		JFrame f2 = new JFrame();
		f2.setSize(200,300);//尺寸
		f2.setTitle("第二个窗口标题");//标题栏文字
		f2.setVisible(true);

	}

}
