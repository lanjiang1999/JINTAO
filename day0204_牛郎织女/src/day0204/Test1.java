package day0204;

public class Test1 {

	public static void main(String[] args) {
		System.out.println("ţ��֯Ů�����16.4����");
		System.out.println("���� 299792458��/��");
		System.out.println("ϲȵ��0.46��");
		System.out.println("ţ��֯Ů�����Ҫ����ֻϲȵ");
		
		//һ����ʮ������
		long ly =  299792458L*60*60*24*365;
		
		//16.4�����Ƕ�����
		double d = 16.4*ly;
		
		//��ϲȵ����
		double r = d/0.46;
		
		//����ȡ��
		//Math.ceil(r);
		//���ص�ȡ�������double����
		//��ת����long����
		long n = (long)Math.ceil(r);
		System.out.println(n);
		
	}

}
