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
    public ListNode mergeKLists(ListNode[] lists) {
        List<Integer>arr=new ArrayList<>();
        for(ListNode list:lists){
            while(list!=null){
                arr.add(list.val);
                list=list.next;
            }
        }
        Collections.sort(arr);
        ListNode head=new ListNode(0);
        ListNode h=head;
        for(int i:arr){
            h.next=new ListNode(i);
            h=h.next;
        }
        return head.next;
    }
}