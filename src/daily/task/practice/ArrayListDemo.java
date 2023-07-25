package daily.task.practice;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<Object> al = new ArrayList<Object>();
		al.add("A");
		al.add("B");
		al.add(1);
		al.add(true);
		al.add(3.4);
		System.out.println("List 1"+al);
		ArrayList<Object>  al2 = new ArrayList<Object> ();
		al2.addAll(al);
		System.out.println("List 2"+al2);
		
		al.set(2,5);
		System.out.println("List 1 after adding"+al);
		System.out.println(al.get(3));
		al.remove(1);
		System.out.println("List 1 after removing 2nd element"+al);
		//al.set(4,5); --> index out of bounds
		ArrayList<String>  al3 = new ArrayList<String> ();
		
		al3.add("A");
		al3.add("M");
		al3.add("K");
		al3.add("H");
		al3.add("B");
		System.out.println("al3 after adding"+al3);
		Collections.sort(al3);
		System.out.println("al3 after sorting"+al3);
		Collections.shuffle(al3);
		System.out.println("al3 after shuffle"+al3);
		Collections.sort(al3, Collections.reverseOrder());
		System.out.println("al3 after sorting and in reverse "+al3);


	}

}
