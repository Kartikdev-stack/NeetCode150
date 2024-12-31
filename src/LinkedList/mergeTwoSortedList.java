package LinkedList;
// MERGE TWO SORTED LISTS
public class mergeTwoSortedList {

    public static void main(String[] args) {
        ListNode list1=new ListNode(1);
        ListNode first=new ListNode(2);
        ListNode second=new ListNode(4);

        list1.next=first;
        first.next=second;

        ListNode list2=new ListNode(1);
        ListNode first1=new ListNode(3);
        ListNode second1=new ListNode(5);

        list2.next=first1;
        first1.next=second1;

        printLL(twoSortedLL(list1,list2));

    }


    public static void printLL(ListNode head){
        ListNode current=head;
        while (current!=null){
            System.out.print(current.val);
            current=current.next;
        }
    }

    public static ListNode twoSortedLL(ListNode list1, ListNode list2){
        ListNode mergedHead=list1;

        if(list1==null){
            return list2;
        }

        if(list2==null){
            return list1;
        }

            // determine the head of the list
        if(list1.val>list2.val){
                mergedHead=list2;
                list2=list2.next;
        }else{
                mergedHead=list1;
                list1=list1.next;
        }

        ListNode curr=mergedHead;
        while(list1!=null && list2!=null){
                if(list1.val>=list2.val){
                    curr.next=list2;
                    list2=list2.next;
                }else if(list1.val<list2.val){
                    curr.next=list1;
                    list1=list1.next;
                }
                curr=curr.next;
        }

        while (list1!=null){
            curr.next=list1;
            curr=curr.next;
            list1=list1.next;
        }

        while (list2!=null){
            curr.next=list2;
            curr=curr.next;
            list2=list2.next;
        }


           return mergedHead;
        }



    }




