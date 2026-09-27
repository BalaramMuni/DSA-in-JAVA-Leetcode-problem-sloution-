class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int arr1[] = new int[nums.length];
        if(nums.length == 1){
            return nums;
        }
        int i=0;
        int j = nums.length-1;
        for(int k=0;k<nums.length;k++){
            if(nums[k] %2 == 0){
                arr1[i] = nums[k];
                i++;
            }else{
                arr1[j] = nums[k];
                j--;
            }
        }
        return arr1;

    }
}