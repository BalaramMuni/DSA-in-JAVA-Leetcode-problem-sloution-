class Solution {
    public int minMoves(int[] nums) {
        //here according to question only increment by one so 
        //wo have to find the largest value 

        //we need to sort the array
        Arrays.sort(nums);
        //the last value is the largest value

        int num = nums[nums.length-1];
        //now find the no of moves
        int moves = 0;

        for(int i=0;i<nums.length;i++){
            int val = num - nums[i];
            moves = moves + val;
        }
        return moves;
    }
}