package lin.solution;

public class Answertw {
	public static ListNode answertw(ListNode head,int num) {
		ListNode first = head;
		ListNode less =null,equal = null,more = null;
		while (head != null) {
			if(less == null && head.val <num) less = head;
			if(equal == null && head.val ==num) equal = head;
			if(more == null && head.val >num) more = head;
			head = head.next;
		}
		ListNode temless = less;
		ListNode temequal = equal;
		ListNode temmore = more;
		while (first != null) {
			if(first.val < num && first!=less) {
				temless.next = first;
				temless = temless.next;			
			}
			else if(first.val == num && first!=equal) {
				temequal.next = first;
				temequal = temequal.next;			
			}
			else if(first.val > num && first!=more) {
				temmore.next = first;
				temmore = temmore.next;			
			}
			first = first.next;
		}
		if (temmore != null)temmore.next = null;
		if (temequal != null)temequal.next = more;
		if(temless!= null) {
			temless.next = equal == null?more:equal;
			return less;
		}
		if (equal == null) return more;
		return equal;
	}
	public static void main(String[] args) {
		ListNode first  = new ListNode(1);
		ListNode head = first;
		first.next  = new ListNode(1);
		first = first.next;
		first.next  = new ListNode(4);
		first = first.next;
		first.next  = new ListNode(4);
		first = first.next;
		first.next  = new ListNode(2);
		first = first.next;
		first.next  = new ListNode(0);
		first = first.next;
		ListNode result = answertw(head,4);
		while (result != null) {
			System.out.println(result.val);
			result = result.next;
		}
	}
}
