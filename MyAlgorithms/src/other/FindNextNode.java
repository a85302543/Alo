package other;
public class FindNextNode {
	public static TreeNode findNextNode (TreeNode head) {
		if(head == null) return null;
		if (head.right != null) {
			return findLeftMost(head.right);
		}
		TreeNode son = head;
		TreeNode parent = head.father;
		while (parent != null && parent.left != son) {
			son = son.father;
			parent = parent.father;
		}
		return parent;
	}

	private static TreeNode findLeftMost(TreeNode right) {
		if (right == null) return null;
		while (right.left != null) {
			right = right.left;
		}
		return right;
	}
	public static void main(String[] args) {
		System.out.println(findNextNode(getTreeNode().left.right).val);
	}
	public static TreeNode getTreeNode() {
		TreeNode head = new TreeNode(7);
		head.left = new TreeNode(1);
		head.left.father = head;
		head.right = new TreeNode(4);
		head.right.father = head;
		head.left.left = new TreeNode(2);
		head.left.left.father = head.left;
		head.left.right = new TreeNode(5);
		head.left.right.father = head.left;
		return head;
	}
}
