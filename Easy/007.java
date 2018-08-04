/*

7. Reverse Integer
Given a 32-bit signed integer, reverse digits of an integer.

Example 1:

Input: 123
Output: 321
Example 2:

Input: -123
Output: -321
Example 3:

Input: 120
Output: 21
Note:
Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: [−231,  231 − 1]. For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.

*/

/*

// Solution in C++ -- Please comment previous solution when new solution has been posted. Sample is posted below...
class Solution {
public:
    int reverse(int x) {
        int ans = 0;
        while (x) {
            int temp = ans * 10 + x % 10;
            if (temp / 10 != ans)
                return 0;
            ans = temp;
            x /= 10;
        }
        return ans;
    }
};

*/

/*

//Solution in Python
class Solution:
    def reverse(self, x):
        """
        :type x: int
        :rtype: int
        """
        n = int(str(abs(x))[::-1])   
        return 0 if x == 0 else ((x>0)-(x<0)) * n * (n < 2**31)  
        
*/


//Solution in Java
class Solution {
    public int reverse(int x) {
        int output = 0;
        while(x != 0)
        {
            int pop = x % 10; //别问为什么 负数%10 不等于正数。
            x = x / 10;
            if((output*10) / 100 != output / 10)
                return 0;
            output = output * 10 + pop;
        }
        return output;
    }
}

