package day0903;

public class BigPlane extends Enemy{
	public BigPlane() {
		imgs=Main.bigPlane;
		img=imgs[0];
		x=rndX();
		y=-img.getHeight();
		r = 35;
	}
	@Override
	public void step() {
		y+=2;
//		if(y>852){
//			y=-img.getHeight();
//		}
	}
}
