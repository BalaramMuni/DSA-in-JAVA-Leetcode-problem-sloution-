class Solution {
    public int findNonMinOrMax(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        ArrayList<Integer> li = new ArrayList<>();
        for(int i=1;i<nums.length;i++){
            max = Math.max(nums[i],max);
            min = Math.min(nums[i],min);
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i] != min && nums[i] != max){
                li.add(nums[i]);
            }
        }
        if(li.size() == 0){
            return -1;
        }
        return li.get(0);
    }
}