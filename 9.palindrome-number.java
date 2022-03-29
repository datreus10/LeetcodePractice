/*
 * @lc app=leetcode id=9 lang=java
 *
 * [9] Palindrome Number
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0)
            return false;
        if (x < 10)
            return true;

        // -2^31 <= x <= 2^31 - 1 => we can use int
        int opNum = 0;
        for (int i = x; i != 0; i /= 10)
            opNum = opNum * 10 + i % 10;

        return opNum == x;
    }
}
// @lc code=end
