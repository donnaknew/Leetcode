package medium;

import java.util.ArrayList;
import java.util.List;

public class Add_Two_Numbers_2 {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        List<Integer> l1List = this.convertToArray(l1);
        List<Integer> l2List = this.convertToArray(l2);
        ListNode listNode = this.sumTwoList(l1List, l2List);

        return listNode;
    }

    private List<Integer> convertToArray(ListNode listNode) {
        List<Integer> convertedList = new ArrayList<>();

        while(listNode != null) {
            convertedList.add(listNode.val);
            listNode = listNode.next;
        }
        return convertedList;
    }

    private ListNode sumTwoList(List<Integer> firstList, List<Integer> secondList) {
        ListNode listNode = new ListNode();
        ListNode tempListNode = listNode;
        int biggerSize = firstList.size() > secondList.size() ? firstList.size() : secondList.size(); //TODO. can change Math.max(a, b)

        for(int i = 0; i < biggerSize; i++) {
            int sum = 0;
            int upInt = 0;

            if(i >= firstList.size()) {
                sum = secondList.get(i);
            }
            else if(i >= secondList.size()) {
                sum = firstList.get(i);
            }
            else {
                sum = firstList.get(i) + secondList.get(i);
            }

            if(tempListNode.val >= 10) {
                upInt = tempListNode.val / 10;
                tempListNode.val = tempListNode.val % 10;
            }
            tempListNode.next = new ListNode(sum + upInt);
            tempListNode = tempListNode.next;
        }
        if(tempListNode.val >= 10) {
            int upInt = tempListNode.val / 10;
            tempListNode.val = tempListNode.val % 10;
            tempListNode.next = new ListNode(upInt);
        }

        return listNode.next;
    }
}
