package assignments;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Assignment7_Collections {


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
		
//		2. Create a set of the top 10 most visited tourist attractions in the world and print out all
//		of them and its size.
		
		Set<String> touristCities = new HashSet <String>();
		
		touristCities.add("bali");
		touristCities.add("Miami");
		touristCities.add("Thimpu");
		touristCities.add("Paris");
		touristCities.add("Rio de Janero");
		touristCities.add("Kathmandu");
		touristCities.add("Jakarta");
		touristCities.add("Pune");
		touristCities.add("Mumbai");
		touristCities.add("Los Angeles");
		
		System.out.println("Number of tourist Attractions: "+ touristCities.size());
		System.out.println(touristCities);
		
				
//		3. Create an array of 10 numbers (any 10 numbers) and print out the Average of 5th and
//		6th Value.
		
		int [] numbers = {1,2,3,4,5,6,7,8,81,9}; // array of 10 numbers
		int avg = numbers[4] + numbers[6];
		int Average = avg/2;
		
		System.out.println(Average);
		
//		4. Create a list of the top 5 highest-grossing movies of all time and print out the third
//		movie on the list.
		
		List <String> movies = new ArrayList<String>(); // no linkedlist - its random
		
		movies.add("Dangal");
		movies.add("Avatar");
		movies.add("Interstellar");
		movies.add("Sairat");
		movies.add("The Prestige");
		
		System.out.println("top 5 highest-grossing movies: "+ movies.get(2));
		

	}

}
