package LinkedList.day22;

public class remove_nodes {
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
    public ListNode removeNodes(ListNode head) {
        if(head == null) return null;

        ListNode curr = head.next;
        ListNode prev = head;
        ListNode forw = curr;

        while(curr!=null){
            forw = curr.next;
            curr.next = prev;
            prev = curr;
            curr=forw;
            
        }
        head.next = null;
        head=prev;
        System.out.print(head);
        
        curr=head.next;
        prev=head;
        int max=head.val;
        while (curr != null){
            if(curr.val>=max){
                max = curr.val;
                prev = curr;
            }
            else{
                prev.next = curr.next;
            }
            curr = curr.next;
        }
 System.out.print(head);

curr = head;
prev = null;
 while(curr!=null){
            forw = curr.next;
            curr.next = prev;
            prev = curr;
            curr=forw;
            
        }
        head.next = null;
        head=prev;
    return head;}
}
    
}
