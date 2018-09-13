package premidafter;

import java.util.Stack;

import other.TreeNode;

public class afterOrder {
	public static void afterOrder(TreeNode head) {
		if (head == null) return ;
		 Stack<TreeNode> stack = new Stack<>();
		 Stack<TreeNode> helper = new Stack<>();
		 stack.push(head);
		 while (!stack.empty()) {
			 head = stack.pop();
			 helper.push(head);
			 if (head.left !=null) stack.push(head.left);
			 if (head.right !=null) stack.push(head.right);
		 }
		 while (helper.isEmpty() == false) {
			 System.out.println(helper.pop().val);
		 }
	}
	public static void main(String[] args) {
		afterOrder( new GetTree().getTreeNode());
	}
}
