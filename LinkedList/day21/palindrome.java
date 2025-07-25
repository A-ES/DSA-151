package LinkedList.day21;

import java.util.ArrayList;

import LinkedList.day20.reverse_LL.ListNode;

public class palindrome {
    /**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> arr = new ArrayList<>();
        while(head!=null){
            arr.add(head.val);
            head = head.next;
        }
        int left = 0;
        int right = arr.size()-1;
        while(left<=right && arr.get(left)==arr.get(right)){
            left ++;
            right--;

        }
        return left>=right;
    }
}

public class ListNode {

    public int val;

    public ListNode next;

    public ListNode() {}

    public ListNode(int val) { this.val = val; }

    public ListNode(int val, ListNode next) { this.val = val; this.next = next; }

}
    
}
