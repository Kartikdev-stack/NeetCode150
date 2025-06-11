package LinkedList;

import java.util.List;

public class cycleDetectionHead {

    public static void main(String[] args) {
        ListNode head=new ListNode(1);
        ListNode first=new ListNode(2);
        ListNode second=new ListNode(3);
        ListNode third=new ListNode(4);
        ListNode fourth=new ListNode(5);

        head.next=first;
        first.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=second;

        ListNode result=detectCycle(head);
        System.out.println(result.val);
    }



    public static ListNode detectCycle(ListNode head){
        if(head==null || head.next==null){
            return null;
        }

        ListNode fast=head;
        ListNode slow=head;


        while(fast!=null || fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

            if(slow==fast){
                break; // confirms the presence of cycle in the Linked List
            }
        }

        if(fast==null || fast.next==null){
              return null;    // if no cycle then we return null
        }

        ListNode slow1=head; // we set a new slow pointer at the start again

        while(slow!=null || slow.next!=null){
            slow=slow.next;
            slow1=slow1.next;

            if(slow==slow1){
                return slow;
            }

        }

        return null;
    }


}
