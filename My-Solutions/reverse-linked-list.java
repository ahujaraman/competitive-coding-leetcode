/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        /* O(n) space complexity  - Stack Solution
        Stack<Integer> stack = new Stack<Integer>();
        ListNode cur = head;
        
        while(cur!=null ){
            stack.push(cur.val);
            cur = cur.next;
        }
        
        cur = head; 
        while(!stack.isEmpty()){
            cur.val = stack.pop();
            cur = cur.next;
        }
        
        return head;
        
        */
        
        if(head == null || head.next == null)
            return head;
        
        ListNode prev = null;
        ListNode cur = head;
        ListNode cur_next = cur.next;
        
        while(cur.next!=null){
            cur.next = prev;
            prev = cur;
            cur = cur_next;
            cur_next = cur_next.next;   
        }
        
        cur.next = prev;  
        return cur;
    }
}
