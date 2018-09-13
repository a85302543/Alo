package other;
public class InverseList {
	public static ListNode inverseList (ListNode root) {
		if (root.next == null) return root;
		ListNode cur = root.next;
		ListNode before = root;
		ListNode after = root.next.next;
		before.next = null;
		while (cur != null) {
			cur.next = before;
			before = cur;
			cur = after;
			if (after != null) after = after.next;		
		}
		return before;
	}
	public static void main(String[] args) {
		ListNode a1 = new ListNode(1);
		ListNode a2 = new ListNode(7);
		ListNode a3 = new ListNode(2);
		ListNode a4 = new ListNode(5);
		ListNode a5 = new ListNode(4);
		a1.next = a2;
		a2.next = a3;
		a3.next = a4;
		a4.next = a5;
		ListNode result  = inverseList(a1);
		while (result != null) {
			System.out.println(result.val);
			result = result.next;
		}
	}
}
