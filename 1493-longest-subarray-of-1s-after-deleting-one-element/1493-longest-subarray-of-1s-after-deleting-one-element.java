class Solution {
    public int longestSubarray(int[] nums) {
                int n = nums.length;
                int low = 0;
                int max = 0;
                int one = 0;
                int zero = 0;
                for (int high = 0; high < n; high++) {
                    if (nums[high] == 1) {
                        one++;
                    } else {
                        zero++;
                    }
                    while (zero > 1) {
                        if (nums[low] == 0) {
                            zero--;

                        } else {
                            one--;
                        }
                        low++;
                    }
                    int len = high - low ;
                    max = Math.max(max, len);
                }
                return max;
            }
        }