package daily.task.practice;

public class CountCharacters {

	public static void maxChar(String str) {
		str = str.replace
				(" ", "");	//removing spaces
		int max = 0;
		char character = 0;
		int arr[] = new int[127];
		
		for(int i=0; i<=str.length()-1; i++)
		{
			arr[str.charAt(i)] = arr[str.charAt(i)]+1;
			for(int j=0; j<=str.length()-1; j++)
			{
				if(arr[str.charAt(i)]>max)	
				{
					max = arr[str.charAt(i)];
					character = str.charAt(i);
				}
			}
			
		}
		System.out.println("Maximum occuring character is: "+character+" And it occurs: "+max+" time.");
	}
	
	public static void main(String[] args) {
		String str = " a b d bc cc dd dcc a";
		maxChar(str);

	}

}
