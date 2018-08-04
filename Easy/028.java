/*
28. Implement strStr()
Implement strStr().

Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

Example 1:

Input: haystack = "hello", needle = "ll"
Output: 2
Example 2:

Input: haystack = "aaaaa", needle = "bba"
Output: -1
Clarification:

What should we return when needle is an empty string? This is a great question to ask during an interview.

For the purpose of this problem, we will return 0 when needle is an empty string. This is consistent to C's strstr() and Java's indexOf().
*/

// 又是送分题， 可以简单暴力的用indexOf() 搞定
// 只不过如果不给用indexOf()的话 我们可以把needle的length找出来 然后用一个for loop来设置 haystack的substring 再与needle compare
//Solution in Java
class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack.indexOf(needle) != -1)
           return haystack.indexOf(needle);
        return -1;
    }
}
