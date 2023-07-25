package daily.tasks;

import java.util.Scanner;

public class PatternPrinting {

	public static void patternOne(int rows) {
		for(int i=0; i<rows; i++)
        {
            for(int j=0; j<=i; j++)
            {
                
                System.out.print("* ");
            }
           
            System.out.println();
        }

	}
	
	public static void patternTwo(int rows) {
		for(int i=rows; i > 0; i--) {   

            for(int j=0; j < i; j++) { 

                System.out.print("* "); 

            }

            System.out.println(); 

        }
	}
	
	public static void patternThree(int rows) {
		for(int i=rows; i>=1; i--)							// i	S	j
		{													// 3	0	5	space = rows - i
			for(int space=1; space<=rows-i; space++)		// 2	1	3	no of stars = i*2-1
			{												// 1	2	1
				System.out.print(" "); 
			}
			for(int j=1; j <= 2 * i - 1; j++)
			{
				System.out.print("*"); 
			}
			System.out.println(); 
		}
	}
	
	public static void patternFour(int rows) {				
		for(int i=1; i<=rows; i++)							
		{													
			for(int space=1; space<=rows-i; space++)		
			{
				System.out.print(" "); 
			}
			for(int j=1; j <= 2 * i - 1; j++)
			{
				System.out.print("*"); 
			}
			System.out.println(); 
		}
	}
	
	public static void main(String[] args) {
		int rows;
		Scanner sc=new Scanner(System.in); 
		System.out.println("Enter Number of rows: "); 
		rows = sc.nextInt();
		
		System.out.println("Pattern One: "); 
		patternOne(5);
		System.out.println("Pattern Two: "); 
		patternTwo(5);
		System.out.println("Pattern Three: "); 
		patternThree(rows);
		System.out.println("Pattern Four: "); 
		patternFour(rows);
		
	}
}
