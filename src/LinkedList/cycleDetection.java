package LinkedList;

public class cycleDetection {
    public static void main(String[] args) {
          ListNode head=new ListNode(1);
//          ListNode first=new ListNode(2);
//            ListNode second=new ListNode(3);
//            ListNode third=new ListNode(4);
//
//            head.next=first;
//            first.next=second;
//            second.next=third;
//            third.next=second;

        System.out.println(hasCycle(head));

    }


    public static boolean hasCycle(ListNode head){
        ListNode slow=head;
        ListNode fast=head;  // initially both the pointers are pointing at the head


        while(slow!=null && fast!=null && fast.next!=null && slow.next!=null){
            slow=slow.next;
            fast=fast.next.next;

            if(slow==fast){
                return true; // the loop is rotating
            }

        }

        return false; // even if one of the pointers hit null means end of loop clearly means the loop is not rotating
    }

}
