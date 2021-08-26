package week3.day2.assignments;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RemoveDuplicateStringUsingCollectionsSet {

	public static void main(String[] args) {

		String text = "We learn java basics as part of java sessions in java week1";
		String[] split = text.split(" ");

		// Remove Duplicates using List

		System.out.println("Remove Duplicate String Using List : ");

		List<String> strList = new ArrayList<String>(Arrays.asList(split));
		for (int i = 0; i < (strList.size()) - 2; i++) {
			for (int j = i + 1; j < strList.size(); j++) {
				if (strList.get(i).equalsIgnoreCase(strList.get(j)))
					strList.remove(j);
			}
		}

		for (String string : strList) {
			System.out.print(string + " ");
		}
		System.out.println();

		// Remove Duplicates Using Set

		System.out.println("Remove Duplicate String Using Set : ");

		Set<String> stringSet = new LinkedHashSet<String>();
		Collections.addAll(stringSet, split);
		for (String string : stringSet) {
			System.out.print(string + " ");
		}
	}

}
