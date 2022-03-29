/*
 * @lc app=leetcode id=14 lang=java
 *
 * [14] Longest Common Prefix
 */

// @lc code=start
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 1)
            return strs[0];
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < strs[0].length(); i++) {
            char tmp = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].length() <= i || tmp != strs[j].charAt(i))
                    return result.toString();
            }
            result.append(tmp);
        }
        return result.toString();
    }
}
// @lc code=end
