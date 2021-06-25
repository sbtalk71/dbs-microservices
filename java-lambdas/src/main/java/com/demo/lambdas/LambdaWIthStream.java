package com.demo.lambdas;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LambdaWIthStream {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("shantanu", "arun", "ranga", "ashok", "kiran", "vamshi krishna", "sheetal");

		// names.stream().forEach(name->System.out.println(name));

		Printer printer = new Printer();
		names.stream().filter(t -> t.startsWith("sh")).forEach(printer::print);

		// find out the length of the logest string in the list

		System.out.println(names.stream().mapToInt(name -> name.length()).max().getAsInt());

		List<Integer> nums = Arrays.asList(1, 2, 4, 5, 6, 78, 98, 4, 56, 78, 23, 42, 46, 12, 14, 35);
		List<Integer> nums1 = Arrays.asList(0);

		// Use Streams API to do the following
		// count the numbers and print it
		System.out.println(nums.stream().count());
		// find out the even numbers and print them
		nums.stream().filter(num -> num % 2 == 0).filter(num -> num > 40).sorted((n1, n2) -> n1.compareTo(n2))
				.forEach(System.out::println);

		// find the odd numbers and print them

		// find the sum of even numbers

		System.out.println(nums.stream().filter(num -> num % 2 == 0).mapToInt(n -> n.intValue()).sum());

		// add 10 to each even number and find the max even number
		System.out.println(
				nums.stream().filter(num -> num % 2 == 0).mapToInt(n -> n.intValue() + 10).reduce((n1, n2) -> n1 * n2));
		List<Integer> evenList=nums.stream().filter(num -> num % 2 == 0).collect(Collectors.toList());

		try {
			// System.out.print(Files.lines(Paths.get("pom.xml")).count());
			long count = Files.lines(Paths.get("mywords.txt")).flatMap(line -> Arrays.stream(line.split("\\s")))
					.count();
			System.out.println(count);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

class Printer {

	public void print(String s) {
		System.out.println(s);
	}
}
