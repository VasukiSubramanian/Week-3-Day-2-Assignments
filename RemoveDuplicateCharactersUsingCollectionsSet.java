package week3.day2.assignments;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateCharactersUsingCollectionsSet {

	public static void main(String[] args) {
		String str = "PayPal India";
		char[] charArray = str.toCharArray();
		Set<Character> charSet = new LinkedHashSet<Character>();
		for (int i = 0; i < charArray.length; i++) {
			charSet.add(charArray[i]);
		}

		for (Character character : charSet) {
			System.out.print(character);
		}
	}

}
