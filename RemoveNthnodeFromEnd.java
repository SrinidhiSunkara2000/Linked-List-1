// Time Complexity :O(n) 
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :no
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy=new ListNode(-1);
        dummy.next=head;
        ListNode slow=dummy;
        ListNode fast=dummy;
        
        for(int i=0;i<=n;i++)
        {
            fast=fast.next;
        }
        while(fast!=null)
        {
            slow=slow.next;
            fast=fast.next;
        }
        slow.next=slow.next.next;
        return dummy.next;   //dummy.next is the head
    }
}