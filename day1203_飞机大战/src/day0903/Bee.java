package day0903;

public class Bee extends Enemy{
	int dx;
    public Bee() {
		imgs=Main.bee;
		img=imgs[0];
		x=rndX();
		y=-img.getHeight();
		dx=(Math.random()<0.5?-2:2);
		r= 25;
	}
	@Override
	public void step() {
		y+=2;
		x+=dx;
//		if(y>852){
//			y=-img.getHeight();
//			x=rndX();
//		}
//		if(x>400){
//			x=rndX();
//		}
	}
}
