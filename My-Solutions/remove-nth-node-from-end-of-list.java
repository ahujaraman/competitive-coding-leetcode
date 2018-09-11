/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        if(head.next == null && n == 1) return null;
        int count = 1;
        ListNode fast = head;
        ListNode slow =  head;
        while(count<n){
            fast = fast.next;
            count++;
        }
        
        if(fast.next == null)
            return head.next;
        while(fast.next.next !=null){
            slow = slow.next;
            fast = fast.next;
        }
        
        slow.next = slow.next.next;
        return head;
    }
}
