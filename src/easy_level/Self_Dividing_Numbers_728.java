package easy_level;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xinghu
 * 
 *         A self-dividing number is a number that is divisible by every digit
 *         it contains.
 * 
 *         For example, 128 is a self-dividing number because 128 % 1 == 0, 128
 *         % 2 == 0, and 128 % 8 == 0.
 * 
 *         Also, a self-dividing number is not allowed to contain the digit
 *         zero.
 * 
 *         Given a lower and upper number bound, output a list of every possible
 *         self dividing number, including the bounds if possible.
 * 
 *         Example 1:
 * 
 *         Input: left = 1, right = 22
 * 
 *         Output: [1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22]
 * 
 *         Note: The boundaries of each input argument are 1 <= left <= right <=
 *         10000.
 */
public class Self_Dividing_Numbers_728 {

	public static void main(String[] args) {
		Self_Dividing_Numbers_728 sdn = new Self_Dividing_Numbers_728();
		int left = 1, right = 22;

		List<Integer> re = sdn.selfDividingNumbers(left, right);
		System.out.println(re);

	}

	public List<Integer> selfDividingNumbers(int left, int right) {
		List<Integer> result = new ArrayList<Integer>();

		for (int i = left; i <= right; i++) {
			if (checkSelfDividing(i) == true)
				result.add(i);
		}
		return result;
	}

	public boolean checkSelfDividing(int item) {

		String content = String.valueOf(item);

		for (char c : content.toCharArray()) {
			if (c == '0')
				return false;
			if (item % (Integer.parseInt(String.valueOf(c))) != 0)
				return false;
		}
		return true;
	}

}
