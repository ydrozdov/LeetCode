class Solution {
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        boolean needsNewArray = false;

        if (digits[len - 1] == 9) {
            for (int i = len - 1; i >= 0; i--) {
                if (i == 0 && digits[i] == 9) {
                    needsNewArray = true;
                }

                if (digits[i] == 9) {
                    digits[i] = 0;
                } else {
                    digits[i]++;
                    break;
                }
            }
        } else {
            digits[len - 1]++;
        }

        if (needsNewArray) {
            int[] newArr = new int[len + 1];
            newArr[0] = 1;
            return newArr;
        }

        return digits;
    }
}