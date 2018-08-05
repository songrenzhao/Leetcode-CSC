/*
461. Hamming Distance
The Hamming distance between two integers is the number of positions at which the corresponding bits are different.

Given two integers x and y, calculate the Hamming distance.

Note:
0 ≤ x, y < 231.

Example:

Input: x = 1, y = 4

Output: 2

Explanation:
1   (0 0 0 1)
4   (0 1 0 0)
       ↑   ↑

The above arrows point to positions where the corresponding bits are different.
*/

//Solution in Java
class Solution {
    public int hammingDistance(int x, int y) {
        StringBuffer x1 = new StringBuffer("");
        StringBuffer y1 = new StringBuffer("");
        int count = 0;
        
        while(x!=0 || y!= 0)
        {
            x1.append(x%2);
            y1.append(y%2);
            x/=2;
            y/=2;
        }
        
        x1.reverse();
        y1.reverse();
        
        while(x1.length() > y1.length())
            y1.insert(0,"0");
        while(x1.length() < y1.length())
            x1.insert(0,"0");
        
        for(int i = 0; i < x1.length(); i++)
        {
            if(x1.charAt(i) != y1.charAt(i))
                count++;
        }
        return count;
    }
}
