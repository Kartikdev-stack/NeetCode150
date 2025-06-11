package LinkedList;

import java.nio.file.attribute.UserPrincipalLookupService;
import java.util.List;

public class middle {

    public static void main(String[] args) {
        ListNode head=new ListNode(1);
        ListNode first=new ListNode(2);
        ListNode second=new ListNode(3);
        ListNode third=new ListNode(4);
//        ListNode fourth=new ListNode(5);

        head.next=first;
        first.next= second;
        second.next=third;
//        third.next=fourth;


        System.out.println(findMiddle(head));
    }

    // utilising the floyds tortoise hare algorithm
    public static int findMiddle(ListNode head){
        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow.val;
    }




}
