package daily.task.practice;

public class PrivateConstructor {
	int a;
	private PrivateConstructor() {
		a =10;
	}
	
	public PrivateConstructor(int a) {
		this.a = a;
	}
	public static void main(String[] args) {
		PrivateConstructor a = new PrivateConstructor();
	}

}

class Child extends PrivateConstructor {

	public Child(int a) {
		super(a);
	}
	public static void main(String[] args) {
		//PrivateConstructor a = new PrivateConstructor(); --> Not allowed outside class
		PrivateConstructor a = new PrivateConstructor(10);	//public constructor
	}
	
}
