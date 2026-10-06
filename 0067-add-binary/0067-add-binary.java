class Solution {
    public String addBinary(String a, String b) {
        StringBuilder str = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        int sum = 0;
        int rem = 0;
        while (i >= 0 && j >= 0) {
            sum = (a.charAt(i) - '0') + (b.charAt(j) - '0') + carry;
            rem = sum % 2;
            carry = sum / 2;
            str.append(rem);
            i--;
            j--;
        }
        while (i >= 0) {
            sum = carry + (a.charAt(i) - '0');
            rem = sum % 2;
            carry = sum / 2;
            str.append(rem);
            i--;
        }
        while (j >= 0) {
            sum = carry + (b.charAt(j) - '0');
            rem = sum % 2;
            carry = sum / 2;
            str.append(rem);
            j--;
        }
        if (carry == 1) {
            str.append(carry);
        }
        str.reverse();
        String ans = str.toString();
        return ans;
    }
}