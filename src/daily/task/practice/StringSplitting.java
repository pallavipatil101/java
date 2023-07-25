package daily.task.practice;

public class StringSplitting {

	public static void main(String[] args) {
		String rev = "";
		String str = "I am a Josh Employee";
		  String[] str2 = str.split(" ");
		 
		 for(String a : str2)
		 {
			 System.out.println(a);
			 for(int i=a.length()-1; i>=0; i--)
			 {
				 rev = rev+(a.charAt(i));
			 }
			 rev = rev+" ";
		 }
		 System.out.println(rev);
		 
		 

	}

}
