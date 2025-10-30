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
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null; 
        }
        ListNode l1 = head;
        ListNode l2 = new ListNode();
        int index = 0 ;
        while(l1!=null){
            l1 = l1.next;
            index++;
        }
        l1 = head;
        int[] number = new int[index];
        for(int i = 0 ; i<index;i++){
            number[i] = l1.val;
            l1 = l1.next;
        }
        ListNode newHead = new ListNode(number[index-1]);
        l2 = newHead;
        for(int i = index-2; 0<=i;i--){
            l2.next = new ListNode(number[i]);
            l2 = l2.next;
        }
        return newHead ; 
    }
}