package day0901;

public class Transformer {
	//���ν��ʹ�õ������ӿ�
	//���������ӿ����͵ı���
	private Weapon w;
	public void setWeapon(Weapon w) {
		this.w = w;
	}
	public void attack() {
		//�����ӿ���û�н�������  
		if (w == null){
			System.out.println("û������");
			return;
		}
		
		//ʹ��������󱦽�����
		String type = null;
		switch(w.getType()){
		case Weapon.TYPE_COLD:type = "�����"; break;
		case Weapon.TYPE_HOT:type = "�ȱ���"; break;
		case Weapon.TYPE_NUCLEAR:type = "�˱���"; break;
		}
		
		System.out.println("ʹ��"+type+w.getName()+"����");
		w.kill();
	}

}
