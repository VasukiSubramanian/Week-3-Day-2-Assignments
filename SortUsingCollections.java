package week3.day2.assignments;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortUsingCollections {

	public static void main(String[] args) {
		String[] str = { "Aspire systems", "cts", "wipro", "Hcl" };
		// int length = str.length;
		List<String> strAsList = Arrays.asList(str);
		Collections.sort(strAsList);
		Collections.reverse(strAsList);
		System.out.println(strAsList);
	}

}
