public class test {
    public static void main(String[] args) {
        ListNode lst1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode lst2 = new ListNode(1, new ListNode(3, new ListNode(4)));

        ListNode result = mergeTwoLists(lst1, lst2);
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
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
        return result;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
