class Solution {
    public void rotate(int[] nums, int k) {

        if (k < 0) {
            throw new IllegalArgumentException();
        }

        int len = nums.length;
        if (len == 0 || len == 1 || len == k) {
            return;
        }

        if (k > len) {
            k = k % len;
        }

        int i;
        while (k > 0) {
            i = nums[len - 1];

            for (int j = len - 1; j > 0; j--) {
                nums[j] = nums[j - 1];
            }

            nums[0] = i;
            k--;
        }
    }
}