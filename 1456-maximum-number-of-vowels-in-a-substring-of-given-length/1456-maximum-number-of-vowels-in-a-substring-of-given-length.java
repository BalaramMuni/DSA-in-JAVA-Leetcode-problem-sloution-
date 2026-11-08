class Solution {
    public int maxVowels(String s, int k) {
        //here we apply sliding window (fixed window)

        int start = 0;
        int end = 0;
        int count = 0;
        int max = 0;
        //edge case 

        for(end = 0;end<s.length();end++){
            char ch = s.charAt(end);
            if(ch == 'a' || ch =='e' || ch=='i' || ch=='o' || ch == 'u'){
                count++;
            }
            while(end-start+1 > k){
                char chh = s.charAt(start);
                if(chh == 'a' || chh =='e' || chh=='i' || chh=='o' || chh == 'u'){
                    count--;
                }
                start++;
            }
            max = Math.max(max,count);
        }
        return max;
    }
}