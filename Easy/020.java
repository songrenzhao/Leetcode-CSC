/*
20. Valid Parentheses
Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Note that an empty string is also considered valid.

Example 1:

Input: "()"
Output: true
Example 2:

Input: "()[]{}"
Output: true
Example 3:

Input: "(]"
Output: false
Example 4:

Input: "([)]"
Output: false
Example 5:

Input: "{[]}"
Output: true
*/

//Solution in Java
class Solution {
    public boolean isValid(String s) {
        if(s.length() == 0)
            return true;
        
        Stack<String> stack = new Stack<String>();
        for(int i = 0; i < s.length(); i++)
        {
            String temp = s.substring(i,i+1);
            if(temp.equals("(") || temp.equals("{") || temp.equals("["))
                stack.push(temp);
            else if(temp.equals(")"))
            {
                if(stack.empty())
                    return false;
                else if(stack.contains("("))
                    stack.pop();
                else
                    return false;
            }
            else if(temp.equals("]"))
            {
                if(stack.empty())
                    return false;
                else if(stack.contains("["))
                    stack.pop();
                else
                    return false;
            }
            else if(temp.equals("}"))
            {
                if(stack.empty())
                    return false;
                else if(stack.contains("{"))
                    stack.pop();
                else
                    return false;
            }
        }
        if(stack.empty())
            return true;
        return false;
    }
}
