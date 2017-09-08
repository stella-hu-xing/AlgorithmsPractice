package hard_level;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * given an array A of N integers, returns the smallest positive integer
 * (greater than 0) that does not occur in A.
 * 
 * For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.
 * 
 * For another example, given A = [1, 2, 3], the function should return 4.
 * 
 * Given A = [−1, −3], the function should return 1.
 * 
 * @author xinghu
 *
 */
public class first_missing_positive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		first_missing_positive cdt = new first_missing_positive();
		int[] A = { 1 };
		System.out.println("final:" + cdt.solution(A));
	}

	public int solution(int[] A) {
		if (A.length == 0)
			return 1;
		Arrays.sort(A);
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < A.length; i++) {
			if (A[i] > 0 && !list.contains(A[i])) {
				list.add(A[i]);

			}
		}
		if (list.size() == 0)
			return 1;
		for (int v = 0; v < list.size(); v++) {
			if (list.get(v) != v + 1) {
				return v + 1;
			}
		}
		return list.get(list.size() - 1) + 1;
	}

	public int solution100(int[] A) {
		int i = 0;
		while (i < A.length) {
			if (A[i] == i + 1 || A[i] <= 0 || A[i] > A.length)
				i++;
			else if (A[A[i] - 1] != A[i])
				swap(A, i, A[i] - 1);
			else
				i++;
		}
		i = 0;
		while (i < A.length && A[i] == i + 1)
			i++;
		return i + 1;
	}

	private void swap(int[] A, int i, int j) {
		int temp = A[i];
		A[i] = A[j];
		A[j] = temp;
	}

}
