class Solution {
    public int singleNumber(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }

        int xor = nums[0];

        for (int i = 1, len = nums.length; i < len; i++) {
            xor = xor ^ nums[i];
        }

        return xor;
    }
}