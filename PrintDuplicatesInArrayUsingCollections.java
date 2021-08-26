package week3.day2.assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class PrintDuplicatesInArrayUsingCollections {

	public static void main(String[] args) {

		Integer[] arr = { 14, 12, 13, 11, 15, 14, 18, 16, 17, 19, 18, 17, 20 };

		// Print Duplicates Using List

		List<Integer> arrList = new ArrayList<Integer>(Arrays.asList(arr));

		System.out.println("Duplicte values using List : ");

		for (int i = 0; i < arrList.size() - 2; i++) {
			for (int j = i + 1; j < arrList.size(); j++) {
				if (arrList.get(i) == arrList.get(j)) {
					System.out.println(arrList.get(i));
					break;
				}
			}

		}

		// Print Duplicates Using Set

		Set<Integer> arrSet = new LinkedHashSet<Integer>();
		System.out.println("Duplicate values using Set : ");
		for (Integer integer : arrList) {
			if (!arrSet.add(integer))
				System.out.println(integer);
		}
	}

}
