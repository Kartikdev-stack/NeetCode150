package LinkedList;


import java.util.List;

public class ReverseLL {
    public static void main(String[] args) {
        ListNode head=new ListNode(0);
        ListNode first=new ListNode(1);
        ListNode second=new ListNode(2);
        ListNode third=new ListNode(3);

        head.next=first;
        first.next=second;
        second.next=third;

        printLL(head);  // original linkedlist
        System.out.println();
        printLL(reverseLL(head));  // reversed linkedlist

    }
//    0->1->2->3

    public static void printLL(ListNode head){
        ListNode current=head;
        while (current!=null){
            System.out.print(current.val);
            current=current.next;
        }
    }
    public static ListNode reverseLL(ListNode head){
        ListNode prev=null;
        ListNode current=head;
        ListNode next;

        while(current!=null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
      return prev;
    }

}
