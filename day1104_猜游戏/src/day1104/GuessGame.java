package day1104;

import java.util.ArrayList;
import java.util.Scanner;

public abstract  class GuessGame {
	public void start() {
		//������Ϸ��ͨ������
		//�������ֵ
		String r = suiJi();
		System.out.println("����"+r);
		tiShi();
		ArrayList<String> list = new ArrayList<>();
		
		while(true) {
			System.out.println("��(��"+(list.size()+1)+"��):");
			String c = new Scanner(System.in).nextLine();
			//�ж��Ƿ�¹�
			if(list.contains(c)){
				System.out.println(c+"�Ѿ��¹���");
				continue;
			}
			list.add(c);
			//�Ƚ�c��r�����õ��ȽϵĽ��
			String result = biJiao(c,r);
			System.out.println(result);
			//�ж�result�Ƿ�Ϊ�¶ԵĽ��
			if(caiDui(result)) {
				break;
				
			}
			
		}
	}

	public abstract String suiJi();

	public abstract void tiShi();

	public abstract String biJiao(String c, String r);

	public abstract boolean caiDui(String result);

}
