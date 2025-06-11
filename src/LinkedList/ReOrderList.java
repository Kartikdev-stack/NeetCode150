package LinkedList;

import javax.swing.*;

public class ReOrderList {

    public static void main(String[] args) {
        // 1->2->3->4->5

        ListNode head=new ListNode(1);
        ListNode first=new ListNode(2);
        ListNode second=new ListNode(3);
        ListNode third=new ListNode(4);
        ListNode fourth=new ListNode(5);

        head.next=first;
        first.next=second;
        second.next=third;
        third.next=fourth;

        printLL(head);
        System.out.println();
        reorder(head);
        printLL(head);
    }

    public static void printLL(ListNode head){
        ListNode current=head;
        while (current!=null){
            System.out.print(current.val);
            current=current.next;
        }
    }

    public static void reorder(ListNode head){
        if(head==null || head.next==null)
            return;

        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        ListNode secondHalf=reverseList(slow.next);

        slow.next=null; // here we break the list into two halves

        ListNode firstHalf=head;

        mergeLists(firstHalf,secondHalf);
    }
    // 1,2,3,4,5
    public static ListNode reverseList(ListNode head){
        ListNode current=head;
        ListNode next=null;
        ListNode previous=null;

        while(current!=null){
            next=current.next;
            current.next=previous;
            previous=current;
            current=next;
        }
        return previous;
    }


    // 1->2->3      5->4
    public static void mergeLists(ListNode firstHalf, ListNode secondHalf){

        while (firstHalf!=null && secondHalf!=null) {
            ListNode temp1 = firstHalf.next;
            ListNode temp2 = secondHalf.next;

            firstHalf.next = secondHalf;
            secondHalf.next = temp1;

            firstHalf = temp1;
            secondHalf = temp2;
        }
    }

}
