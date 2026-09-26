class Solution {
    public int[] plusOne(int[] digits) {
     for (int i = digits.length - 1; i >= 0; i--) {

            // If digit is less than 9, simply add 1
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            // If digit is 9, make it 0 and carry 1
            digits[i] = 0;
        }

        // If we reach here, all digits were 9
        int[] arr = new int[digits.length + 1];
        arr[0] = 1;

        return arr;
    }
}