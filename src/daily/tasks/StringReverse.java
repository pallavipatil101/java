package daily.tasks;

public class StringReverse {

	public static void stringReverse(String str) {
		String rev = "";
		 String[] str2 = str.split(" ");
		 
		 for(String a : str2)
		 {
			 //System.out.println(a);
			 for(int i=a.length()-1; i>=0; i--)
			 {
				 rev = rev+(a.charAt(i));
			 }
			 rev = rev+" ";
		 }
		 System.out.println(rev);
		 
	}
	
	public static void strReverse(String str) {
		String rev = "";
		 String[] str2 = str.split(" ");
		 
		 for(String a : str2)
		 {
			StringBuffer sb = new StringBuffer(a);
			 for(int i=sb.length()-1; i>=0; i--)
			 {
				 rev = rev+(a.charAt(i));
			 }
			 rev = rev+" ";
		 }
		 System.out.println(rev);
	}
	
	public void rev(String str) {
		StringBuffer buffer = null;
		String rev = "";
		 String[] str2 = str.split(" ");
		 
		 for(String a : str2)
		 {
			StringBuffer sb = new StringBuffer(a);
			 buffer = sb.reverse();
			 //System.out.println(buffer);
			 rev= rev+buffer.toString()+" ";
		 }
		 
		 System.out.println(rev);
		
	}
	
	public static void main(String[] args) {
		String str = "I am a Josh Employee";
		StringBuffer str2 = new StringBuffer(str);
		//stringReverse(str);
		//strReverse(str);
		StringReverse obj = new StringReverse();
		obj.rev(str);
	}

}
