class Solution {
    public int minimizeSum(int[] nums) {
        //edge case 
        if (nums.length == 3){
            return 0;
        }

        //here we have to sort the array becuz we need to reack 1st extreme element or last extreme element 
        //if last element replace to smallest number as possible  = ans is 3rd greater element - smalles number
                                                                    //nums[nums.length-3] - nums[0]

        //or  if we replace 1st 2 element to small number  = then ans is nums[nums.length-1] - nums[2] // 3rd element 

        //or if we replace 1st one and last one then the res = is nums[nums.length-2] - nums[1];

        //in which way is more better we need to choose how is this possible ????????
        // need to check in way the score is imnimum then return that minimum score

        Arrays.sort(nums);

        //replace 1st two element 
        int score1 = nums[nums.length-1] - nums[2];

        //replace last 2 element 
        int score2 = nums[nums.length-3] - nums[0];

        //replace last element ans first element 
        int score3 = nums[nums.length-2] - nums[1];

        return Math.min(score1,Math.min(score2,score3));

    }
}