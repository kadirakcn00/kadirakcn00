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
        ListNode node = head;
        ListNode n = head;
        while(node!=null && node.next!=null){
            node = node.next.next;
            n = n.next;

            if(node == n ){
                return true;
            }
        }
        return false;
    }
}