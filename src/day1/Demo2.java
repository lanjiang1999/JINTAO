package day1;
import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		/**
		 * ��ϵ�������
		 * ��>����>=����<����<=��
		 * (==)(!=)���ڣ�������
		 */
		int max = 10;
		int num = 9;
		boolean a1 = max>=10;
		boolean a2 = max%2==1;
		boolean a3 = num/max!=0;
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		/**
		 * �߼��������
		 * �߼�����������ڹ�ϵ�������֮�ϣ����������
		 * ��Ҫ��˿��ǿ���ʹ�ã��߼����������
		 * ��(&&)��(||)��(��)
		 * 
		 */
		int score = 80;
		boolean b1 = score>10 && score<100;
		System.out.println("b1="+b1);
		
		boolean f = false;
		int n = 200;
		boolean m = f||(n>10&&n<=200);
		System.out.println("m="+m);
		
		int s = 4;
		boolean u = s<10;
		System.out.println(!u);
		 
		//�߼���·��&& || ����һ�����ʽ���ܾ������ս��ʱ�����治��ִ��
		// &,| ǰ�󶼻�ִ��
		int  i = 100,j = 200;
		boolean c1 = (i>j)&&(++i>100);
		System.out.println(c1);
		System.out.println(i);
		boolean c2 = (j>0)||(++j>200);
		System.out.println(c2);
		System.out.println(j);
		
		/*
		 * ��ϰ��
		 * �����û�����������жϸ�����
		 * �Ƿ���18��30֮��
		 * �������true ���������false
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���������䣺");
		int age =sc.nextInt() ;//��ȡ��ֵ
		boolean d = age>=18&&age<=30;
		System.out.println(d);
		 
		/**
		 * 
		 * ��������
		 * �ṹ����
		boolean���ʽ�����ʽ1:���ʽ2;
		1.�����ж�boolean���ʽ
		2.������ִ�б��ʽ1
		3.��������ִ�б��ʽ2
		 */
		int a = 30;
		int b = a>10?1:2;
//		System.out.println(b);
		
		int age1 = 10;
		String r = age1>=18?"������":"δ����";
		System.out.println(r);
		int c = 3;
		String c4 = c>0?"����":(c==0?"0":"����");
		System.out.println(c4);
		
		/**
		 * �����жϳ���
		 * �û�����һ����ݣ������жϸ�����Ƿ�Ϊ����
		 * 
		 * 1.�ܱ�4�����Ҳ��ܱ�100����
		 * 			��
		 * 2.�ܱ�400����
		 */
		Scanner sc1 = new Scanner(System.in);
		System.out.println("������һ����ݣ�");
		int year = sc .nextInt();
		boolean n1 = (year%4==0&&year%100!=0)||(year%400==0);
		
		String n2 = n1?"����":"��������";
		System.out.println(n2);
		
		
		/**
		 * ��������ϵͳ
		 * ��������
		 * ����ʱ��
		 * ���ɽ��
		 * 
		 * �ܼۺ�����
		 */
		
		Scanner sc2 = new Scanner(System.in);
		System.out.println("�������������򵥼�:");
		double price =sc. nextInt();
		
		Scanner sc3 = new Scanner(System.in);
		System.out.println("����������ʱ��:");
		double times =sc. nextDouble();
		
		Scanner sc4 = new Scanner(System.in);
		System.out.println("��������ɽ��:");
		double money =sc. nextInt();
		
		 double total = price*times;
		 
		 
		
	}

}
