package other;
public class isBT {
	public static boolean isBT(TreeNode head) {
		if (head == null) return true;
		return isBTCore(head) == -1 ? false:true;
	}

	private static int isBTCore(TreeNode head) {
		if (head == null) return 0;
		int left = isBTCore(head.left);
		int right = isBTCore(head.right);
		if(left == -1 || right == -1) return -1;
		int length = Math.abs(left - right);
		if(length >1) return -1;
		return Math.max(left, right) + 1;
	}
	public static TreeNode getTreeNode() {
		TreeNode head = new TreeNode(7);
		head.left = new TreeNode(1);
		head.right = new TreeNode(4);
		head.left.left = new TreeNode(2);
		head.left.right = new TreeNode(5);
		head.right.right =  new TreeNode(8);
		return head;
	}
	public static void main(String[] args) {
		System.out.println(isBT(getTreeNode()));
	}
}
