package day0901;

public class Sword implements Weapon{

	@Override
	public void kill() {
		System.out.println("ˣ��");
	}

	@Override
	public String getName() {
		return "�󱦽�";
	}

	@Override
	public int getType() {
		return Weapon.TYPE_COLD;
		
	}

}
