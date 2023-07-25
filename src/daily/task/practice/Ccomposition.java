package daily.task.practice;

class Job {
    private String role;
    private long salary;

        
    public String getRole() {
        return role;
    }
    
    public void setRole(String role) {
        this.role = role;
    }
    
    public long getSalary() {
        return salary;
    }
    
    public void setSalary(long salary) {
        this.salary = salary;
    }
    
}

class Person {
	String name;
    private Job job;
   
    public Person(String name){
    	this.name=name;
        this.job=new Job();
        job.setSalary(1000L);
        job.setRole("QA Engineer");
    }
    
    public long getSalary() {
        return job.getSalary();
    }
    
    public String getRole() {
        return job.getRole();
    }

    public String getName() {
    	return name;
    }
}

public class Ccomposition {

	public static void main(String[] args) {
		Person person = new Person("Abcd");
       
        System.out.println(person.getSalary());
        System.out.println(person.getRole());
        System.out.println(person.getName());
	}

}
