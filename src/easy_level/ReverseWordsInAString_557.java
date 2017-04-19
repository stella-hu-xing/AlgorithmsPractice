package easy_level;

import java.util.Stack;

/**
 * Given a string, you need to reverse the order of characters in each word
 * within a sentence while still preserving whitespace and initial word order.
 * 
 * Example 1: Input: "Let's take LeetCode contest" Output: "s'teL ekat edoCteeL
 * tsetnoc"
 * 
 * @author xinghu
 *
 */
public class ReverseWordsInAString_557 {

	public static void main(String[] args) {

		ReverseWordsInAString_557 rw = new ReverseWordsInAString_557();
		String a = "asdffd ded asd";
		System.out.println(rw.reverseWords2(a));
	}

	// using stack，but time executed exceed
	public String reverseWords(String s) {

		String result = "";
		Stack cur = new Stack();
		for (char i : s.toCharArray()) {

			if (i != ' ') {
				cur.push(i);
			} else {
				while (!cur.isEmpty()) {

					result += String.valueOf((char) cur.pop());

				}
				result += " ";
			}
		}
		while (!cur.isEmpty()) {
			result += String.valueOf((char) cur.pop());

		}

		return result;

	}

	//Runtime: 9 ms
	public String reverseWords2(String s) {

		String result = "";
		char[] ss = s.toCharArray();
		int a = 0;
		for (int i = 0; i < ss.length; i++) {
			if (ss[i] == ' ') {
				reverse(ss, a, i-1);
				a = i + 1;
			}
			
		}
        reverse(ss,a,ss.length-1);
        result = String.valueOf(ss);
		return result;
	}

	public void reverse(char[] ss, int a, int i) {
		
		while (a < i ) {
           char temp= ss[a];
           ss[a] = ss[i];
           ss[i] = temp;
           a++; i--;
		}
		
	}

}
