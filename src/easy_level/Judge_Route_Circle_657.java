package easy_level;

/**
 * @author xinghu
 * 
 *         Initially, there is a Robot at position (0, 0). Given a sequence of
 *         its moves, judge if this robot makes a circle, which means it moves
 *         back to the original place.
 * 
 *         The move sequence is represented by a string. And each move is
 *         represent by a character. The valid robot moves are R (Right), L
 *         (Left), U (Up) and D (down). The output should be true or false
 *         representing whether the robot makes a circle.
 * 
 *         Example 1: Input: "UD" Output: true
 * 
 *         Example 2: Input: "LL" Output: false
 */
public class Judge_Route_Circle_657 {

	public static void main(String[] args) {
		Judge_Route_Circle_657 jrc = new Judge_Route_Circle_657();
		String input = "RULD";
		System.out.println("the result of " + input + " = " + jrc.judgeCircle(input));
	}

	public boolean judgeCircle(String moves) {

		int hor = 0, ver = 0;

		for (char item : moves.toCharArray()) {
			// dont forget break!!!
			switch (item) {
			case 'U':
				ver++;
				break;
			case 'D':
				ver--;
				break;
			case 'L':
				hor++;
				break;
			case 'R':
				hor--;
				break;
			}
		}

		return (hor == 0 && ver == 0);
	}

}
