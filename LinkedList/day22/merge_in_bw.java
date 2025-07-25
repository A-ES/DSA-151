package LinkedList.day22;

public class merge_in_bw {
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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode h1=list1;
        ListNode h2=list2;
        int c1=1;
        int c2=0;
        ListNode t1=h1;
        ListNode t2=list2;

        for(int i =0; i<= b; i++){
            if(c1<a){
                h1=h1.next;
                c1++;
            }
            if(c2<=b){
                t1=t1.next;
                c2++;
            }
        }
        System.out.println(h1.val);
        System.out.print(t1.val);

      

        while(t2.next!=null){
            t2=t2.next;
        }

          h1.next = h2;
          t2.next = t1;
       
        
        
    return list1;
    }
}
    
}
