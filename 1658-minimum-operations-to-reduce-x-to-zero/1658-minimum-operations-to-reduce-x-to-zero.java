class Solution {
    public int minOperations(int[] nums, int x) {
        //sliding window lagega 
        //we have to find the minimum operation tu reduce the x to 0
        //agar pura array ka sum me se x ko minus karde toh jo number ayega arry me maximum window ka sum wo number hona chaiye tab
        //jake minimum window pe  x ka value ayega 

        int total=0;
        int start=0;
        int end =0;
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            //to find the total sum
            total+=nums[i];
        }
        int target = total-x;
        int max = Integer.MIN_VALUE;
        boolean check = false;

        //now to find the maximum window which sum is target
        for(end = 0;end<nums.length;end++){
            sum = sum + nums[end];

            while(sum>target && start<=end){
                sum = sum- nums[start];
                start++;
            }
            if(sum == target){
                int len = end-start+1;
                max = Math.max(max,len);
                check = true;
            }
        }
        if(check == false){
            return -1;
        }
            return nums.length - max;
    }
}