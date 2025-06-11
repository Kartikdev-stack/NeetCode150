package LinkedList;

import org.w3c.dom.css.CSSStyleDeclaration;

public class nthRemoval {

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        int length=size(head);
        ListNode current=head;
        int end=length-n;
        int count=0;

        while(current!=null){

            if(count==end-1){
                break;
            }else {
                current = current.next;
                count++;
            }
        }

        ListNode next=current.next;

        current.next.next=null;
        current.next=next;

        return head;
    }

    public static void printLL(ListNode head){
        ListNode current=head;
        while (current!=null){
            System.out.print(current.val);
            current=current.next;
        }
    }

    public static int size(ListNode head){
        ListNode current=head;
        int count=0;
        while(current!=null){
            current=current.next;
            count++;
        }
        return count;
    }


    public static void main(String[] args) {
        ListNode head=new ListNode(1);
        ListNode first=new ListNode(2);
        ListNode second=new ListNode(3);
        ListNode third=new ListNode(4);

        head.next=first;
        first.next=second;
        second.next=third;

        int n=2;

        printLL(removeNthFromEnd(head,n));
    }


}
