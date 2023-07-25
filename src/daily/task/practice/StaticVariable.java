package daily.task.practice;

public class StaticVariable {
	String name;
	int age;
	static String dept = "QA";
	
	void display() {
		System.out.println(name+"-"+age+"-"+dept);
	}
	
	public static void main(String[] args) {
		StaticVariable sv1 = new StaticVariable();
		sv1.dept = "Sales";		//values will change for all objects. static is defined by the memory location it has. Not by it's value.
		sv1.name = "Naruto";
		sv1.age = 12;
		sv1.display();
		StaticVariable sv2 = new StaticVariable();
		sv2.name = "Sasuke";
		sv2.age = 13;
		sv2.display();
		
		System.out.println(dept);	//direct access. with classname outside class
	}

}
