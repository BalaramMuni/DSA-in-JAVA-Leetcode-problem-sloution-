class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        HashMap<Integer,Integer> hm = new HashMap<>();
        int rank = 1;
        for(int i=0;i<nums.length;i++){
            if(!hm.containsValue(nums[i])){
                hm.put(rank,nums[i]);
                rank++;
            }
        }
        if(hm.size() < 3){
            return hm.get(hm.size());
        }else{
            return hm.get(hm.size()-2);
        }

      
    }
}