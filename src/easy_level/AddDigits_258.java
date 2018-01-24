package easy_level;

/**
 * 这题需要发现规律，否则复杂度太高
 * 
 * Given a non-negative integer num, repeatedly add all its digits until the
 * result has only one digit.
 * 
 * For example:
 * 
 * Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2.
 * 
 * Since 2 has only one digit, return it.
 * 
 * @author xinghu
 *
 * Could you do it without any loop/recursion in O(1) runtime?
 */

//
// this question also name "digital root" in Wikipedia
public class AddDigits_258 {

	public static void main(String[] args) {

		AddDigits_258 object = new AddDigits_258();
		System.out.print("1:  " + object.addDigits1(38));
	}

	// Runtime: 5 ms beats2.09%
	public int addDigits1(int num) {
		int a = add1(num);
		while (a >= 10) {
			a = add1(a);
		}
		return a;
	}

	public int add1(int nn) {
		int a = 0;
		for (int i = String.valueOf(nn).length(); i >= 0; i--) {
			int b = (int) (nn / Math.pow(10, i)); // Return the value of the
													// number 10 to the power of
													// i
			a += b;
			nn = (int) (nn - b * Math.pow(10, i));
		}
		return a;
	}
}
