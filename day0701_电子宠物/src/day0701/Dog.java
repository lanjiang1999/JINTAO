package day0701;
/**
 * ��װ
 * ���ӳ�����������ݣ����㷽��
 * ��װ��Dog��
 * @author Administrator
 *
 */
public class Dog extends Pet{
	public Dog(String name){
		super(name);
		
	}
	
	@Override
	public String cry() {
		return "��~";
	}
	
}
