package easy_level;

/**
 * Given a positive integer, output its complement number. The complement
 * strategy is to flip the bits of its binary representation.
 * 
 * Note: 1.The given integer is guaranteed to fit within the range of a 32-bit
 * signed integer. 2.You could assume no leading zero bit in the integer’s
 * binary representation.
 * 
 * @author xinghu
 *
 *         still need to optimize
 */
public class NumberComplement_476 {

	// Runtime: 34 ms
	public int findComplement1(int num) {
		char[] bina = Integer.toBinaryString(num).toCharArray();

		for (int i = 0; i < bina.length; i++) {
			if (bina[i] == '0')
				bina[i] = '1';
			else
				bina[i] = '0';
			System.out.println("++++" + bina[i]);
		}
		String n = new String(bina);
		System.out.println("---" + n);
		int b = Integer.parseInt(n, 2);
		System.out.println(b);
		return b;
	}

}
