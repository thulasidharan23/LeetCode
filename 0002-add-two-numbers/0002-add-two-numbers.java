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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sum=0;
        Stack <Integer> arr11=new Stack<>();
        Stack <Integer> arr21=new Stack<>();
        Stack <Integer> arr1=new Stack<>();
        Stack <Integer> arr2=new Stack<>();
        while(l1!=null){
            arr11.push(l1.val);
            l1=l1.next;
        }
        while(l2!=null){
            arr21.push(l2.val);
            l2=l2.next;
        }
        while(arr11.size()!=0){
            arr1.push(arr11.pop());
           
        }
        while(arr21.size()!=0){
            arr2.push(arr21.pop());
           
        }
        int carry=0;
        ListNode head=null;
        ListNode temp=null;
        while(arr1.size()!=0&&arr2.size()!=0){
           int a=arr1.pop()+arr2.pop();
           a+=carry;
           if(a>9){
            ListNode p=new ListNode(a%10);
            carry=(a/10)%10;
            if(head==null){
                head=p;
                temp=p;
                continue;
            }
             else {
            temp.next=p;
            temp=temp.next;
             }
           }
           else{
             ListNode p=new ListNode(a);
             carry=0;
              if(head==null){
                head=p;
                temp=p;
                continue;
            }
             else {
            temp.next=p;
            temp=temp.next;
             }

           }

        }
        
        while(arr1.size()!=0){
            int a=arr1.pop();
             a+=carry;
             if(a>9){
                 ListNode p=new ListNode(a%10);
            carry=(a/10)%10;
            if(head==null){
                head=p;
                temp=p;
                continue;
            }
             else {
            temp.next=p;
            temp=temp.next;
            
            }
             }
            else
             {
                System.out.println(a);
                ListNode p=new ListNode(a);
             carry=0;
              if(head==null){
                head=p;
                temp=p;
                continue;
            }
             else {
            temp.next=p;
            temp=temp.next;
             }
}

        }
          while(arr2.size()!=0){
            int a=arr2.pop();
            a+=carry;
           
            if(a>9){
                 ListNode p=new ListNode(a%10);
            carry=(a/10)%10;
            if(head==null){
                head=p;
                temp=p;
                continue;
            }
             else {
            temp.next=p;
            temp=temp.next;
            }
            }
            else{
             ListNode p=new ListNode(a);
             carry=0;
              if(head==null){
                head=p;
                temp=p;
                continue;
            }
             else {
            temp.next=p;
            temp=temp.next;
             }
            }

        }
        if(carry>0){
            ListNode p=new ListNode(carry);
            temp.next=p;
        }
        return head;
    }
}