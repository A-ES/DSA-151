package LinkedList.day20;

public class reverse_LL {
    /**
 * Definition for singly-linked list.
 */
public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
 
class Solution {
    public ListNode reverseList(ListNode head) {

        ListNode current = head;
        ListNode prev = null;
        ListNode next;
        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current=next;
        }
        return prev;
        
    }
}
    
}
