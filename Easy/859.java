/*
859. Buddy Strings
Given two strings A and B of lowercase letters, return true if and only if we can swap two letters in A so that the result equals B.

Example 1:

Input: A = "ab", B = "ba"
Output: true
Example 2:

Input: A = "ab", B = "ab"
Output: false
Example 3:

Input: A = "aa", B = "aa"
Output: true
Example 4:

Input: A = "aaaaaaabc", B = "aaaaaaacb"
Output: true
Example 5:

Input: A = "", B = "aa"
Output: false
 

Note:

0 <= A.length <= 20000
0 <= B.length <= 20000
A and B consist only of lowercase letters.
*/

//Solution in Java
class Solution 
{
    public boolean buddyStrings(String A, String B) 
    {
        if(A.length() != B.length())
            return false;
        if(A.equals(B)) //Two cases, A[i] = A[j] = B[i] = B[j]
        {
            int[] count = new int[26];
            for(int i = 0; i < A.length(); i++)
                count[A.charAt(i) - 'a']++;
            for(int i = 0; i < count.length; i++)
            {
                if(count[i] > 1) //As long as it exists one duplicate such as A[i] = A[j], this can return true
                    return true;
            }
            return false; //Else return false because no duplicates have found
        }
        else //Two cases, A[i] = B[j], A[j] = B[i], but A[i] != A[j]
        {
            int first = -1, second = -1;
            for(int i = 0; i < A.length(); i++)
            {
                if(A.charAt(i) != B.charAt(i)) //We are only looking for two distinct characters, not more than 2.
                {
                    if(first == -1)
                        first = i; //First one is found
                    else if(second == -1) //Cannot use if because we are looking for the second one, cannot override the first one.
                        second = i; //Second one is found
                    else
                        return false;
                }
            }
            return (second != -1 && A.charAt(first) == B.charAt(second) &&
                    A.charAt(second) == B.charAt(first));
        }
    }
}
