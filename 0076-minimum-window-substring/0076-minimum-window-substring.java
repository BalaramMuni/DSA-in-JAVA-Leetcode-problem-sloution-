class Solution {
    public boolean check(int have[] , int need[]){
        for(int k=0;k< 128;k++){
            if(have[k] < need[k]){
                return false;
            }
        }
        return true;
    }
    public String minWindow(String s, String t) {
        //edge case
        if(t.length() > s.length()){
            return "";
        }
        int high=0;
        int low = 0;
        int start=0;
        int min = Integer.MAX_VALUE;
        int have[] = new int[128];
        int need[] = new int[128];
        for(int i=0;i<t.length();i++){
            need[t.charAt(i)]++;
        }
        for(high=0;high<s.length();high++){
            have[s.charAt(high)]++;
            while(check(have,need)){
                int len = high-low+1;
                if(len < min){
                    min = len;
                     start = low;
                }
                have[s.charAt(low)]--;
                low++;
            }
        }
        if(min == Integer.MAX_VALUE){
            return "";
        }
    return s.substring(start,start+min);
    }
}