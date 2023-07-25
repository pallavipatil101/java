package daily.task.practice;

abstract class Animal{
	
	int a, b;
//	private Animal() {
//		a = 10;
//	}
	
	Animal(int a, int b) {
		a = 10;
	}
	
	public void eats() {
		System.out.println("Animal eats");
	}
	
	public abstract void sound();
	//abstract void m1();
	
	public final void m2() {
	}
}

class Dog extends Animal{
	int c,d;
	
	Dog(int a, int b, int c, int d) {
		super(a, b);
		this.c = c;
		this.d = d;
	}

	@Override
	public void sound() {
		System.out.println("Dog barks");
	}
	//Animal animal = new Animal(10);
}

public class AbstractClass {

	public static void main(String[] args) {
		Dog g = new Dog(1, 2, 3, 0);
		g.sound();
		//Animal a = new Animal(); --> Not allowed

	}

}
