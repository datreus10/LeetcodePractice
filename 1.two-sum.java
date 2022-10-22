import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int result[] = { -1, -1 };
        Map<Integer, Integer> cache = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i], otherKey = target - num;
            if (cache.containsKey(otherKey)) {
                result[0] = i;
                result[1] = cache.get(otherKey);
                break;
            } else
                cache.put(num, i);
        }
        return result;
    }
}
// @lc code=end
