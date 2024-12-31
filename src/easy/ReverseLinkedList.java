package easy;

import LinkedList.ListNode;

import java.util.List;


public class ReverseLinkedList {

    public static void main(String[] args){
        ListNode head=new ListNode(1);
        ListNode first=new ListNode(2);
        ListNode second=new ListNode(3);
        ListNode third=new ListNode(4);
        ListNode last=new ListNode(5);


        head.next=first;
        first.next=second;
        second.next=third;
        third.next=last;

        // og linked list
        printLL(head);

        System.out.println();
        printLL(reverseLL(head));

    }

    public static ListNode reverseLL(ListNode head) {
        ListNode previous = null;
        ListNode next = null;
        ListNode current = head;

        // 1->2->3->4->5

        while (current != null) {
            next = current.next;

            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }

    public static void printLL(ListNode head) {
        ListNode temp = head;

        while (temp != null) {
            System.out.print(temp.val); // Print the value of the current node
            if (temp.next != null) {   // If there's a next node, print "->"
                System.out.print("->");
            }
            temp = temp.next; // Move to the next node
        }
        System.out.println(); // Print a newline at the end
    }



}
