/*
844. Backspace String Compare
Given two strings S and T, return if they are equal when both are typed into empty text editors. # means a backspace character.

Example 1:

Input: S = "ab#c", T = "ad#c"
Output: true
Explanation: Both S and T become "ac".
Example 2:

Input: S = "ab##", T = "c#d#"
Output: true
Explanation: Both S and T become "".
Example 3:

Input: S = "a##c", T = "#a#c"
Output: true
Explanation: Both S and T become "c".
Example 4:

Input: S = "a#c", T = "b"
Output: false
Explanation: S becomes "c" while T becomes "b".
Note:

1 <= S.length <= 200
1 <= T.length <= 200
S and T only contain lowercase letters and '#' characters.
*/

//Solution in Java
class Solution {
    public boolean backspaceCompare(String S, String T) {
        Stack<Character> stackS = new Stack<Character>();
        Stack<Character> stackT = new Stack<Character>();
        for(int i = 0; i < S.length(); i++)
        {
            if(S.charAt(i) == '#' && stackS.empty())
                continue;
            else if(S.charAt(i) == '#' && !stackS.empty())
                stackS.pop();
            else
                stackS.push(S.charAt(i));
        }
        for(int i = 0; i < T.length(); i++)
        {
            if(T.charAt(i) == '#' && stackT.empty())
                continue;
            else if(T.charAt(i) == '#' && !stackT.empty())
                stackT.pop();
            else
                stackT.push(T.charAt(i));
        }
        
        while(!stackS.empty() && !stackT.empty())
        {
            if(stackS.peek() != stackT.peek())
                return false;
            stackS.pop();
            stackT.pop();
        }
        if(stackS.size() > 0 || stackT.size() > 0)
            return false;
        return true;
    }
}
