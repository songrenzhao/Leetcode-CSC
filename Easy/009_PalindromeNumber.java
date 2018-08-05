/*
9. Palindrome Number
Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.

Example 1:

Input: 121
Output: true
Example 2:

Input: -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:

Input: 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
Follow up:

Coud you solve it without converting the integer to a string?
*/

//Solution in Java
class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0)
            return false;
        if(x < 10)
            return true;
        
        int copy = x;
        
        int output = 0;
        while(x != 0)
        {
            int pop = x % 10;
            x = x / 10;
            if((output*10) / 100 != output / 10)
                return false;
            output = output * 10 + pop;
        }

        if(copy == output)
            return true;
        else
            return false;
    }
}
