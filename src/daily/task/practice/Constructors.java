package daily.task.practice;

public class Constructors {

	String name;
	int age, mobile;
	
	Constructors() {
		name = "Harry Potter";
		age = 11;
		mobile = 987656786;
	}
	
	Constructors(String name, int age, int mobile) {
		this.name = name;
		this.age = age;
		this.mobile = mobile;
	}
	
	public void display() {
		System.out.println(name+"-"+age+"-"+mobile);
	}
	
	public static void main(String[] args) {
		Constructors hero1 = new Constructors("Percy Jackson",12, 988776654);
		Constructors hero2 = new Constructors();
		hero1.display();
		hero2.display();
	}

}
