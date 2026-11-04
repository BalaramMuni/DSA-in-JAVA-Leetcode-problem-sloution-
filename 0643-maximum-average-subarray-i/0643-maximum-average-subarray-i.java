class Solution {
    public double findMaxAverage(int[] nums, int k) {
        //here the window size is given so fixed window applying 
        if(nums.length == 1){
            return (double)nums[0];
        }
        int j=0;
        double sum = 0;
        double avg;
        double max = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            sum  = sum + nums[i];
            if(i-j+1 >=k){
                avg = sum/k;
                max = Math.max(max,avg);
                sum = sum-nums[j];
                j++;
            }
        }
        return max;
    }
}