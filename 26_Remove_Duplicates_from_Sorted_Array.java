class Solution {
    public int removeDuplicates(int[] nums) {
        int eq = 1;
        int len = nums.length;
        if (len == 0) {
            return 0;
        }

        if (len-- == 1) {
            return 1;
        }

        for (int i = 0; i < len; i++) {
            if (nums[i] < nums[i + 1]) {
                nums[eq++] = nums[i + 1];
            }
        }

        return eq;
    }
}