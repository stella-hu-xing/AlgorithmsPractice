package codility;

//Find the smallest positive integer that does not occur in a given sequence.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class first_missing_positive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		first_missing_positive fmp = new first_missing_positive();
		int[] A= {1,2,3};
		System.out.println(fmp.firstMissingPositive2(A));
	}

	// suggested solution
	public int firstMissingPositive2(int[] A) {
		long max = A[0];
		Set<Integer> set = new HashSet<>();

		for (int i = 0; i < A.length; i++) {
			if (A[i] > 0) {
				if (set.add(A[i])) {
					if (max < A[i]) {
						max = A[i];
					}
				}
			}
		}

		for (int i = 1; i < max + 2; i++) {
			if (!set.contains(i))
				return i;
		}
		return 1;
	}

	// whole correct, no performance
	public int firstMissingPositive1(int[] nums) {
		if (nums.length == 0)
			return 1;
		Arrays.sort(nums);
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > 0 && !list.contains(nums[i])) {
				list.add(nums[i]);

			}
		}
		if (list.size() == 0)
			return 1;
		for (int v = 0; v < list.size(); v++) {
			if (list.get(v) != v + 1) {
				return v + 1;
			}
		}
		return (list.get(list.size() - 1)) + 1;
	}

}
