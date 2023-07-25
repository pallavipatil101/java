package daily.task.practice;

public class StaticMethods {
	int age;
	String name;
	static String dept="BlahBlah";
	
	static void m1() {
		//System.out.println(name+"-"+age);	---> NOT ALLOWED. Static methods only access static data.
		System.out.println(dept);
	}
	
	
	public static void main(String[] args) {
		StaticMethods obj = new StaticMethods();
		obj.name = "Pallavi";
		m1();
		System.out.println(dept);
		//System.out.println(name);		---> Not allowed as main() is static.
		System.out.println(obj.name); //---> Allowed with object.
	}

}
