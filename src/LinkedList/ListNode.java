package LinkedList;

public class ListNode {

    public int val;
    public ListNode next;
    public ListNode(){};
    public ListNode(int val){
        this.val=val;
    }

    public void printLL(ListNode head){
        ListNode current=head;
        while (current!=null){
            System.out.print(current.val);
            current=current.next;
        }
    }
}
