/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null && l2 == null) return l1;
        if(l1== null && l2!=null) return l2;
        if(l2== null && l1!=null) return l1;
        
        ListNode result =  new ListNode(0);
        ListNode cur_result = result;
        int carryover = 0;
        int cur_val = 0;
        while(l1!=null || l2!=null){
            if(l1!=null && l2!=null){
                cur_val = l1.val + l2.val + carryover;
                if(cur_val/10 == 0){
                    cur_result.next = new ListNode(cur_val);
                    cur_result = cur_result.next;
                    carryover = 0;
                }
                else{
                    cur_val = cur_val%10;
                    cur_result.next = new ListNode(cur_val);
                    cur_result = cur_result.next;
                    carryover = 1;
                }
                l1 = l1.next;
                l2 = l2.next;
            }
            else if(l1!=null && l2==null){ 
                cur_val = l1.val + carryover;
                System.out.println("Inside l1 present :"+cur_val);
                if(cur_val/10 == 0){
                    cur_result.next = new ListNode(cur_val);
                    cur_result = cur_result.next;
                    carryover = 0;
                }
                else{
                    cur_val = cur_val%10;
                    cur_result.next = new ListNode(cur_val);
                    cur_result = cur_result.next;
                    carryover = 1;
                }
                l1 = l1.next;
            }
             else if(l1==null && l2!=null){
                cur_val = l2.val + carryover;
                  System.out.println("Inside l2 present :"+cur_val);
                if(cur_val/10 == 0){
                    cur_result.next = new ListNode(cur_val);
                    cur_result = cur_result.next;
                    carryover = 0;
                }
                else{
                    cur_val = cur_val%10;
                    cur_result.next = new ListNode(cur_val);
                    cur_result = cur_result.next;
                    carryover = 1;
                }
                 l2 = l2.next;
            }  
        }
        
        if(carryover!=0){
            cur_result.next = new ListNode(carryover);
        }
        return result.next;
    }
}
