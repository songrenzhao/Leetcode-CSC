/*
657. Judge Route Circle
Initially, there is a Robot at position (0, 0). Given a sequence of its moves, judge if this robot makes a circle, which means it moves back to the original place.

The move sequence is represented by a string. And each move is represent by a character. The valid robot moves are R (Right), L (Left), U (Up) and D (down). The output should be true or false representing whether the robot makes a circle.

Example 1:
Input: "UD"
Output: true
Example 2:
Input: "LL"
Output: false
*/

//Solution in Java
class Solution {
    public boolean judgeCircle(String moves) {
        int UCounter = 0, DCounter = 0, LCounter = 0, RCounter = 0;
        for(int i = 0; i < moves.length(); i++)
        {
            if(moves.charAt(i) == 'U')
            {
                UCounter++;
                DCounter--;
            }
            if(moves.charAt(i) == 'D')
            {
                DCounter++;
                UCounter--;
            }
            if(moves.charAt(i) == 'L')
            {
                LCounter++;
                RCounter--;
            }
            if(moves.charAt(i) == 'R')
            {
                RCounter++;
                LCounter--;
            }
        }
        return UCounter == 0 && DCounter == 0 && LCounter == 0 && RCounter == 0;
    }
}
