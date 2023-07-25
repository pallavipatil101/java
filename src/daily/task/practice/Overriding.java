package daily.task.practice;

public class Overriding {

	public static void main(String[] args) {
		A obj1 = new A();
		B obj2 = new B();
		obj1.add(2, 3);
		obj2.add(2, 3);

	}

}

class A{
	public void add(int a, int b) {
		System.out.println(a+b);
	}
	
	public void add(String a, String b) {
		System.out.println(a+b);
	}
	
}
class B extends A{
	@Override
	public void add(int a, int b) {
		System.out.println(a+"---"+b);
	}
}
