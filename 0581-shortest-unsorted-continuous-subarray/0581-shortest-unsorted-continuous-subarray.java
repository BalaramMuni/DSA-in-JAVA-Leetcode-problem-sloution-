class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int i = 0;
        int j = nums.length - 1;
        int sorted[] = nums.clone();
        Arrays.sort(sorted);

        while(i<j && nums[i]==sorted[i]){
            i++;
        }
        while(j>i&& nums[j] == sorted[j]){
            j--;
        }
        return i>=j?0:j-i+1;
    }
}