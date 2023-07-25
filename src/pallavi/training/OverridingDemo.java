package pallavi.training;

class A{
	public void show() {
		System.out.println("In A's show");
	}
}

class B extends A{
	public void show() {
		System.out.println("In B's show");
	}
	
	public void display() {
		System.out.println("In display");
	}
}

public class OverridingDemo {

	public static void main(String[] args) {
		A obj = new B();
		obj.show();
		//obj.display(); Doesn't work.

	}

}
