/*
830. Positions of Large Groups
In a string S of lowercase letters, these letters form consecutive groups of the same character.

For example, a string like S = "abbxxxxzyy" has the groups "a", "bb", "xxxx", "z" and "yy".

Call a group large if it has 3 or more characters.  We would like the starting and ending positions of every large group.

The final answer should be in lexicographic order.

 

Example 1:

Input: "abbxxxxzzy"
Output: [[3,6]]
Explanation: "xxxx" is the single large group with starting  3 and ending positions 6.
Example 2:

Input: "abc"
Output: []
Explanation: We have "a","b" and "c" but no large group.
Example 3:

Input: "abcdddeeeeaabbbcd"
Output: [[3,5],[6,9],[12,14]]
 

Note:  1 <= S.length <= 1000
*/

//Solution in Java
class Solution {
    public List<List<Integer>> largeGroupPositions(String S) {
        List<List<Integer>> output = new ArrayList<List<Integer>>();
        String chara = "";
        int i = 0;
        int j = 0;
        String[] splitted = S.split("");
        while(i < splitted.length)
        {
            List<Integer> temp = new ArrayList<>();
            int counter = 0;
            chara = splitted[i];
            for(j = i; j < splitted.length; j++)
            {
                if(splitted[j].equals(chara))
                    counter++;
                else
                    break;
            }
            if(counter >= 3)
            {
                temp.add(i);
                temp.add(i+counter-1);
                output.add(temp);
            }
            i = j;
        }
        return output;
    }
}
