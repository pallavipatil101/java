package daily.task.practice;

public class OverloadingMain {
  

	public static void main(Integer args)   
	{   
		System.out.println("main() that takes an integer argument");   
	}   
	
	public static void main(char args)   
	{   
		System.out.println("main() that tales a char argument");   
	}   
	
	public static void main(String[] args)   {   
	
		System.out.println("Original main()");
		main(10);
		main('a');
	
	}   
	  
}
