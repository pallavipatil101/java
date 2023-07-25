package daily.tasks;

public class ArrayCountElement {

		
		public static void countIntegerElement(int[] array) {
			int maxcount=1, element = 0;
			
		    for (int i = 0; i < array.length; i++) {
		      int count=1;
		      for (int j = 1; j < array.length; j++) {
		        if (array[i] == array[j]) {
		          count++;
		        }
		      }
		  
		      if (count > maxcount) {
		        maxcount = count;
		        element = array[i];
		      }
		    }
		  System.out.println("Maximum times occuring number is: "+ element+". And it occurs: "+maxcount+" times.");
		}
		
		public static void countCharElement(char[] array) {
			int maxcount=1;
			char element = 0;
			
			for (int i = 0; i < array.length; i++) {
			      int count=1;
			      for (int j = 1; j < array.length; j++) {
			        if (array[i] == array[j]) {
			          count++;
			        }
			      }
			  
			      if (count > maxcount) {
			        maxcount = count;
			        element = array[i];
			      }
			    }
			System.out.println("Maximum times occuring character is: "+ element+". And it occurs: "+maxcount+" times.");
		}
		
		
		public static void main(String[] args) {
			 int[] arr = {2,3,4,5,3,7,2,4,2,8,9};
			 countIntegerElement(arr);
			 char array[] = {'a','f','d','s','f','s','a','d','d','r','f','f','s','a','a','a','a','d','d','d','d','s'};
			 countCharElement(array);
		}
}
