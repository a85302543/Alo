package other;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Pre {
	public static TreeNode preOrder(int arr[]) {
		int index = 1;
		int count = 1;
		Queue<TreeNode> queue = new LinkedList<>();
		TreeNode head = new TreeNode(arr[0]);
		queue.add(head);
		while(true) {
			TreeNode num = queue.poll();
			if (++index >arr.length-1) break;
			num.left = new TreeNode(arr[index]);
			queue.add(num.left);
			if (++index >arr.length-1) break;
			num.right = new TreeNode(arr[index]);
			queue.add(num.right);
		}
		return head;
	}
	public static void main(String[] args) {
		int [] arr = {1,3,5,6,7,8,99};
		System.out.println(preOrder(arr));
	}
}
