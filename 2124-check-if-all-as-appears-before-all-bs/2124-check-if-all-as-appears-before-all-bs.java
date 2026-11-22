class Solution {
    public boolean checkString(String s) {
        int n = s.length();
        int i = 0;
        while(i<=s.length()-2){
            if(s.charAt(i)-'0' > s.charAt(i+1)-'0'){
                return false;
            }
            i++;
        }
        return true;
    }
}