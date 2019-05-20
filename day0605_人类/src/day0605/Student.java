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
		//在子类中
		//对父类对象的特殊引用
		return super.toString()+","+school;
	}

}
