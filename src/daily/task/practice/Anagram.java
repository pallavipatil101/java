package daily.task.practice;

import java.util.ArrayList;
import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		ArrayList<String> a1 = new ArrayList<String>(); 
		String[] array = {"eat","tea","bat","tab","nat","tan","ate","ant"};
		
		for(int i=0; i<array.length; i++)
		{
			
			if(!a1.contains(array[i]))
			{
				a1.add(array[i]);
			}
			
			
			for(int j=i+1; j<array.length; j++)
			{
				
				char[] x = array[j].toCharArray();
				char[] y = array[i].toCharArray();
				Arrays.sort(x);
				Arrays.sort(y);
				
				if(Arrays.equals(x, y))
				{
					if(!a1.contains(array[j]))
						a1.add(array[j]);
					
				}
			}
			
		}
//		for(String s: a1)
//		{
//			System.out.println(s);
//		}
		
		 String strArray[] = a1.toArray(new String[a1.size()]);
		 for (String str : strArray) {
	            System.out.println(str);
	        }

	}

}
