package easy_level;

import java.util.ArrayList;

/**
 * You're given a matrix represented by a two-dimensional array, and two
 * positive integers r and c representing the row number and column number of
 * the wanted reshaped matrix, respectively.
 * 
 * The reshaped matrix need to be filled with all the elements of the original
 * matrix in the same row-traversing order as they were.
 * 
 * If the 'reshape' operation with given parameters is possible and legal,
 * output the new reshaped matrix; Otherwise, output the original matrix.
 * 
 * Example 1: Input: nums = [[1,2], [3,4]] r = 1, c = 4 Output: [[1,2,3,4]]
 * Explanation: The row-traversing of nums is [1,2,3,4]. The new reshaped matrix
 * is a 1 * 4 matrix, fill it row by row by using the previous list.
 * 
 * Example 2: Input: nums = [[1,2], [3,4]] r = 2, c = 4 Output: [[1,2], [3,4]]
 * Explanation:There is no way to reshape a 2 * 2 matrix to a 2 * 4 matrix. So
 * output the original matrix.
 * 
 * Note: The height and width of the given matrix is in range [1, 100]. The
 * given r and c are all positive.
 * 
 * @author xinghu
 *
 */
public class ReshapetheMatrix_566 {

	public static void main(String[] args) {
		ReshapetheMatrix_566 rm = new ReshapetheMatrix_566();
		int[][] nums = { { 1, 2 }, { 3, 4 }, { 5, 6 } };
		System.out.println(rm.matrixReshape(nums, 2, 3));

	}

	// accepted, but stupid approach
	public int[][] matrixReshape(int[][] nums, int r, int c) {

		int a = nums.length, b = nums[0].length;
		if (a * b != r * c) {
			return nums;
		} else {
			int[][] result = new int[r][c];
			ArrayList<Integer> temp = new ArrayList<Integer>();
			for (int i = 0; i < a; i++) {
				for (int j = 0; j < b; j++) {
					temp.add(nums[i][j]);
				}
			}
			int count = 0;
			for (int i = 0; i < r; i++) {
				for (int j = 0; j < c; j++) {
					result[i][j] = temp.get(count);
					count++;
				}
			}

			return result;

		}

	}

}
