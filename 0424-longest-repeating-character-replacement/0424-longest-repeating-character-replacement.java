class Solution {
    public int max(int arr[]){
        int max = 0;
        for(int i=0;i<arr.length;i++){
                max= Math.max(arr[i],max);   
        }
        return max;
    }
    public int characterReplacement(String s, int k) {
        int low=0;
        int res=0;
        int freq[] = new int[256];
        for(int high =0;high<s.length();high++){
            char ch = s.charAt(high);
            freq[ch]++;
            int maxnum = max(freq);
            int len = high-low+1;
           int diff = len-maxnum;

            while(diff>k){
                int left = s.charAt(low);
                freq[left]--;
                 low++;
                maxnum = max(freq);
                len = high-low+1;
                diff = len-maxnum;
                
            }
            if(diff<=k){
                len = high-low+1;
                res = Math.max(res,len);
            }
        }
        return res;
    }
}