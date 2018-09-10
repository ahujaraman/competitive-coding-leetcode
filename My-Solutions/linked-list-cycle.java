/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        
    /*    ListNode cur = head;
        int stop = 0;
        
        if(head == null)
            return false;
        
        int max_int  = Integer.MAX_VALUE;
        
        while(stop == 0){
            cur.val = max_int;
            if(cur == null || cur.next ==null){
                stop = 1;
                return false;
            }
            if(cur.next.val == max_int){
                stop = 1;
                return true;
            }
            
            cur = cur.next;
        }
        
        return false;
        */
        
        if(head == null || head.next ==null)
            return false;
        
        ListNode slow = head;
        ListNode fast = head.next;
        
        
        while(slow != fast){
            
            if(fast == null || fast.next == null)
                return false;
            slow = slow.next;
            fast = fast.next.next;
        }
        
        return true;
    }
}
