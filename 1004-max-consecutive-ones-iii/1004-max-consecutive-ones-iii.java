class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int high=0;
        int low = 0;
        int max = 0;
        int one = 0;
        int zero = 0;
        for(high=0;high<n;high++){
            if(nums[high] == 1){
                one++;
            }else{
                zero++;
            }
            while(zero > k){
                if(nums[low] == 0){
                    zero--;
                }else{
                    one--;
                }
                low++;
            }
            int len = high-low+1;
            max = Math.max(max,len);
        }
        return max;
    }
}