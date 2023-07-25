package daily.task.practice;

public class Factorial {

	static void fact1(int num) {
		int fact=1;
		for(int i=1; i<=num; i++) {
			fact = fact*i;
		}
		System.out.println("Factorial of "+num+ " is: "+fact);
	}
	
	static void fact2(int num) {
		int fact=1;
		for(int i=num; i>=1; i--)
		{
			fact = fact*i;
		}
		System.out.println("Factorial of "+num+ " is: "+fact);
	}
	
	public static void main(String[] args) {
		fact1(5);
		fact2(5);

	}

}
