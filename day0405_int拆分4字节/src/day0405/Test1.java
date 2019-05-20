package day0405;

import java.util.Arrays;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		System.out.println("����һ������");
		int n = new Scanner(System.in).nextInt();
		//��n��ֵ�����ݵ�chaiFen()����
		//��ֳ�4��byteֵ������һ������
		byte [] a = chaiFen(n);
		System.out.println("�ֽڲ�ֺ����һ������ "+Arrays.toString(a));
		System.out.println("\n\n---------");
		//��a�����е�4���ֽںϲ���int����
		int t = heBing(a);
		System.out.println("�ϲ��� "+t);
	}

	private static int heBing(byte[] a) {
		//�������ı���a
		int r =0;
		//�����е��ֽ�ֵ
		//��0x000000ff ��λ�룬�����24λĨ��0
		//�������ƶ�24,16,8,0
		//����r��λ�򣬽�����浽r
		
		r = r | ((a[0]&0x000000ff) << 24);
		r = r | ((a[1]&0x000000ff) << 16);
		r = r | ((a[2]&0x000000ff) << 8);
		r = r | ((a[3]&0x000000ff) << 0);
		return r;
	}

	private static byte[] chaiFen(int n) {
		//�½�byte[]���飬�������4���ֽ�
		byte [] a = new byte [4];
		//n����24,16,8,0λ����ǿת��byte
		a [0] = (byte) (n>>24);
		a [1] = (byte) (n>>16);
		a [2] = (byte) (n>>8);
		a [3] = (byte) (n>>0);
		return a;
	}

}
