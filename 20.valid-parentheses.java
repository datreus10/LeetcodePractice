import java.util.Stack;

/*
 * @lc app=leetcode id=20 lang=java
 *
 * [20] Valid Parentheses
 */

// @lc code=start
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stkChar = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '{' || c == '(' || c == '[')
                stkChar.push(c);
            else {
                if (stkChar.isEmpty())
                    return false;
                if (!isValidPar(stkChar.pop(), c))
                    return false;
            }
        }
        return stkChar.isEmpty();
    }

    private boolean isValidPar(char c1, char c2) {
        if (c1 == '(' && c2 == ')')
            return true;
        if (c1 == '{' && c2 == '}')
            return true;
        if (c1 == '[' && c2 == ']')
            return true;
        return false;
    }
}
// @lc code=end
