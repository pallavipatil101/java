package pallavi.training;

//Write a program to find the total number of occurrences of a word inside a Statement.
public class WordCount {
public static void main(String args[]) {
	String string = "people love to love people";
	String word[] = {"people","love"};
	
	int count = 0;
	for (int i = 0; i < string.length(); i++) {
		if (string.contains(word[i]))
		{
			count++;
		}
		System.out.println("The word" + count);
	}
}
}
