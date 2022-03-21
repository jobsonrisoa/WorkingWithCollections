package app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		//Declare ArrayList
		
		List<Integer> integersList = new ArrayList<Integer>();
		ArrayList<String> stringsList = new ArrayList<String>();
		
		ArrayList typeUnsafe = new ArrayList();
		
		typeUnsafe.add(100);
		typeUnsafe.add(true);
		typeUnsafe.add("Welcome");
		typeUnsafe.add(15.5);
		
		System.out.println(typeUnsafe + " size: " + typeUnsafe.size());
		
		typeUnsafe.remove(0);
		typeUnsafe.remove("Welcome");
		
		System.out.println(typeUnsafe + " size: " + typeUnsafe.size());
		
		typeUnsafe.add(2, "Python");
		
		System.out.println(typeUnsafe + " size: " + typeUnsafe.size());
		
		integersList.add(1);
		integersList.add(1);
		integersList.add(1);
		integersList.add(1);
		
		typeUnsafe.addAll(integersList);
		
		System.out.println(typeUnsafe + " size: " + typeUnsafe.size());
		
		typeUnsafe.set(typeUnsafe.indexOf("Python"), "Javascript");
		
		System.out.println(typeUnsafe + " size: " + typeUnsafe.size());
		
		// For Loop
		System.out.println("Reading elements using for loop........");
		
		for(int i=0; i < typeUnsafe.size(); i++) {
			System.out.println(typeUnsafe.get(i));
		}

		// For each loop
		System.out.println("Reading elements using for each........");
		for(Object element:typeUnsafe) {
			System.out.println(element);
		}
		
		// iterator
		System.out.println("Reading elements using iterator method........");
		
		Iterator iterator = typeUnsafe.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
		
		// Converting Array to ArrayList
		
		String[] arr = {"João", "Maria", "Pedro"};
		
		List arrList = new ArrayList(Arrays.asList(arr));		
		System.out.println(arrList);
		
		
		
		
		
		
	}

}
