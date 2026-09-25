class Solution {
    public int[] searchRange(int[] nums, int target) {
        if (nums.length == 0) {
            return new int[] { -1, -1 };
        }
        int i = -1;
        int j = -1;
        int fast = 0;
        int last = nums.length - 1;

        while (fast <= last) {
            int mid = (fast + last) / 2;

            if (nums[mid] < target) {
                fast = mid + 1;
            }
             else if (nums[mid] > target) {
                last = mid - 1;
            }
             else {
                i = mid;
                last = mid - 1;
            }
        }
            fast=0;
            last=nums.length-1;
          while (fast <= last) {
            int mid = (fast + last) / 2;

            if (nums[mid] < target) {
                fast = mid + 1;
            }
             else if (nums[mid] > target) {
                last = mid - 1;
            }
             else {
                j = mid;
                fast = mid + 1;
            }
        }
        return new int[]{i,j};

    }
}