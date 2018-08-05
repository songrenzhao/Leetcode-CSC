public class Solution {
    public int ClimbStairs(int n) 
    {
        if (n == 1) return 1;
        int c0 = 1;
        int c1 = 2;
        for (int i = 3; i <= n; i++)
        {
            int c2 = c0 + c1;
            c0 = c1;
            c1 = c2;
        }
        return c1;
    }
}