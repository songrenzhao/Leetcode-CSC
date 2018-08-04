/*
821. Shortest Distance to a Character
Given a string S and a character C, return an array of integers representing the shortest distance from the character C in the string.

Example 1:

Input: S = "loveleetcode", C = 'e'
Output: [3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0]
 

Note:

S string length is in [1, 10000].
C is a single character, and guaranteed to be in string S.
All letters in S and C are lowercase.
*/

//Solution in Java
class Solution {
    public int[] shortestToChar(String S, char C) {
        int size = S.length();
        int[] store = new int[size];
        int[] store2 = new int[size];
        int[] store3 = new int[size];
        int counter = 0;
        int trig = 0;
        
        for(int i = 0; i < size; i++)
        {
            if(S.charAt(i) != C)
                counter++;
            else if(S.charAt(i) == C)
            {
                int temp = counter;
                for(int j = i-counter; j <= i; j++)
                {
                    store[j] = temp--;
                }
                counter = 0;
            }
        }
        int ans = counter;
        while(trig <= ans)
        {
            store[size-trig-1] = counter--;
            trig++;
        }
        
        counter = 0;
        for(int i = size - 1; i >= 0; i--)
        {
            if(S.charAt(i) != C)
                counter++;
            else if(S.charAt(i) == C)
            {
                int temp = counter;
                for(int j = i + counter; j >= i; j--)
                {
                    store2[j] = temp--;
                }
                counter = 0;
            }
        }
        ans = counter;
        int trigg = 0;
        while(trigg <= ans)
        {
            store2[trigg] = counter--;
            trigg++;
        }
        for(int i = 0; i < store.length; i++)
            store3[i] = Math.min(store[i], store2[i]);
        return store3;
    }
}
