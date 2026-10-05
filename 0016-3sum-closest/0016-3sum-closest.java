class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
         int ressum = 0;
         int mindiff = Integer.MAX_VALUE;
        for(int i=0;i<nums.length-2;i++){
            int j = i+1;
            int k = nums.length-1;
            while(j < k){
                int sum = nums[i]+nums[j]+nums[k];
                if(sum == target){
                    return target;
                }
                int diff = Math.abs(sum-target);
               if(diff < mindiff){
                  mindiff = diff;
                  ressum = sum;
               }
                else if(sum < target){
                     j++;
                }else{
                    k--;
                }
            }
        }
        return ressum;
    }
}