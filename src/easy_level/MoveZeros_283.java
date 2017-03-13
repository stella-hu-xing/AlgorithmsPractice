package easy_level;

/**
 * Given an array nums, write a function to move all 0's to the end of it while
 * maintaining the relative order of the non-zero elements.
 * 
 * For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums
 * should be [1, 3, 12, 0, 0].
 * 
 * Note: You must do this in-place without making a copy of the array. Minimize
 * the total number of operations.
 * 
 * @author xinghu
 *
 */
public class MoveZeros_283 {

	public static void main(String[] args) {
		MoveZeros_283 mz = new MoveZeros_283();

		int[] a = { 1,0 };
		mz.moveZeroes(a);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

	// runtime: 1ms beats 17.62%
	public void moveZeroes(int[] nums){
		if(nums.length==0||nums.length==1) return;
		int increase = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				nums[increase++] = nums[i];
				
			}
		}
		for (int i = increase; i < nums.length; i++) {
			nums[i] = 0;
		}
	}
	

	// runtime: 1ms beats 17.62%
	public void moveZeroes2(int[] nums){
	      int counter =0;
	  	for (int i = 0; i < nums.length; i++) {
	  		if(nums[i]!=0){
	  			int temp = nums[i];
	  			nums[i]=nums[counter];
	  			nums[counter]=temp;
	  			counter++;
	  		}
	  	}
	}
	
	// runtime: 0ms beats 69.67%
	//only delete the extra statement ...improve 50%
	public void moveZeroes3(int[] nums) {
		
		int increase = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				nums[increase++] = nums[i];
				
			}
		}
		for (int i = increase; i < nums.length; i++) {
			nums[i] = 0;
		}
	}
}
