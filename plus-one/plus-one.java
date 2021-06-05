class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length - 1;
        int new_num = digits[n] + 1;
        if (new_num < 10) {
            digits[n] = new_num;
        } else {
            digits[n] = 0;
            int bring = 1;
            int i = n - 1;
            while (bring > 0) {
                if (i < 0) {
                    int[] new_digits = new int[digits.length+1];
                    new_digits[0] = 1;
                    return new_digits;
                }
                int new_prev = digits[i] + bring;
                if (new_prev < 10) {
                    digits[i] = new_prev;
                    bring = 0;
                } else {
                    digits[i--] = 0;
                }
            }
        }
        return digits;
    }
}