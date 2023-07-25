package daily.tasks;

import java.util.Scanner;

public class ArrayCompare {

	
	public static int[] sortArray(int[] array) {
		for(int i=0; i<array.length; i++)
        {
        	for(int j=i+1; j<array.length; j++)
        	{
        		int temp;
        		if(array[i]>array[j])
        		{
        			temp = array[i];
        			array[i] = array[j];
        			array[j] = temp;
        			
        		}
        	}
        }
		return array;
	}
	public static void main(String[] args) {
//		For taking arrays from user -
//		int arraysize;  
//		Scanner sc=new Scanner(System.in);  
//		System.out.println("Enter the number of elements you want to store in array one: "); 
//		arraysize=sc.nextInt();  
//		int[] a1 = new int[10];  
//		System.out.println("Enter array1 elements: ");  
//		for(int i=0; i<arraysize; i++)  
//		{  
//			a1[i]=sc.nextInt();  
//		} 
//		
//		System.out.println("Enter the number of elements you want to store in array one: "); 
//		arraysize=sc.nextInt();  
//		int[] a2 = new int[10];  
//		System.out.println("Enter array2 elements: ");  
//		for(int i=0; i<arraysize; i++)  
//		{  
//			a2[i]=sc.nextInt();  
//		}  

        int[] a = {5,4,6,3,2,1}, b= {1,2,3,5,4,6};
        
        //Sorting        
        sortArray(a);
        sortArray(b);
		
        //Sorted Arrays
//        for(int i=0; i<a.length;i++)
//        {
//        	System.out.print(a[i]+" ");
//        }
//        
//        System.out.println();
//        
//        for(int i=0; i<b.length;i++)
//        {
//        	System.out.print(b[i]+" ");
//        }
//        System.out.println();
        
        
        boolean result = true;
        
        if (a.length == b.length) 
        {
       	if(a==b) {
       		result = true;
       	}
        }
        
        else
        {
        	result = false;
        }
        
        if(result == false)
        
        	System.out.println("Arrays are not equal");
        
        
        else
        
        	System.out.println("Arrays are equal");
        
	}
}
