package easy_level;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given a List of words, return the words that can be typed using letters of
 * alphabet on only one row's of American keyboard like the image below.
 * 
 * Example 1: Input: ["Hello", "Alaska", "Dad", "Peace"] Output: ["Alaska",
 * "Dad"]
 * 
 * @author xinghu
 *
 */

public class KeyboardRow_500 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	// Runtime: 5 ms beat 40.99%
	public String[] findWords(String[] words) {

		if (words == null) {
			return null;
		} else {
			ArrayList<String> answers = new ArrayList<String>();
			for (int i = 0; i < words.length; i++) {

				String n = checkeach(words[i]);
				// System.out.println("asdf"+answers);
				if (n != null)
					answers.add(n);
			}
			String[] anw = answers.toArray(new String[0]);
			return anw;
		}
	}

	public String checkeach(String current) {
		List<Character> first = Arrays.asList('Q', 'W', 'E', 'R', 'T', 'Y', 'U', 'I', 'O', 'P', 'q', 'w', 'e', 'r', 't',
				'y', 'u', 'i', 'o', 'p');
		List<Character> second = Arrays.asList('a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'A', 'S', 'D', 'F', 'G',
				'H', 'J', 'K', 'L');
		List<Character> third = Arrays.asList('Z', 'X', 'C', 'V', 'B', 'N', 'M', 'z', 'x', 'c', 'v', 'b', 'n', 'm');

		char[] req = current.toCharArray();

		List<Character> range = null;
		if (first.contains(req[0]))
			range = first;
		else if (second.contains(req[0]))
			range = second;
		else if (third.contains(req[0]))
			range = third;

		for (int i = 1; i < req.length; i++) {
			if (range.contains(req[i])) {

			} else
				return null;
		}
		return current;
	}

}
