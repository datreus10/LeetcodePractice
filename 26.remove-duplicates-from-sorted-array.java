/*
 * @lc app=leetcode id=26 lang=java
 *
 * [26] Remove Duplicates from Sorted Array
 */

// @lc code=start
class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 1, j = 2;
        for (; i < nums.length; i++) {
            int curVal = nums[i], prevVal = nums[i - 1];
            if (prevVal >= curVal) {
                for (; j < nums.length; j++)
                    if (nums[j] > prevVal)
                        break;
                if (j == nums.length)
                    break;
                nums[i] = nums[j];
            }
        }
        return i;
    }
}
// @lc code=end
