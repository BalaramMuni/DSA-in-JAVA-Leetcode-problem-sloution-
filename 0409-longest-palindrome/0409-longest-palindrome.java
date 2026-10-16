class Solution {
    public int longestPalindrome(String s) {
        if(s.length() == 1) return 1;
        int arr[] = new int[128];
        int count=0;
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)]++;
        }
        for(int j=0;j<arr.length;j++){
            count = count + (arr[j]/2)*2;
        }
        if(count < s.length()){
            count++;
        }
        return count;
    }
}