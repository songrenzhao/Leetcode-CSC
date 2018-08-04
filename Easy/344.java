/*
344. Reverse String
Write a function that takes a string as input and returns the string reversed.

Example:
Given s = "hello", return "olleh".
*/

-- 老哥们 这题用python就过分了 直接[::-1]
//Solution in Java
class Solution {
    public String reverseString(String s) {
        StringBuffer a = new StringBuffer(s);
        a.reverse();
        return a.toString();
    }
}
