class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        char ans = 'a';
        int max = Integer.MAX_VALUE;
        for(int i=0;i<letters.length;i++){
            char value = letters[i];
            int diff = (int)value - (int)target;
            if(diff<=0){
                continue;
            }else{
                if(diff < max){
                    max = diff;
                    ans = value;
                }
            }  
        }
        if(max == Integer.MAX_VALUE){
            return letters[0];
        }
        return ans;
    }
}