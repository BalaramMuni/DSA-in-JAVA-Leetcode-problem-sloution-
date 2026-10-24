class Solution {
    public int findDuplicate(int[] nums) {
        //here two pointer approach applied from linked list 
        int fast = 0;
        int slow = 0;
        while(true){
            fast = nums[nums[fast]];
            slow = nums[slow];

            if(slow == fast){
                slow = 0;
                while(slow != fast){
                    fast = nums[fast];
                    slow = nums[slow];   
                }
                return slow;
            }
        }
     
    }
}
