import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;

public class ListNode {
    int val;
    ListNode next;

   ListNode(int val) {
        this.val = val;
    }

    public static void main(String[] args) {
        ListNode ln = new ListNode(1);
        ListNode head = ln;
        int i = 2;
        while (i <= 5){
            ln.next = new ListNode(i);
            ln = ln.next;
            i++;
        }
        ListNode tmp = head;
        while(tmp != null){
            System.out.println(tmp.val);
            tmp = tmp.next;
        }
        System.out.println("*************");

        ListNode first = removeNthFromEnd(head, 0);
        System.out.println("xxxxxxxxxxxx");
        System.out.println("after a node is removed");
        while(first != null) {
            System.out.println(first.val);
            first = first.next;
        }

    }
    public static int getSize(ListNode head){
       int size = 0;
       while(head != null){
           head = head.next;
           size++;
       }
       return size;
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
       int size = getSize(head);

       if(size < n) return head;

       ListNode first = head;
       size -= n;
       if(size == 0 ){
           first = head.next;
           return first;
       }
       while (size-1 > 0) {
           size--;
           first = first.next;
       }
       first.next = first.next.next;


       return head;

    }

}
