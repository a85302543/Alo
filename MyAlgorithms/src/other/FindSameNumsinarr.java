package other;

public class 	FindSameNumsinarr{
	public  int findSame (int[] nums) {
		if (nums == null || nums.length == 0) return -1;
		int result = Count(1,nums.length-1,nums);
		return result;
	}

	private int Count(int start, int end, int[] nums) {
		if (end == start) return start;
		int sum = 0;
		int mid  = (start + end)/2;
		for (int i = 0;i<nums.length;i++) {
			if (nums[i]>=start && nums[i] <= mid)
				sum++;
		}
		if (sum > (mid - start + 1)) return Count(start, mid, nums);
		else return Count(mid + 1, end, nums);
	}
	public static void main(String[] args) {
		int [] nums = {1,3,3,4,2,8,7,6};
		FindSameNumsinarr test2 = new FindSameNumsinarr();
		System.out.println(test2.findSame(nums));
	}
}
