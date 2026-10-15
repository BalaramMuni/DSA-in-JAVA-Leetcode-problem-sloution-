class Solution {
    public int sumCounts(List<Integer> nums) {
        int total = 0;
        HashSet<Integer> hs = new HashSet<>();
       for(int i=0;i<nums.size();i++){
        for(int j=i;j<nums.size();j++){
            hs.add(nums.get(j));
            total = total+(int)Math.pow(hs.size(),2);
        }
        hs.clear();
       }
        return total;
    }
}