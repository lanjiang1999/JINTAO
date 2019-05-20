package day0806;

public class BigPlane extends Enemy {
	
	 public BigPlane() {
		 imgs = Main.bigPlane;
		 img = imgs[0];
		 x = rndx();
		 y = -img.getHeight();
		
	 }
	 
	 
	@Override
	public void step() {
		y += 2;
		
	}
	

}


