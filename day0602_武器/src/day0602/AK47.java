package day0602;
/**
 * ��װ
 * ������ص����ݣ��߼����㷽��
 * ��װһ�����ࡱ���
 * @author Administrator
 *
 */
public class AK47 {
	/**
	 *��������
	 *��Ա����
	 */
	int bullet = 10;//�ӵ�����
	
	public AK47() {
		
	}
	
	//���췽��,û�з�������
	public AK47(int b){
		//����ֵb�����浽��Ա����bullet
		bullet = b;
		
	}
	
	/**
	 * ��Ա����
	 */
	public void fire(){
		if(bullet == 0){
			System.out.println("�Ѿ�û���ӵ���");
			return;
		}
		bullet--;
		System.out.println("����");
		System.out.println("�ӵ�����:"+bullet);
	}
	
	public void load(){
		System.out.println("װ��");
		bullet = 10;
	}
	
}
