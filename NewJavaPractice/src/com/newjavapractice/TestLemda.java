package com.newjavapractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestLemda {

	public static void main(String[] args) {
		List<Integer> numbers=Arrays.asList(1,2,3,4,5);
       //   numbers.forEach((Integer value)->System.out.println(value));
		System.out.println(
				numbers.stream()
				.filter(e->e%2==0)
				.mapToInt(e->e*2)
				.sum()
				);
		System.out.println("vishal");
	}

}
