package day1802;

public class A {
	@Test(id=9527)
	public void a() {
		System.out.println("a方法");
	}
	@Test(id=9528, value="测试方法b")
	public void b() {
		System.out.println("b方法");
	}
	public void c() {
		System.out.println("c方法");
	}
	@Test("测试方法d")
	public void d() {
		System.out.println("d方法");
	}
}
