package daily.task.practice;

public class ClassAndObjects {

	String empname;
	double salary;
	int empid;
	
	public void display() {
		System.out.println(empid+"-"+empname+"-"+salary);
	}
	
	public static void main(String[] args) {
		ClassAndObjects obj1 = new ClassAndObjects();
		obj1.empname = "Tanjiro Kamado";
		obj1.salary = 90000d;
		obj1.empid = 101;
		
		ClassAndObjects obj2 = new ClassAndObjects();
		obj2.empname = "Yuji Itadori";
		obj2.salary = 91000d;
		obj2.empid = 102;
		
		obj1.display();
		System.out.println("----------------------------------------");
		obj2.display();
		

	}

}
