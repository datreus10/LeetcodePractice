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
        int cloneX = x, sample = 0;
        while (cloneX != 0) {
            sample = sample * 10 + cloneX % 10;
            cloneX /= 10;
        }
        return x == sample;
    }
}
// @lc code=end
