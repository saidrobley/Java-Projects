import java.sql.SQLOutput;

public class TwoLinkedListNumber {
	
	public static void main(String[] args) {
		ListNode l1 = new ListNode(2);
		l1.next = new ListNode(4);
		l1.next.next = new ListNode(3);
		
	
		
		ListNode l2 = new ListNode(5);
		l2.next = new ListNode(6);
		l2.next.next = new ListNode(4);
		
		ListNode test = addTwoLinkedListNumber(l1, l2);
		while(test != null) {
			System.out.println(test.val);
			test = test.next;
		}
		
	}
	
	public static ListNode addTwoLinkedListNumber(ListNode n1, ListNode n2) {
		ListNode dummyHead = new ListNode(0);
		ListNode p = n1;
		ListNode q = n2;
		ListNode curr = dummyHead;
		int carry = 0;
		while(p != null || q != null) {
			int x = (p != null) ? p.val: 0;
			int y = (q != null) ? q.val: 0;
			int sum = carry + x + y;
			carry = sum/10;
			// if the sum is 2 digits use the right most digit
			curr.next = new ListNode(sum % 10);
			curr = curr.next;
			if(p != null) p = p.next;
			if(q != null) q = q.next;
			
		}
		
		if(carry > 0) {
			curr.next = new ListNode(carry);
			
		}
		return dummyHead.next;
	}
	
	
	
}
