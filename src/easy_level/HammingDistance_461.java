package easy_level;

/**
 * The Hamming distance between two integers is the number of positions at which
 * the corresponding bits are different.
 * 
 * Given two integers x and y, calculate the Hamming distance.
 * 
 * @author xinghu Example:
 * 
 *         Input: x = 1, y = 4
 * 
 *         Output: 2
 * 
 *         Explanation: 1 (0 0 0 1) 4 (0 1 0 0) ↑ ↑
 * 
 *         The above arrows point to positions where the corresponding bits are
 *         different.
 */
public class HammingDistance_461 {


	public static void main(String[] args) {
		HammingDistance_461 hd = new HammingDistance_461();
		System.out.println(hd.hammingDistance(1, 4));
	}
	
	//Runtime: 12 ms  beats 39.34%
	public int hammingDistance(int x, int y) {

		int cur = 0;
		String n = Integer.toBinaryString(x ^ y);
	
		for(int i = 0; i< n.length();i++){
			if (n.charAt(i) == '1')  cur++;
		}
		return cur;
	}

	//Runtime: 12 ms  beats 39.34%  related to the web speed
	public int hammingDistance2(int x, int y) {
		return Integer.bitCount(x^y);
	}
}
