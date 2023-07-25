package daily.tasks;

import java.util.Arrays;
import java.util.Collections;

public class Anagram {
	
	public static void isAnagram(String str1, String str2) {
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		
		if(str1.length() == str2.length())
		{
			char[] array1 = str1.toCharArray();
			char[] array2 = str2.toCharArray();	
			Arrays.sort(array1);
			Arrays.sort(array2);
			if(Arrays.equals(array1, array2))
			{
				System.out.println("Strings are anagrams.");
			}
			else
			{
				System.out.println("Strings are not anagrams");
			}
		}
		else 
		{
			System.out.println("Strings are not anagrams.");
		}
	}

	public static void main(String[] args) {
		String str1 = "a gentle mAn";	
		String str2 = " eleGant man";
		isAnagram(str1, str2);
	}

}
