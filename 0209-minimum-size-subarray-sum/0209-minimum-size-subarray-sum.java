class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int start = 0;
        int end = 0;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        while(end < nums.length){
            sum = sum+nums[end];
            while(sum>=target){
                int idx = (end-start)+1;
                min = Math.min(min,idx);
                sum = sum-nums[start];
                start++;
            }
            end++;
        }
        if(min == Integer.MAX_VALUE){
            return 0;
        }
        return min;
    }
}