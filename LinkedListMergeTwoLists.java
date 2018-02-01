/**
 * Created by saidrobley on 8/13/17.
 */
public class LinkedListMergeTwoLists {
    public class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
        }
    }

    private ListNode mergeTwoLists(ListNode l1, ListNode l2){
        if(l1 == null)
            return l2;
        if(l2 == null)
            return l1;
        if(l1.val <= l2.val){
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else if (l2.val < l1.val){
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
        return null;
    }
    ListNode l1 = new ListNode(1);
    public static void main(String[] args){

    }
}














