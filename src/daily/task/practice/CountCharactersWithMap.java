package daily.task.practice;

import java.util.HashMap;
import java.util.*;

public class CountCharactersWithMap {

	public static void main(String[] args) {
		int max = 0;
		char character = 0;
		String s = "abbccc";
		HashMap<Character, Integer> mp = new HashMap<Character, Integer>();
		char[] c = s.toCharArray();
		
		for(char ch : c)
		{
			//If key(character) doesn't exist in map, it'll make entry with put method with value 1.  
			//If key does exist, it'll fetch its value (get() method) and add 1 to it.
			
			if(mp.containsKey(ch))
				mp.put(ch, mp.get(ch)+1);
			else
				mp.put(ch, 1);
		}
		
		////Map.Entry interface in java provides methods to access entries in map.
		for(Map.Entry<Character, Integer> me: mp.entrySet())	
		{
			if(max < me.getValue())
			{
				max = me.getValue();
				character = me.getKey();
			}
		}
		System.out.println(character+" "+max);
	}

}
