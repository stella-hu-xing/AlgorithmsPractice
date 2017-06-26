package easy_level;

/**
 * 位运算还是要补课
 * 
 * Calculate the sum of two integers a and b, but you are not allowed to use the
 * operator + and -.
 * 
 * Example: Given a = 1 and b = 2, return 3.
 * 
 * @author xinghu
 * 
 * 不会位运算啊
 *
 */
public class SumofTwoIntegers_371 {

	public static void main(String[] args) {

	}

	public int getSum(int a, int b) {
		if (b == 0) {// 没有进位的时候完成运算
			return a;
		}
		int sum, carry;
		sum = a ^ b;// 完成第一步加法的运算
		carry = (a & b) << 1;// 完成第二步进位并且左移运算
		return getSum(sum, carry);//
	}
	
	// Recursive
	public int getSum2(int a, int b) {
		return (b == 0) ? a : getSum(a ^ b, (a & b) << 1);
	}
}
