class Solution {
    public int minMoves2(int[] nums) {
        int n = nums.length;
        //sort the array
        Arrays.sort(nums);

        //find the value of mid idx

        int num = n/2;
        int number = nums[num];
        int count = 0;
        for(int i=0;i<nums.length;i++){
            int res = Math.abs(nums[i]-number);
            count = count+res;
        }
        return count;
    }
}