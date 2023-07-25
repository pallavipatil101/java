package daily.task.practice;

public class FactorialWithRecursion {
	static int factorial=1;
	
	static int fact(int no) {
		if(no>=1) {
			factorial = factorial*no;
			fact(no-1);
			return factorial;
		}
		else
		return 1;	
	}
	public static void main(String[] args) {
		System.out.println("Factorial is: "+fact(5));

	}

}
