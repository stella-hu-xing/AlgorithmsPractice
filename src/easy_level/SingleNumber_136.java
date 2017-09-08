package easy_level;

;

/**
 * 
 * Given an array of integers, every element appears twice except for one. Find
 * that single one.
 * 
 * Note: Your algorithm should have a linear runtime complexity. Could you
 * implement it without using extra memory?
 * 
 * @author xinghu
 *
 */
public class SingleNumber_136 {

	public static void main(String[] args) {
		SingleNumber_136 sn = new SingleNumber_136();
		int[] a = { 0 };
		System.out.println(sn.singleNumber(a));
	}

	// quick sort + delete the same numbers
	// a slow method
	// runtime: 167 ms beats 1.36%
	public int singleNumber(int[] nums) {

		if (nums == null || nums.length == 0) {
			return -1;
		}

		if (nums.length == 1)
			return nums[0];
		this.array = nums;
		length = nums.length;
		quickSort(0, length - 1);
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]);
		}
		for (int i = 1; i < nums.length - 1; i++) {
			if (nums[i] != nums[i + 1] && nums[i] != nums[i - 1]) {
				return nums[i];
			}
			if (nums[0] != nums[1]) {
				return nums[0];

			}
			if (nums[nums.length - 2] != nums[nums.length - 1]) {
				return nums[nums.length - 1];
			}
		}
		return -1;
	}

	private int array[];
	private int length;

	private void quickSort(int lowerIndex, int higherIndex) {

		int i = lowerIndex;
		int j = higherIndex;
		// calculate pivot number, I am taking pivot as middle index number
		int pivot = array[lowerIndex + (higherIndex - lowerIndex) / 2];
		// Divide into two arrays
		while (i <= j) {
			/**
			 * In each iteration, we will identify a number from left side which
			 * is greater then the pivot value, and also we will identify a
			 * number from right side which is less then the pivot value. Once
			 * the search is done, then we exchange both numbers.
			 */
			while (array[i] < pivot) {
				i++;
			}
			while (array[j] > pivot) {
				j--;
			}
			if (i <= j) {
				exchangeNumbers(i, j);
				// move index to next position on both sides
				i++;
				j--;
			}
		}
		// call quickSort() method recursively
		if (lowerIndex < j)
			quickSort(lowerIndex, j);
		if (i < higherIndex)
			quickSort(i, higherIndex);
	}

	private void exchangeNumbers(int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

}
