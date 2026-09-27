class Solution {
    public int dominantIndex(int[] nums) {
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
        }
        int j = 0;
        while (j < nums.length) {
            if (nums[j] != max) {
                if (nums[j] * 2 > max) {
                    return -1;
                    
                }
            }
            j++;
        }
        for(int k=0;k<nums.length;k++){
            if(nums[k] == max){
                return k;
            }
        }
        return -1;
    }
}