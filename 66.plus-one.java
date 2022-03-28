
/*
 * @lc app=leetcode id=66 lang=java
 *
 * [66] Plus One
 */

// @lc code=start

class Solution {
    public int[] plusOne(int[] digits) {
        int reminder = 1;
        for (int i = digits.length - 1; i > -1; i--) {
            int tmp = digits[i] + reminder;
            if (tmp > 9) {
                digits[i] = 0;
                reminder = 1;
            } else {
                digits[i] = tmp;
                reminder = 0;
                break;
            }
        }
        if (reminder == 0)
            return digits;

        int[] result = new int[digits.length + 1];
        result[0] = 1;
        for (int i = 1; i < digits.length; i++) {
            result[i] = digits[i];
        }
        digits = result;
        return result;
    }
}

// @lc code=end
