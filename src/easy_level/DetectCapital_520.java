package easy_level;

/**
 * 简单
 * Given a word, you need to judge whether the usage of capitals in it is right
 * or not.
 * 
 * We define the usage of capitals in a word to be right when one of the
 * following cases holds:
 * 
 * All letters in this word are capitals, like "USA".
 * All letters in this word are not capitals, like "leetcode". 
 * Only the first letter in this word is capital if it has more than one letter, like "Google". 
 * Otherwise, we define that this word doesn't use capitals in a right way.
 * 
 * @author xinghu
 *
 */
public class DetectCapital_520 {

	public static void main(String[] args) {
		DetectCapital_520 dc = new DetectCapital_520();

		System.out.println(dc.detectCapitalUse("GGfff"));
	}

	// runtime: 39 ms beats: 33.30%
	public boolean detectCapitalUse(String word) {

		boolean answer = true;

		char[] cur = word.toCharArray();
		for (int i = 0; i < cur.length - 1; i++) {
			if ((Character.isLowerCase(cur[i]) && Character.isUpperCase(cur[i + 1]))
					|| (i >= 1 && Character.isUpperCase(cur[i]) && Character.isLowerCase(cur[i + 1]))) {
				answer = false;
			}
		}
		return answer;
	}

	// one amazing solution inspired by sample solution
	//runtime 35ms beats 47.69%
	public boolean detectCapitalUse2(String word) {

		return (word.equals(word.toUpperCase()) || word.equals(word.toLowerCase())
				|| (Character.isUpperCase(word.charAt(0))
						&& word.substring(1).equals(word.substring(1).toLowerCase())));
	}
}
