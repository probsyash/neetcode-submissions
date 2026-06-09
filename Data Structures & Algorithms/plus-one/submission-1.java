class Solution {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;      // no carry, done immediately
            }
            digits[i] = 0;          // was 9, becomes 0, carry continues
        }

        // only reach here if every digit was 9 (e.g. 999 → 1000)
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }
}