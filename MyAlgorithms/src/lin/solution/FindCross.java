package lin.solution;

public class FindCross {
	public static ListNode findCross(ListNode p1,ListNode p2) {
		if (p1 == null || p2 == null) return null;
		ListNode loop1 = findLoop(p1);
		ListNode loop2 = findLoop(p2);
		if (loop1 == null && loop2 == null)
			return findLineCross(p1,p2,null);
		if(loop1 != null && loop2 != null) {
			if (loop1 == loop2) return findLineCross(p1,p2,loop1);
			ListNode temp = loop1.next;
			while (temp != loop1) {
				if (temp == loop2) return temp;
				temp = temp.next;
			}
		}
		return null;
	}

	private static ListNode findLineCross(ListNode p1, ListNode p2,ListNode cross) {
		ListNode start1 = p1;
		ListNode start2 = p2;
		int count1 = 1;
		int count2 = 1;
		while (p1.next != cross) {
			++count1;
			p1 = p1.next;
		}
		while (p2.next != cross) {
			++count2;
			p2 = p2.next;
		}
		if (cross == null) {
			if (p1 != p2) return null;
		}
		if(count1 > count2) {
			int num = count1 - count2;
			while (num > 0) {
				start1 = start1.next;
				num--;
			}
		}
		else {
			int num  =count2 - count1;
			while (num > 0) {
				start2 = start2.next;
				num--;
			}
		} 
		while (start1 != cross) {
			if (start1 == start2) return start1;
			start1 = start1.next;
			start2 = start2.next;
		}
		return cross;
	}

	private static ListNode findLoop(ListNode head) {
		if (head.next == null) return null;
		ListNode slow = head.next;
		ListNode fast = head.next.next;
		ListNode cross = null; 
		while (fast!= null && fast.next!= null) {
			if(fast == slow)  {
				cross = fast;
				break;
			}
			fast = fast.next.next;
			slow = slow.next;
		}
		if (cross != null) {
			while (cross != head) {
				cross = cross.next;
				head = head.next;
			}
		}
		return cross;
	}
	public static void main(String[] args) {
		// 1->2->3->4->5->6->7->null
		 ListNode head1 = new ListNode(1);
		head1.next = new  ListNode(2);
		head1.next.next = new  ListNode(3);
		head1.next.next.next = new  ListNode(4);
		head1.next.next.next.next = new  ListNode(5);
		head1.next.next.next.next.next = new  ListNode(6);
		head1.next.next.next.next.next.next = new  ListNode(7);

		// 0->9->8->6->7->null
		 ListNode head2 = new  ListNode(0);
		head2.next = new  ListNode(9);
		head2.next.next = new  ListNode(8);
		head2.next.next.next = head1.next.next.next.next.next; // 8->6
		System.out.println(findCross(head1, head2).val);

		// 1->2->3->4->5->6->7->4...
		head1 = new  ListNode(1);
		head1.next = new  ListNode(2);
		head1.next.next = new  ListNode(3);
		head1.next.next.next = new  ListNode(4);
		head1.next.next.next.next = new  ListNode(5);
		head1.next.next.next.next.next = new  ListNode(6);
		head1.next.next.next.next.next.next = new  ListNode(7);
		head1.next.next.next.next.next.next = head1.next.next.next; // 7->4

		// 0->9->8->2...
		head2 = new  ListNode(0);
		head2.next = new  ListNode(9);
		head2.next.next = new  ListNode(8);
		System.out.println(findCross(head1, head2));

		// 0->9->8->6->4->5->6..
		head2 = new  ListNode(0);
		head2.next = new  ListNode(9);
		head2.next.next = new  ListNode(8);
		System.out.println(findCross(head1, head2));

	}
}
