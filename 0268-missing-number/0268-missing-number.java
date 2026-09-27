class Solution {
    public int missingNumber(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],i);
        }
        int j=0;
        while(j<=nums.length){
            if(hm.containsKey(j)){
                j++;
            }else{
                return j;
            }
        }
        
        return j;
        
        
    }
}