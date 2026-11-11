class Solution {
    public int minStartValue(int[] nums) {
        // by using prefix sum approach this question solved
        int counter = 1;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            counter = counter + nums[i];
            min = Math.min(min,counter);
        }
        if(min<=0){
            return Math.abs(min)+2;
        }
        return 1;
    }
}