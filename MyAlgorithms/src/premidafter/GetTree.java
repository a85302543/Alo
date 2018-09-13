package premidafter;

import other.TreeNode;

public class GetTree {
	public TreeNode getTreeNode() {
		TreeNode head = new TreeNode(7);
		head.left = new TreeNode(1);
		head.right = new TreeNode(4);
		head.left.left = new TreeNode(2);
		head.left.right = new TreeNode(5);
		return head;
}
}
