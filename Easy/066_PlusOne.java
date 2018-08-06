/*
66. Plus One
Given a non-empty array of digits representing a non-negative integer, plus one to the integer.

The digits are stored such that the most significant digit is at the head of the list, and each element in the array contain a single digit.

You may assume the integer does not contain any leading zero, except the number 0 itself.

Example 1:

Input: [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Example 2:

Input: [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.
*/

//Solution in Java
class Solution {
    public int[] plusOne(int[] digits) {
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < digits.length; i++)
        {
            if(i == digits.length - 1)
            {
                list.add(digits[i] + 1);
                int j = i;
                while(list.get(j) >= 10)
                {
                    if(j == 0)
                    {
                        list.set(0, list.get(j) % 10);
                        list.add(0,1);
                    }
                    else
                    {
                        list.set(j, list.get(j) % 10);
                        list.set(j - 1, list.get(j-1) + 1);
                        j--;
                    }
                }
            }
            else
                list.add(digits[i]);
        }
        int[] temp = new int[list.size()];
        for(int i = 0; i < temp.length; i++)
            temp[i] = list.get(i);
        return temp;
    }
}
