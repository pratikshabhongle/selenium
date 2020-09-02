        package javaDemo;

import java.util.Set;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class collectionsDemo {
	public static void main(String[] args) {
		Set<Object> s=new HashSet<>();
		s.add("Ankur");
		s.add(25);
		s.add(false);
		s.add(6.3);
		
		List<Object> lst=new ArrayList<>(s);
		for(Object val:lst)
		{
			System.out.println(val);
		}
		System.out.println("Extra:"+lst.get(2).getClass());
	}

}
