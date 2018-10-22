class Solution {
    public int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        if (len < 2) {
            return nums;
        }

        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }

        return nums;

    }
}