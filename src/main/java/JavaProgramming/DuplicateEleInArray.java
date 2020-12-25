package JavaProgramming;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateEleInArray {


	
	public static void main(String[] args) {
		
		int[] a={3,5,4,2,4,7,8};
		Map<Integer,Integer> hm= new HashMap<Integer,Integer>();
		for(Integer i:a)
		{
			Integer count = hm.get(i);
			if(count == null)
			{
				hm.put(i, 1);
			}
			else
			{
				hm.put(i, count++);

			}
		}
		
		Set<Entry<Integer, Integer>> es = hm.entrySet();
		for(Map.Entry<Integer, Integer> me:es)
		{
			if(me.getValue()>1)
			{
				System.out.print(me.getKey()+" ");
			}
		}

	}

}
