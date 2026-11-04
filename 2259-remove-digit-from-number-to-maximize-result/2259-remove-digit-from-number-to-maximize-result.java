class Solution {
    public String removeDigit(String number, char digit) {
        int num = digit - '0';
        StringBuilder str = new StringBuilder(number);
        int idx = -1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == digit) {
                 idx = i;
                if (i + 1 < str.length() && str.charAt(i + 1) > digit) {
                    break;
                }
            }
        }
        str.deleteCharAt(idx);
        return str.toString();
    }
}