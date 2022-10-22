/*
 * @lc app=leetcode id=13 lang=java
 *
 * [13] Roman to Integer
 */

// @lc code=start
class Solution {
    public int romanToInt(String s) {
        // int prevVal = mapValue(s.charAt(0)), result = 0;
        // for (int i = 0; i < s.length(); i++) {
        // int curVal = mapValue(s.charAt(i));
        // result += prevVal < curVal ? curVal - 2 * prevVal : curVal;
        // prevVal = curVal;
        // }
        // return result;

        int result = 0, nextVal = mapValue(s.charAt(0));
        for (int i = 0; i < s.length() - 1; i++) {
            int curVal = mapValue(s.charAt(i));
            nextVal = mapValue(s.charAt(i + 1));
            result += (curVal >= nextVal ? 1 : -1) * curVal;
        }
        return result + nextVal;
    }

    private int mapValue(char symbol) {
        switch (symbol) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
}
// @lc code=end
