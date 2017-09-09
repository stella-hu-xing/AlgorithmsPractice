package codility;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * The difference between the two parts is the value of: |(A[0] + A[1] + ... +
 * A[P − 1]) − (A[P] + A[P + 1] + ... + A[N − 1])|
 * 
 * In other words, it is the absolute difference between the sum of the first
 * part and the sum of the second part.
 * 
 * For example, consider array A such that:
 * 
 * A[0] = 3 A[1] = 1 A[2] = 2 A[3] = 4 A[4] = 3 We can split this tape in four
 * places:
 * 
 * P = 1, difference = |3 − 10| = 7 P = 2, difference = |4 − 9| = 5 P = 3,
 * difference = |6 − 7| = 1 P = 4, difference = |10 − 3| = 7
 * 
 * given a non-empty zero-indexed array A of N integers, returns the minimal
 * difference that can be achieved.
 * 
 * the function should return 1,
 * 
 * @author xinghu
 *
 */
public class tape_equilibrium {

	public static void main(String[] args) {
		tape_equilibrium te = new tape_equilibrium();
		int[] A = { 3, 1, 2, 4, 3 };

		System.out.print(te.solution2(A));

	}

	// solution 1: with 100% correctness, 0% performance
	public int solution(int[] A) {

		int dif = 100000;
		for (int i = 1; i < A.length; i++) {
			int result = calculateDif(A, i);
			dif = dif < result ? dif : result;
		}
		return dif;
	}

	public int calculateDif(int[] nums, int K) {
		int a = 0, b = 0;
		for (int i = 0; i < nums.length; i++) {
			if (i < K) {
				a += nums[i];
			} else {
				b += nums[i];
			}
		}
		return a > b ? a - b : b - a;
	}

	// solution 2
	public int solution2(int[] A) {
		int dif = 100000000;

		for (int i = 0; i < A.length - 1; i++) {
			long sum1 = IntStream.of(Arrays.copyOfRange(A, 0, i+1 )).asLongStream().sum();
		
			long sum2 = IntStream.of(Arrays.copyOfRange(A, i + 1, A.length)).asLongStream().sum();
			
			int result = (int) (sum1 > sum2 ? sum1 - sum2 : sum2 - sum1);
			
			dif = dif < result ? dif : result;
		}
		return dif;
	}

}
