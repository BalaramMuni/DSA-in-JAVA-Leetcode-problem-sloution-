class Solution {

    //function to check palindrome
    public boolean ispalindrome(String s) {
        int mid = s.length() / 2;
        int i = 0;
        int j = s.length() - 1;
        while (i <= mid) {
            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            } else {
                return false;
            }
        }
        return true;
    }

    public String longestPalindrome(String s) {
        StringBuilder str = new StringBuilder("");
        if (s.length() == 1) {
            return s;
        }
        String max = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String ans = s.substring(i, j);
                if (ispalindrome(ans)) {
                    if (ans.length() >= max.length()) {
                        max = ans;
                    }
                }
            }
        }

        return max;
    }
}