package day1802;

public class A {
	@Test(id=9527)
	public void a() {
		System.out.println("a����");
	}
	@Test(id=9528, value="���Է���b")
	public void b() {
		System.out.println("b����");
	}
	public void c() {
		System.out.println("c����");
	}
	@Test("���Է���d")
	public void d() {
		System.out.println("d����");
	}
}
