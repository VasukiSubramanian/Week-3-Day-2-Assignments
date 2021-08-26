package week3.day2.assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class FindSecondLargestUsingCollections {

	public static void main(String[] args) {

		Integer[] data = { 3, 2, 11, 4, 6, 7 };

		// Second Largest Using list

		List<Integer> intList = new ArrayList<Integer>(Arrays.asList(data));
		Collections.sort(intList);
		System.out.println("Second Largest number of the array Using List : " + intList.get(intList.size() - 2));

		// Second Largest Using Set

		TreeSet<Integer> intSet = new TreeSet<Integer>();
		Collections.addAll(intSet, data);
		intSet.pollLast();
		System.out.println("Second Largest number of the array Using Set : " + intSet.last());

	}

}