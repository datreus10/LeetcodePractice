/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

// @lc code=start

// Solution 1
// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         for (int i = 0; i < nums.length; i++) {
//             int subNum = target - nums[i];
//             for (int j = i + 1; j < nums.length; j++) {
//                 if (nums[j] == subNum)
//                     return new int[] { i, j };
//             }
//         }
//         return null;
//     }
// }

// Solution 2
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> mapNums = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            int subNum = target - nums[i];
            if (mapNums.containsKey(subNum)){
                int[] result = { i, mapNums.get(subNum) };
                return result;
            }
            else
                mapNums.put(nums[i], i);
        }
        return null;
    }
}
// @lc code=end
