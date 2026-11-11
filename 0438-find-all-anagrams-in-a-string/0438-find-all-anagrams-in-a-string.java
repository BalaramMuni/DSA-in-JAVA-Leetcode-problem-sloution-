class Solution {
    public boolean compare(int have[],int need[]){
        for(int i=0;i<need.length;i++){
            if(have[i] != need[i]){
                return false;
            }
        }
        return true;
    }
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> li = new ArrayList<>();
        int have[] = new int[26];
        int need[] = new int[26];

        //now findout freq of P and store into have array

        for(int i=0;i<p.length();i++){
            have[p.charAt(i)-'a']++;
        }
        int start = 0;
        int end = 0;
        //by applying sliding window fixed window
        for(end=0;end<s.length();end++){
            need[s.charAt(end)-'a']++;
            while(end-start+1 >= p.length() && start<=end){
                boolean ans = compare(have,need);
                if(ans){
                    li.add(end-p.length()+1);
                }
                need[s.charAt(start)-'a']--;
                start++;
            }
        }
        return li;
    }
}