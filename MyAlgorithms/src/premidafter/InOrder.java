package premidafter;
import java.util.Stack;

import other.TreeNode;
public class InOrder {
	public static void inOrder(TreeNode head) {
		 Stack<TreeNode> stack = new Stack<>();
		 while (head != null || !stack.empty()) {
			 if (head != null) {
				 stack.push(head);
				 head = head.left;
			 }else {
				 head = stack.pop();
				 System.out.println(head.val);
				 head = head.right;
			 }
		 }
	}
	public static void main(String[] args) {
		inOrder(new GetTree().getTreeNode());
	}
}
