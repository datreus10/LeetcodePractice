/*
 * @lc app=leetcode id=21 lang=java
 *
 * [21] Merge Two Sorted Lists
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null)
            return list2;
        if (list2 == null)
            return list1;

        ListNode result = null, it = null, tmp = null, it1 = list1, it2 = list2;
        while (it1 != null && it2 != null) {
            if (it1.val < it2.val) {
                tmp = it1;
                it1 = it1.next;
            } else {
                tmp = it2;
                it2 = it2.next;
            }
            if (it == null) {
                it = tmp;
                result = tmp;
            } else {
                it.next = tmp;
                it = it.next;
            }
        }
        if (it1 != null)
            it.next = it1;
        if (it2 != null)
            it.next = it2;
        return result;
    }
}
// @lc code=end
