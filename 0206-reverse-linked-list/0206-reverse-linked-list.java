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
        return sol(head);
    }
    public ListNode sol(ListNode head){
        Stack<ListNode> s= new Stack<>();
        ListNode temp=head;
        while(temp!=null)
        {
            s.push(temp);
            temp=temp.next;
        }
        temp=head;
        int cnt=s.size()/2;
        while(cnt-->0){
            int val=s.peek().val;
            s.pop().val=temp.val;
            temp.val=val;
            temp=temp.next;
        }
        return head;
    }
}