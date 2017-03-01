package easy_level;

/**
 * You are given a map in form of a two-dimensional integer grid where 1
 * represents land and 0 represents water. Grid cells are connected
 * horizontally/vertically (not diagonally). The grid is completely surrounded
 * by water, and there is exactly one island (i.e., one or more connected land
 * cells). The island doesn't have "lakes" (water inside that isn't connected to
 * the water around the island). One cell is a square with side length 1. The
 * grid is rectangular, width and height don't exceed 100. Determine the
 * perimeter of the island.
 * 
 * Example:
 * 
 * [[0,1,0,0], [1,1,1,0], [0,1,0,0], [1,1,0,0]]
 * 
 * Answer: 16
 * 
 * @author xinghu
 *
 */
public class IslandPerimeter_463 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	// Runtime: 146 ms beats 67.68%
	public int islandPerimeter(int[][] grid) {
		int all = 0;
		int s = 0;
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				if (grid[i][j] == 1) {
					all += 1;
					if (j < (grid[i].length - 1) && (i < grid.length - 1)) {
						if (grid[i][(j + 1)] > 0) {
							s = s + 1;
						}

						if (grid[i + 1][j] > 0)
							s = s + 1;

					} else if (i == grid.length - 1 && j < (grid[i].length - 1)) {
						if (grid[i][j + 1] > 0)
							s += 1;
					} else if (i < grid.length - 1 && j == (grid[i].length - 1)) {
						if (grid[i + 1][j] > 0)
							s += 1;
					}
				}
			}
		}
		return 4 * all - 2 * s;
	}

}
