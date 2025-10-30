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
        ListNode l1 = head;
        int index = 0 ;
         while(l1!=null){
            index++;
            l1 = l1.next;
         }
         l1 = head;
         int[] numbers = new int[index];
         for(int i = 0 ; i<index ; i++){
            numbers[i] = l1.val;
            l1 = l1.next;
         }
         int[] reversedNumbers = Arrays.copyOf(numbers, numbers.length);

         for (int i = 0; i < index; i++) {
            reversedNumbers[i] = numbers[index - 1 - i];
}

         if(Arrays.equals(reversedNumbers,numbers)){
            return true;
         }
            return false;
    }
}