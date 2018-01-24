package easy_level;

/**
 * @author xinghu
 * 
 *         A matrix is Toeplitz if every diagonal from top-left to bottom-right
 *         has the same element.
 * 
 *         Now given an M x N matrix, return True if and only if the matrix is
 *         Toeplitz.
 * 
 *         Example 1:
 * 
 *         Input: matrix = [[1,2,3,4],[5,1,2,3],[9,5,1,2]] Output: True
 *         Explanation: 1234 5123 9512
 * 
 *         In the above grid, the diagonals are "[9]", "[5, 5]", "[1, 1, 1]",
 *         "[2, 2, 2]", "[3, 3]", "[4]", and in each diagonal all elements are
 *         the same, so the answer is True.
 * 
 *         Example 2:
 * 
 *         Input: matrix = [[1,2],[2,2]] Output: False Explanation: The diagonal
 *         "[1, 2]" has different elements.
 * 
 *         Note: matrix will be a 2D array of integers. matrix will have a
 *         number of rows and columns in range [1, 20]. matrix[i][j] will be
 *         integers in range [0, 99].
 */
public class Toeplitz_Matrix_766 {

	public static void main(String[] args) {
		Toeplitz_Matrix_766 tm = new Toeplitz_Matrix_766();
		//int[][] arr = { { 1, 2, 3, 4 }, { 5, 1, 2, 3 }, { 9, 5, 1, 2 } };
		int[][] arr = {{1,2},{2,2}};
		System.out.println(tm.isToeplitzMatrix(arr));
	}

	/**
	 * Hint: Check whether each value is equal to the value of it's top-left
	 * neighbor.
	 * 
	 * @param matrix
	 * @return
	 */
	public boolean isToeplitzMatrix(int[][] matrix) {

		int m = matrix.length, n = matrix[0].length;
		for (int i = m - 1; i >= 0; i--) {
			for (int j = 0; j < n; j++) {
				//System.out.println(i + " " + j + " " + matrix[i][j]);
				if (i != 0 && j != 0) {
					//System.out.println(matrix[i][j] + "的左上是 " + matrix[i - 1][j - 1]);
					if (matrix[i][j] != matrix[i - 1][j - 1])
						return false;
				}
			}
		}
		return true;
	}

}
