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
    public ListNode mergeNodes(ListNode head) {
        ListNode temp=head;
        ListNode head1=null;
        ListNode temp1=null;
        List<Integer>lt=new ArrayList<>();
        while(temp!=null){
          lt.add(temp.val);
          temp=temp.next;  
        }
        System.out.println(lt);
        int sum=0;
        for(int i=1;i<lt.size();i++){
            if(lt.get(i)!=0){
                sum+=lt.get(i);
            }
            if(lt.get(i)==0){
                ListNode data=new ListNode(sum);
                if(head1==null){
                    head1=data;
                    temp1=head1;
                }
                else{
                    temp1.next=data;
                    temp1=temp1.next;
                }
                sum=0;
            }
        }
        return head1;
    }
}