package day0603;

import java.awt.RadialGradientPaint;
import java.util.Random;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		System.out.println("给宠物起个名字:");
		String name = new Scanner(System.in).nextLine();
		
		Dog dog = new Dog(name);
		dog.name = name;
		dog.full = 50;
		dog.happy = 50;
		
		System.out.println("按回车执行");
		while(true) {
			new Scanner(System.in).nextLine();
			int r = new Random().nextInt(3);
			switch(r){
			case 0:dog.feed();break;
			case 1:dog.play();break;
			case 2:dog.punish();break;
			
			}
		}
	}

}
