public class No1_TwoSum {
	public int[] twoSum(int[] nums, int target) {
		for (int i = 0; i <= nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					return new int[] { i, j };
				}
			}
		}
		return null;
	}

	public static void main(String[] args) {
		int[] nums = { 3, 3 };
		int target = 6;
		int[] a = new No1_TwoSum().twoSum(nums, target);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}