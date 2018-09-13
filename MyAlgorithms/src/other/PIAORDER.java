package other;
public class PIAORDER{
	public static void preOrder(TreeNode head) {
		if(head == null) return ;
		System.out.print(" " + head.val);
		preOrder(head.left);
		preOrder(head.right);
	}
	public static void inOrder(TreeNode head) {
		if(head == null) return ;
		inOrder(head.left);
		System.out.print(" " + head.val);
		inOrder(head.right);
	}
	public static void afterOrder(TreeNode head) {
		if(head == null) return ;
		afterOrder(head.left);
		afterOrder(head.right);
		System.out.print(" " + head.val);
	}
	public static void main(String[] args) {
		TreeNode head = getTreeNode();
		inOrder(head);
	}
	public static TreeNode getTreeNode() {
		TreeNode head = new TreeNode(7);
		head.left = new TreeNode(1);
		head.right = new TreeNode(4);
		head.left.left = new TreeNode(2);
		head.left.right = new TreeNode(5);
		return head;
	}
	
}
