package easy_level;

import java.util.ArrayList;
import java.util.List;

/**
 * 不算简单，这个方法不错
 * Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array), some
 * elements appear twice and others appear once.
 * 
 * Find all the elements of [1, n] inclusive that do not appear in this array.
 * 
 * Could you do it without extra space and in O(n) runtime? You may assume the
 * returned list does not count as extra space.
 * 
 * Example:
 * 
 * Input: [4,3,2,7,8,2,3,1]
 * 
 * Output: [5,6]
 * 
 * @author xinghu
 *
 */
public class FindAllNumbersDisappearedinAnArray_448 {

	public static void main(String[] args) {
		FindAllNumbersDisappearedinAnArray_448 fanda = new FindAllNumbersDisappearedinAnArray_448();
		int[] a = { 2, 4, 1, 1, 1, 8 };
		System.out.println(fanda.findDisappearedNumbers(a));
	}

	// a way inspired by the sample solution, saving the extra spaces and in
	// O(n) time

	// runtime 19 ms , beats 40.60%
	public List<Integer> findDisappearedNumbers(int[] nums) {

		List<Integer> answer = new ArrayList<Integer>();

		for (int i = 0; i < nums.length; i++) {
			int index = Math.abs(nums[i]) - 1;
			if (nums[index] > 0) {
				nums[index] = -nums[index];
			}
		}

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > 0) {
				answer.add(i + 1);
			}
		}

		return answer;
	}



}
