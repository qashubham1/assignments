package assignments;

import java.util.ArrayList;
import java.util.List;

public class Assignment4_Arrays_Collections {
		
//	2. Create a set of the top 10 most visited tourist attractions in the world and print out all
//	of them and its size.
	
//	3. Create an array of 10 numbers (any 10 numbers) and print out the Average of 5th and
//	6th Value.
	
//	4. Create a list of the top 5 highest-grossing movies of all time and print out the third
//	movie on the list.

	public static void main(String[] args) {
		
//		1. Create Lists with area of top 5 largest cities. Print the total area of the 3rd and 4th
//		cities combined.
		
		List <String> Largest_City = new ArrayList <String> ();
		
		Largest_City.add("Mumbai");
		Largest_City.add("Pune");
		Largest_City.add("Hyderabad");
		Largest_City.add("Delhi");
		Largest_City.add("Bengaluru");
		
		System.out.println("Largest City In India: " + Largest_City.get(3));
		
		
		

	}

}
