package codility;

/**
 * Rotation of the array means that each element is shifted right by one index,
 * and the last element of the array is also moved to the first place.
 * 
 * For example, the rotation of array A = [3, 8, 9, 7, 6] is [6, 3, 8, 9, 7].
 * The goal is to rotate array A K times; that is, each element of A will be
 * shifted to the right by K indexes. For example, given array A = [3, 8, 9, 7,
 * 6] and K = 3, the function should return [9, 7, 6, 3, 8].
 * 
 * @author xinghu
 *
 */
public class rotation_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rotation_array ra = new rotation_array();
		int[] A = { 1,2 };
		int[] B = ra.solution(A, 1);
		for (int i = 0; i < A.length; i++) {
			System.out.print(B[i]);
		}

	}

	public int[] solution(int[] A, int K) {
		int[] B = new int[A.length];
		for (int i = 0; i < A.length; i++) {

			B[(i + K) % A.length] = A[i];

		}

		return B;
	}

}
