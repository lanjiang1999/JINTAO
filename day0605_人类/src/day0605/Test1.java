package day0605;

public class Test1 {
	public static void main(String[] args) {
		Person p = new Person("张三","男",22);
		Student s = new Student("学生一","女",20555,"北京大学");
		Employee e = new Employee();
		
		/*s.name = "李四";
		s.gender = "女";
		s.age = 21;
		s.school = "垃圾学校";*/
		
		e.name = "赵六";
		e.gender = "不男不女";
		e.age = 21;
		e.salary = 9000;
		System.out.println(p.toString());
		System.out.println(s.toString());
		System.out.println(e.toString());
		
	}

}
