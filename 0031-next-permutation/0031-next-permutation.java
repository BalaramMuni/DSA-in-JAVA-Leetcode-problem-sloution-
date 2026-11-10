class Solution {
    public void nextPermutation(int[] nums) {
        int pivot = -1;
        //her we iterate the loop for finding the pivot element where we want to change that element to the next greater element 
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                pivot = i;
                break;
            }
        }
        //if our array is already is big permutation 
        if(pivot == -1){
            Arrays.sort(nums);
            return;
        }
        
        // next larger element 
        for(int k=nums.length-1;k>pivot;k--){
            if(nums[k] > nums[pivot]){
                //swap it 
                int temp = nums[k];
                nums[k] = nums[pivot];
                nums[pivot] = temp;

                break;
            }
        }

        //now reverse element from pivot +1 to n-1
        int l = pivot+1;
        int m = nums.length-1;
        while(l<=m){
            int var = nums[l];
            nums[l] = nums[m];
            nums[m] = var;
            l++;
            m--;
        }
    }
}