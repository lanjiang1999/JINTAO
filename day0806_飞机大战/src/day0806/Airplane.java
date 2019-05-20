package day0806;

public class Airplane extends Enemy {
	
	 public Airplane() {
		 imgs = Main.airplane;
		 img = imgs[0];
		 x = rndx();
		 y = -img.getHeight();
		
	 }
	 
	 
	@Override
	public void step() {
		y += 4;
		
	}
	

}
