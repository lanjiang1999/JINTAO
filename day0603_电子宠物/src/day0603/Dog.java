package day0603;
/**
 * ��װ
 * ���ӳ�����������ݣ����㷽��
 * ��װ��Dog��
 * @author Administrator
 *
 */
public class Dog {
	String name;//null
	int full;	//0
	int happy; //0
	
	public Dog(String name) {
		//��ͬ���ľֲ�����
		//������this.name�����ʳ�Ա����
		this.name = name;
		 full = 50;
		 happy = 50;
	}
	public Dog(String name,int full,int happy) {
		this.name = name;
		this.full = full;
		this.happy = happy;
		
	}
	
	public void feed(){
		if(full == 100) {
			System.out.println(name+"�Բ�����");
			return;
		}
		System.out.println("��"+name+"ιʳ");
		full += 10;
		System.out.println("��ʳ��"+full);
	}
	public void play(){
		if(full == 0) {
			System.out.println(name+"�����治����");
			return;
		}
		System.out.println("��"+name+"��ˣ");
		happy += 10;
		full -= 10;
		System.out.println("��ʳ�ȣ�"+full+"���ֶȣ�"+happy);
	}
	public void punish(){
		System.out.println("��"+name+"��pp��"+name+"�޽У���~");
		happy -= 10;
		System.out.println("���ֶ�:"+happy);
	}

}
