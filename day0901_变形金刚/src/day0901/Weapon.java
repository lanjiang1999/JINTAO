package day0901;

public interface Weapon { // �ӿ� interface
	// public static final //�ӿ���ֻ�ܶ��峣��
	int TYPE_COLD = 0;
	int TYPE_HOT = 1;
	int TYPE_NUCLEAR = 2;
	
	

	// public abstract void kill(); //�����ĳ��󷽷�
	void kill(); // ǰ�����ؼ��ֿ��Բ�д

	String getName();

	int getType();

}
