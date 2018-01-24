package easy_level;

import java.util.Arrays;
import java.util.List;

/**
 * 
 * @author xinghu
 *
 *         Given two lists Aand B, and B is an anagram of A. B is an anagram of
 *         A means B is made by randomizing the order of the elements in A.
 * 
 *         We want to find an index mapping P, from A to B. A mapping P[i] = j
 *         means the ith element in A appears in B at index j.
 * 
 *         These lists A and B may contain duplicates. If there are multiple
 *         answers, output any of them.
 * 
 *         For example, given
 * 
 *         A = [12, 28, 46, 32, 50] B = [50, 12, 32, 46, 28] We should return
 *         [1, 4, 3, 2, 0] as P[0] = 1 because the 0th element of A appears at
 *         B[1], and P[1] = 4 because the 1st element of A appears at B[4], and
 *         so on.
 * 
 *         Note:
 * 
 *         A, B have equal lengths in range [1, 100]. A[i], B[i] are integers in
 *         range [0, 10^5].
 */
public class Find_Anagram_Mappings_760 {

	public static void main(String[] args) {

		Find_Anagram_Mappings_760 fam = new Find_Anagram_Mappings_760();
		int[] A = { 12, 28, 46, 32, 50 };
		int[] B = { 50, 12, 32, 46, 28 };
		int[] C = fam.anagramMappings(A, B);
		System.out.println(Arrays.toString(C));
	}

	// Version 1
	public int[] anagramMappings(int[] A, int[] B) {

		int[] result = new int[A.length];

		for (int i = 0; i < A.length; i++) {
			result[i] = getArrayIndex(B, A[i]);
		}
		return result;
	}

	public int getArrayIndex(int[] A, int item) {
		for (int i = 0; i < A.length; i++) {
			if (item == A[i])
				return i;
		}
		return -1;
	}

	/**
	 * Version 2 还没找到合适的
	 * 
	 * @param A
	 *            int[]
	 * @param B
	 *            int[]
	 * @return
	 */

}
