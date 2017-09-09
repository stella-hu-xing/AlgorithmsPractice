package codility;

import java.util.Arrays;

public class missing_number {

	public static void main(String[] args) {
		missing_number mn = new missing_number();
		int[] nums = { 0, 1 };
		System.out.println(mn.missingNumber(nums));

	}

	public int missingNumber(int[] nums) {

		 Arrays.sort(nums);
			
		 if (nums[0] != 1 || nums.length == 0)
		 return 1;
		 if (nums.length == 1 && nums[0] == 1)
				return 2;
		 for (int i = 0; i < nums.length - 1; i++) {
		 if (nums[i + 1] - nums[i] != 1) {
		 return nums[i] + 1;
		 }
		 }
		 return nums.length + 1;
	}
}
