package LinkedList.day22;

public class remove_dup {
    // Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
   class Solution {
       public ListNode deleteDuplicates(ListNode head) {
           if(head==null) return null;
           
           ListNode cur = head;
           ListNode forw = head.next;
           while(cur.next!=null && forw!=null){
               if(forw.val==cur.val){
                   cur.next=forw.next;
                   forw= forw.next;
               }
               else{
                   cur = cur.next;
                   forw = forw.next;
               }
               
           }
           
           
       return head; }
   }
    
}
