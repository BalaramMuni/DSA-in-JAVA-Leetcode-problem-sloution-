class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        long sum = 0;
        if(nums.length == 1){
            return nums[0]*nums[0];
        }
        //convert neg num to pos
        for(int i=0;i<n;i++){
            if(nums[i] < 0){
                nums[i] = -1*nums[i];
            }
        }
        Arrays.sort(nums);
        int l = 0;
        int r = n-1;
        while(l<r){
            sum = sum-(nums[l]*nums[l]);
            sum = sum+(nums[r]*nums[r]);
            l++;
            r--;
        }
        if(l == r){
            sum = sum+(nums[r]*nums[r]);
        }
        return sum;
    }
}