package daily.task.practice;

public class OverridingStaticMethod {

	public static void main(String[] args) {
		Abc a = new Abc();
		Bcd b = new Bcd();
		Abc c = new Bcd();	// c will acess m() of Abc because static method belongs to class and not object. So the reference of Abc points to it. Not the object of Bcd
		a.m();
		b.m();
		c.m();
	}

}

class Abc{
	public static void m() {
		System.out.println("Inside A");
	}
}

class Bcd extends Abc{
	
	public static void m() {
		System.out.println("Inside B");
	}
	
}
