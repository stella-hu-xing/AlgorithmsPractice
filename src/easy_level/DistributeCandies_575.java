package easy_level;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Given an integer array with even length, where different numbers in this
 * array represent different kinds of candies. Each number means one candy of
 * the corresponding kind. You need to distribute these candies equally in
 * number to brother and sister. Return the maximum number of kinds of candies
 * the sister could gain.
 * 
 * Example 1: Input: candies = [1,1,2,2,3,3] Output: 3 Explanation: There are
 * three different kinds of candies (1, 2 and 3), and two candies for each kind.
 * Optimal distribution: The sister has candies [1,2,3] and the brother has
 * candies [1,2,3], too. The sister has three different kinds of candies.
 * 
 * Example 2: Input: candies = [1,1,2,3] Output: 2 Explanation: For example, the
 * sister has candies [2,3] and the brother has candies [1,1]. The sister has
 * two different kinds of candies, the brother has only one kind of candies.
 * 
 * Note:
 * 
 * The length of the given array is in range [2, 10,000], and will be even. The
 * number in given array is in range [-100,000, 100,000].
 * 
 * @author xinghu
 *
 */
public class DistributeCandies_575 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] test = { 1, 1, 2, 4, 5, 6, 6, 6 };
		DistributeCandies_575 dc = new DistributeCandies_575();

		System.out.println(dc.distributeCandies(test));

	}

	// time limited exceeded
	public int distributeCandies(int[] candies) {

		ArrayList<Integer> temp = new ArrayList<Integer>();
		for (int i : candies) {
			if (!temp.contains(i)) {
				temp.add(i);
			}
		}
		int a = temp.size(), b = candies.length / 2;
		// if (temp.size() >= (candies.length / 2)) {
		// return candies.length / 2;
		// } else {
		// return temp.size();
		// }
		return a >= b ? b : a;

	}

	// 79 ms beats 95.77%
	public int distributeCandies2(int[] candies) {

		Set<Integer> temp = new HashSet<Integer>();
		for (int i : candies) {

			temp.add(i);

		}
		int a = temp.size(), b = candies.length / 2;
		// if (temp.size() >= (candies.length / 2)) {
		// return candies.length / 2;
		// } else {
		// return temp.size();
		// }
		return a >= b ? b : a;

	}

}
