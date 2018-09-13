package other;
import java.util.*;

public class SerialTree {
	public static String serialTree(TreeNode head) {
		if (head == null) return "#!";
		String result = serialTree(head.left);
		result += serialTree(head.right);
		result += head.val + "!";
		return result;
	}
	public static void main(String[] args) {
		System.out.println(serialTree(getTreeNode()));
		String s = serialTree(getTreeNode());
		TreeNode result = reSerialTree(s);
		System.out.println(serialTree(result));
	}
	public static TreeNode getTreeNode() {
		TreeNode head = new TreeNode(7);
		head.left = new TreeNode(1);
		head.right = new TreeNode(4);
		head.left.left = new TreeNode(2);
		head.left.right = new TreeNode(5);
		return head;
	}
	public static TreeNode reSerialTree(String s) {
		String[] result = s.split("!");
		Stack<String> stack = new Stack<>();
		for (int i = 0;i<result.length;i++) {
			stack.push(result[i]);
		}
		TreeNode head = reSerialTreeCore(stack);
		return head;
	}
	private static TreeNode reSerialTreeCore(Stack<String> stack) {
		String s = stack.pop();
		if(s.equals("#")) return null;
		TreeNode head = new TreeNode(Integer.parseInt(s));
		head.right = reSerialTreeCore(stack);
		head.left = reSerialTreeCore(stack);
		return head;
		
	}
}
