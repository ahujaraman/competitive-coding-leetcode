/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        
        if(head == null) return head;
        if(head.next == null) return head;
        
        
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        
        ListNode cur = head;
        while(cur!=null){
            if(map.get(cur.val) == null)
                map.put(cur.val,1);
            else
                map.put(cur.val,map.get(cur.val) +1);
            cur = cur.next;
        }
        cur =head;
        ListNode prev = null;
    
        while(cur!=null)
        {
            if(map.get(cur.val) > 1 && cur == head)
            {
                head = head.next;
                cur = head;
            }
            else if(map.get(cur.val)  >1 && cur!=head){
                prev.next = cur.next;
                cur = cur.next;
            }
            else{
                prev = cur;
                cur = cur.next;
            }
        }
        return head;  
    }
}
