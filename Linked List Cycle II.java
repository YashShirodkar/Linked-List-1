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

 // Time Complexity = O(N)
 // Space Complexity = O(1)

public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null) return null;
        boolean flag = false;
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast != null && fast.next!= null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow){
                flag = true;
                break;
            }
        }
        
        if(!flag) return null;
        else{
            slow = head;
            while(slow != fast){
                slow = slow.next;
                fast = fast.next;
            }
        }
        
        return slow;
    }
}