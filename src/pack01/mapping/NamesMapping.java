package pack01.mapping;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class NamesMapping 
{
	public static void main(String[] args) 
	{
		List<String> list = new ArrayList<>();
		list.add("Virah Kholi");
		list.add("Ashish Nehera");
		list.add("Sourav Ganguly");
		list.add("Abhinav Mukund");
		
		Stream<String> stream = list.stream();
		
		//Approach 0 Step by Step
		Stream<String> mappedStream =stream.map((p) ->p.toUpperCase());
		mappedStream.forEach((s) -> System.out.println(s));
		
		/*
		 * //Approach 1 >LAMBDA stream.map((s) -> s.toUpperCase()) .forEach((s) ->
		 * System.out.println(s));
		 */
		
		/*
		 * //APPROACH 2 Method reference stream.map((s) -> s.toUpperCase())
		 * .forEach(System.out::println);
		 */
		
	}

}
