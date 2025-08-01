package LinkedList.day22;

public class reorder {
    /**
 * Definition for singly-linked list.
 */
public static class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
class Solution {
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next!=null && fast.next.next !=null){
            slow = slow.next;
            fast= fast.next.next;
        }
        ListNode secondHead = slow.next;
        slow.next = null;

        ListNode prev = null;
        ListNode curr = secondHead;
        while(curr!=null){
            ListNode forw = curr.next;
            curr.next=prev;
            prev = curr;
            curr = forw;
            
        }
        secondHead = prev;

        ListNode first= head;
        ListNode second = secondHead;
        while(second!=null){
            ListNode temp1 = first.next;
            ListNode temp2 = second.next;

            first.next = second;
            second.next = temp1;

            first = temp1;
            second = temp2;
        }
        
    }
}
    
}
