/*
258. Add Digits
Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.

Example:

Input: 38
Output: 2 
Explanation: The process is like: 3 + 8 = 11, 1 + 1 = 2. 
             Since 2 has only one digit, return it.
Follow up:
Could you do it without any loop/recursion in O(1) runtime?
*/

//Solution in Java
class Solution {
    public int addDigits(int num) {
        while(num > 9)
        {
            int first = num % 10;
            int second = addDigits(num/10);
            num = first + second;
        }
        return num;
    }
}
