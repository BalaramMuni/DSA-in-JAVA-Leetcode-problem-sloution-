class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0;
        StringBuilder str = new StringBuilder("");
    int i = s.length()-1;
        while((i>=0) && (s.charAt(i) != ' ' || str.length() == 0)){
            if(s.charAt(i) != ' '){
                str.append(s.charAt(i));
                count++;
            }
            i--;
        }
        return count;
    }
}