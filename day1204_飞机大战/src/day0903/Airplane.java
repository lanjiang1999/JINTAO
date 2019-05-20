package day0903;

public class Airplane extends Enemy{
     public Airplane() {
		imgs=Main.airplane;
		img=imgs[0];
		x=rndX();
		y=-img.getHeight();
		r = 18;
		life = 2;
	}
	@Override
	public void step() {
		y+=3;
//		if(y==852){
//			y=-img.getHeight();
//		}
	}

}
