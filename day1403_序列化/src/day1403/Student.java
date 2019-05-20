package day1403;

import java.io.Serializable;
/*
 * Serializable 接口
 *     空接口，
 *     标识接口，标识一个对象，允许被序列化
 */
public class Student implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private static String gender;
	private transient int age;
	
	public Student() {
	}
	public Student(int id, String name, String gender, int age) {
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", gender=" + gender + ", age=" + age + "]";
	}
	
}

