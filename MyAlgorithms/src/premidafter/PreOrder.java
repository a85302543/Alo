package premidafter;

import java.util.Stack;

import other.TreeNode;

public class PreOrder {
	 public static void preOrder(TreeNode treeNode) {
		 if (treeNode == null) return;
		 Stack<TreeNode> stack = new Stack<>();
		 stack.push(treeNode);
		 while (!stack.empty()) {
			 treeNode = stack.pop();
			 System.out.println(treeNode.val);
			 if (treeNode.right != null)stack.push(treeNode.right);
			 if (treeNode.left != null)stack.push(treeNode.left);
		 }
	 }
	 public static void main(String[] args) {
		preOrder(new GetTree().getTreeNode());
	}
}
