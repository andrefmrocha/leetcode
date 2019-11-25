/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}
class Solution {
    public ListNode isPalindromeUtil(ListNode head, ListNode queue, ListNode next){
        if(head.next == null){
            return next;
        } else{
            ListNode newNode = new ListNode(head.next.val);
            newNode.next = next;
            return isPalindromeUtil(head.next, queue, newNode);
        }
    }

    public boolean isPalindromeUtil(ListNode head, ListNode queueHead){
        if(head == null){
            return queueHead == null;
        }
        if(head.val == queueHead.val){
            return isPalindromeUtil(head.next, queueHead.next);
        }
        return false;
    }

    public boolean isPalindrome(ListNode head) {
        if(head == null){
            return true;
        }
        ListNode node = new ListNode(head.val);
        ListNode queue = isPalindromeUtil(head, node, node);
        return isPalindromeUtil(head, queue);
    }
}