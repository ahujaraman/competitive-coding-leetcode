 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        
        
        
        if(head == null || head.next == null )
            return true;
        if(head.next.next == null && head.val == head.next.val)
            return true;
        else if(head.next.next == null && head.val != head.next.val)
            return false;
        
        ListNode slow = head, fast = head, cur = head;
        
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            cur = cur.next;
            fast = fast.next.next;
        }
        
        ListNode prev = cur;
        
        if(fast!=null){
            slow = slow.next;
            cur = cur.next;
            prev = cur;
        }
        
        
        ListNode cur_next = cur.next;
        
        while(cur.next!=null){
            
            cur.next = prev;
            cur = cur_next;
            cur_next = cur.next;
        }
        cur.next = prev;
    
        ListNode start = head;
        int stop = 0;
        while(stop == 0 && start!=slow && cur!=slow){
            if(start.val != cur.val){
                stop = 1;
                return false;
            }else{
                  start = start.next;
                  cur = cur.next;
            }
        }
        
        return true;
    }
}
