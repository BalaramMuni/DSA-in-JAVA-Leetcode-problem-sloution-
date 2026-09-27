class Solution {
    public int findFinalValue(int[] nums, int original) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],i);
        }
        while(hm.containsKey(original)){
            original = original*2;
        }
        return original;
    }
}