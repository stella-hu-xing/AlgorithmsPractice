package easy_level;

import java.util.ArrayList;

/**
 * Given a binary array, find the maximum number of consecutive 1s in this
 * array.
 * 
 * Example 1: Input: [1,1,0,1,1,1] Output: 3 Explanation: The first two digits
 * or the last three digits are consecutive 1s. The maximum number of
 * consecutive 1s is 3.
 * 
 * @author xinghu
 *
 */
public class MaxConsecutiveOnes_485 {

	public static void main(String[] args) {
		MaxConsecutiveOnes_485 mso = new MaxConsecutiveOnes_485();
		int[] a = { 1,1,1,1,0,1,1,1,1,0,1,1,1};
		System.out.println(mso.findMaxConsecutiveOnes3(a) + " final");

	}

	//runtime 24ms beat 2.49%
	public int findMaxConsecutiveOnes(int[] nums) {
		if (nums.length == 0)  return 0;
		ArrayList<Integer> temp = new ArrayList<Integer>();

		int max = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1) {
				temp.add(nums[i]);
			} else {
				if (max <= temp.size()) {
					max = temp.size();
				}
				temp.clear();
			}
		}
		return (max > temp.size() ? max : temp.size());
	}
	
	
	//using a counter instead of a arraylist to save space
	//runtime: 11ms beats 51.49%
	public int findMaxConsecutiveOnes2(int[] nums) {
		
		int counter = 0; 
		
		if (nums.length == 0)  return 0;

		int max = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1) {
				counter = counter + 1;
			} else {
				if (max <= counter) {
					max = counter;
				}
				counter = 0;
			}
		}
		return (max > counter ? max : counter);
	}

	// runtime: 10ms  beats: 67.40%
	public int findMaxConsecutiveOnes3(int[] nums) {
		int max = 0, cur = 0;
		for(int n: nums){
			if(n==1){
				
				cur = cur+1;
			}else{
				max = max>=cur? max : cur;
				cur = 0;
			}
		}
		return max>cur ? max : cur;
	}
}
