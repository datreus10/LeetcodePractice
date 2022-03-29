/*
 * @lc app=leetcode id=7 lang=java
 *
 * [7] Reverse Integer
 */

// @lc code=start
class Solution {
    public int reverse(int x) {
        if (x > -10 && x < 10)
            return x;
        int result = 0;
        int sign = 1;
        if (x < 0) {
            sign = -1;
            x = -x;
        } 
        for (int t = x; t != 0; t /= 10) {
            if ((Integer.MAX_VALUE - t % 10) / 10 < result)
                return 0;
            result = result * 10 + t % 10;
        }

        return result * sign;
    }
}
// @lc code=end
