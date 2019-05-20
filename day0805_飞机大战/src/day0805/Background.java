package day0805;

import java.awt.Graphics;
import java.awt.font.GraphicAttribute;
import java.awt.image.BufferedImage;

public class Background {
	BufferedImage img = Main.bg;
	int x1 = 0;
	int y1 = 0;
	int x2 = 0;
	int y2 = -852;
	
	public void paint(Graphics g) {
		g.drawImage(img,x1,y1,null);
		g.drawImage(img,x2,y2,null);
	}
		
	public void step() {
		y1++;
		y2++;
		if(y1 == 852) {
			y1 = -852;
		}
		if(y2 == 852) {
			y2 = -852;
		}
	}
}
