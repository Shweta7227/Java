class Solution {
    public int[] plusOne(int[] digits) {
          int n = digits.length;

        // Traverse the array from the end to the beginning
        for (int i = n - 1; i >= 0; i--) {
            // If current digit is less than 9, just increment and return
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            // If it's 9, set to 0 and continue to carry
            digits[i] = 0;
        }

        // If loop ends, that means all digits were 9 (like 999 + 1 = 1000)
        int[] result = new int[n + 1];
        result[0] = 1; // Set first digit to 1, rest are 0 by default
        return result;
        
    }
}