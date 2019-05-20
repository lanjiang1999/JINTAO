package day0901;

public class Sword implements Weapon{

	@Override
	public void kill() {
		System.out.println("Ë£½£");
	}

	@Override
	public String getName() {
		return "´ó±¦½£";
	}

	@Override
	public int getType() {
		return Weapon.TYPE_COLD;
		
	}

}
