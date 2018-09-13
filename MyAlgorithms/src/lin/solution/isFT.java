package lin.solution;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class isFT {
	public static boolean isFT(TreeNode head) {
		if(head == null) return true;
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(head);
		boolean state = false;
		while (!queue.isEmpty()) {
			TreeNode node = queue.poll();
			if (node.left ==null && node.right != null) return false;
			if (state) {
				if(node.left !=null || node.right != null) return false;
			}
			if(!state && (node.left == null || node.right == null)) {
				state = true;
			}
			if (node.left != null)queue.add(node.left);
			if (node.right!= null) queue.add(node.right);
		}
		return true;
	}
	public static void main(String[] args) {
		TreeNode head = new TreeNode(1);
		head.left = new TreeNode(2);
		head.right = new TreeNode(3);
		head.left.left = new TreeNode(4);
		head.left.right = new TreeNode(5);
		head.right.right = new TreeNode(6);
		System.out.println(isFT(head));
	}
}
