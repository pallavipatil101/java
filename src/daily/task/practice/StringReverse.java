package daily.task.practice;

public class StringReverse {

	public static String reverseString(String str) {
		String rev = "";
		for(int i=str.length()-1; i>=0; i--)
		{
			rev = rev+str.charAt(i);
		}
		return rev;
	}
	
	
	public static void main(String[] args) {
		
		String str1 = "I am a Josh Employee";
		str1 = str1.toLowerCase();
		String str2 = reverseString(str1);
		System.out.println(str2);
		
		if(str1.equals(str2))
			System.out.println("String is a palindrome");
		else
			System.out.println("Not palindrome");

	}

}
