class Solution {
    public int[] freq(String s) {
        int freq[] = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            freq[ch - 'a']++;
        }
        return freq;
    }

    public boolean checkInclusion(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();

        if (m > n) {
            return false;
        }

        int arr1[] = freq(s1);
        int arr2[] = new int[26];
        //here using sliding window ---> fixed 
        int start = 0;
        int end = 0;
        while (end < n) {
            char chh = s2.charAt(end);
            arr2[chh - 'a']++;

            if (end - start + 1 == m) {
                if (Arrays.equals(arr1, arr2)) {
                    return true;
                }
                char remo = s2.charAt(start);
                arr2[remo - 'a']--;
                start++;
            }
            end++;
        }
        return false;
    }
}