class Solution {
    public int strStr(String haystack, String needle) {

        StringBuilder str = new StringBuilder("");
        int n = needle.length();

        for (int j = 0; j <= haystack.length() - n; j++) {

            str.setLength(0);

            for (int i = j; i < j + n; i++) {
                str.append(haystack.charAt(i));
            }

            if (str.toString().equals(needle)) {
                return j;
            }
        }

        return -1;
    }
}