class Solution {
    public int atmostk(int[] nums, int k) {
        int start = 0;
        int end = 0;
        int sum = 0;
        int count = 0;
        //here iterate the array and convert all even 0 and all odd number to 1
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                nums[i] = 0;
            } else {
                nums[i] = 1;
            }
        }
        for(end = 0;end<nums.length;end++){
            sum = sum + nums[end];
            while(start<=end && sum>k){
                sum = sum - nums[start];
                start++;
            }
            count = count+(end-start+1);
        }
        return count;
    }
    public int numberOfSubarrays(int[] nums, int k) {
       return atmostk(nums,k) - atmostk(nums,k-1);
    }
}