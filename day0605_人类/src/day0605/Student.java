package day0605;

public class Student extends Person {
	String school;
	
	public Student(String name, String gender, int age,String school) {
		this.name= name;
		this.gender = gender;
		this.age = age;
		this.school = school;
	}

	public String toString() {
		//super
		//��������
		//�Ը���������������
		return super.toString()+","+school;
	}

}
