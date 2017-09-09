package easy_level;

import java.util.Arrays;

public class missing_number_268 {

	public static void main(String[] args) {
		missing_number_268 mn = new missing_number_268();
		int[] nums = {0,1};
		System.out.println(mn.missingNumber(nums));

	}

	public int missingNumber(int[] nums) {

		 
		Arrays.sort(nums);
		System.out.println("length "+nums.length);
		if (nums.length == 0 || nums[0] != 0)
			return 0;
		if (nums.length == 1 && nums[0] == 0)
			return 1;
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i + 1] - nums[i] != 1) {
				System.out.println("here");
				return nums[i] + 1;
			}
		}
		
		return nums.length;
	}
}
