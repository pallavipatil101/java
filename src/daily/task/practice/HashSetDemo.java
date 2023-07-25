package daily.task.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<Integer> numbers = new HashSet<>();	// default size16 and load factor 0.75 (75%)
        numbers.add(2);
        numbers.add(5);
        numbers.add(1);
        numbers.add(4);
        numbers.add(3);
//        numbers.add(null);
//        numbers.add(null);
        System.out.println("Before sorting: " + numbers);

//        Iterator it = numbers.iterator();
//        while(it.hasNext())
//        {
//        	System.out.println(it.next());
//        }
        
        //Sorting
        ArrayList<Integer> a = new ArrayList<>();
        a.addAll(numbers);
        //numbers.removeAll(numbers); --> No need to remove as set only keeps unique elements
       // Collections.sort(a);
        numbers.addAll(a);
        System.out.println("After sorting : "+numbers);
        
        
        //Union, Intersection and difference
        HashSet<Integer> numbers2 = new HashSet<>();
        numbers2.add(6);
        numbers2.add(7);
        numbers2.add(8);
        System.out.println("Numbers 2     : "+numbers2);
        
        //union
        
        numbers.addAll(numbers2);
        System.out.println("union is this : "+numbers);
        
        //Difference
//        numbers.removeAll(numbers2);
//        System.out.println("Difference is : "+numbers);
        
        //Intersection
        numbers.retainAll(numbers2);
        System.out.println("Intersection  : "+numbers);
        
        
 
	}

}
