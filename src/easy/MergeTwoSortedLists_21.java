package easy;

public class MergeTwoSortedLists_21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null && l2 == null) {
            return null;
        }
        ListNode resultListNode = new ListNode();
        ListNode tempListNode = new ListNode();
        resultListNode.next = tempListNode;

        while(l1 != null && l2 != null) {
            if(l1.val > l2.val) {
                tempListNode.val = l2.val;
                l2 = l2.next;
            }
            else {
                tempListNode.val = l1.val;
                l1 = l1.next;
            }
            tempListNode.next = new ListNode();
            tempListNode = tempListNode.next;
        }
        if(l1 == null) {
            tempListNode.val = l2.val;
            tempListNode.next = l2.next;
        }
        if(l2 == null) {
            tempListNode.val = l1.val;
            tempListNode.next = l1.next;
        }

        return resultListNode.next;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
