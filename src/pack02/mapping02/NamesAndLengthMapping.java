package pack02.mapping02;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class NamesAndLengthMapping 
{
	public static void main(String[] args)
	{
		List<String> list = new ArrayList<>();
		list.add("Virah Kholi");
		list.add("Ashish Nehera");
		list.add("Sourav Ganguly");
		list.add("Abhinav Mukund");
		
		Stream<String> stream = list.stream();
		
		/*
		 * stream.map(name -> name.toUpperCase()+" "+name.length())
		 * .forEach(System.out::println);
		 */
		
		
		///Just Note for Getting Integer Stream
		IntStream intStream = stream.mapToInt(name -> name.length());
		intStream.forEach(System.out::println);
		
	}

}
