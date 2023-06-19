/*
[LeetCode1812. Determine Color of a Chessboard Square]
You are given coordinates, a string that represents the coordinates of a square of the chessboard. Below is a chessboard for your reference.

Return true if the square is white, and false if the square is black.

The coordinate will always represent a valid chessboard square. The coordinate will always have the letter first, and the number second.



Example 1:

Input: coordinates = "a1"
Output: false
Explanation: From the chessboard above, the square with coordinates "a1" is black, so return false.
Example 2:

Input: coordinates = "h3"
Output: true
Explanation: From the chessboard above, the square with coordinates "h3" is white, so return true.
Example 3:

Input: coordinates = "c7"
Output: false


Constraints:

coordinates.length == 2
'a' <= coordinates[0] <= 'h'
'1' <= coordinates[1] <= '8'
 */

package sourcecode_2023.March;

public class LeetCode1812_DetermineColorOfAChessboardSquare {
    /**
     * @BelongsProject: LeetCode-Java
     * @BelongsPackage: sourcecode_2023.march
     * @CreateTime: 2023/3/20
     * @Author: Sixiaoyou
     * @Version: 1.0
     */
    class Solution {
        public boolean squareIsWhite(String coordinates) {
            char[] chars = coordinates.toCharArray();
            int a = chars[0] - 'a' + 1;
            int b = chars[1] - '0';
            return ((a & 1) ^ (b & 1)) == 1;
        }
    }
}
