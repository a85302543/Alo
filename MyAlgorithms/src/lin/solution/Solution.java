package lin.solution;

public class Solution {
	static int num = 0;
    TreeNode DeserializeCore(String[] str){
        if (str[num].equals("$") == false){
            TreeNode root = new TreeNode(Integer.parseInt(str[num]));
            num++;
            root.left = DeserializeCore(str);
            num++;
            root.right = DeserializeCore(str);
            return root;
        }else{
            num++;
        }
        return null;
    }
    TreeNode Deserialize(String str) {
        if (str == null || str.length() == 0) return null;
       String [] arr = str.split(",");
        TreeNode result = DeserializeCore(arr);
        num = 0;
        return result;
  }
    public static void main(String[] args) {
    	String str = "8,6,10,5,7,9,11";
		TreeNode t = new Solution().Deserialize(str);
	}
}
