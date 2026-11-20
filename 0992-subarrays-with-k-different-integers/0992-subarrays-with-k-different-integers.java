class Solution {
    public int Atmost(int nums[], int k) {
        int start = 0;
        int end = 0;
        int count = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (end = 0; end < nums.length; end++) {
            hm.put(nums[end], hm.getOrDefault(nums[end], 0) + 1); // store the freq of number

            while (hm.size() > k && start <= end) {
                hm.put(nums[start], hm.get(nums[start]) - 1);

                if (hm.get(nums[start]) == 0) {
                    hm.remove(nums[start]);
                }
                start++;
            }
            count = count + (end - start + 1);
        }
        return count;
    }

    public int subarraysWithKDistinct(int[] nums, int k) {
        return Atmost(nums,k) - Atmost(nums,k-1);
    }
}