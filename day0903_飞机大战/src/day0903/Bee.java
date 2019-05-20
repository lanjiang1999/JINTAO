package day0903;

public class Bee extends Enemy {
	int dx;//xµÄÆ«ÒÆÖµ
	
	 public Bee() {
		 imgs = Main.bee;
		 img = imgs[0];
		 x = rndx();
		 y = -img.getHeight();
		 dx = (Math.random() < 0.5?-2:2);
		
	 }
	 
	 
	@Override
	public void step() {
		y += 3;
		x += dx;
	}
	

}