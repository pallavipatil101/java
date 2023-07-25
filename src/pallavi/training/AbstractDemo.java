package pallavi.training;

class Writer{
	public void write() {
		
	}
}

class Pen extends Writer{
	public void write() {
		System.out.println("Pen Writes");
	}
}

class Pencil extends Writer{
	public void write() {
		System.out.println("Pencil Writes");
	}
}

class Kit{
	public void doSomething(Writer w) {
		w.write();
	}
}

public class AbstractDemo {

	public static void main(String[] args) {
		Kit k = new Kit();
		Pencil p1 = new Pencil();
		Pen p2 = new Pen();
		
		k.doSomething(p1);
		k.doSomething(p2);

	}

}
