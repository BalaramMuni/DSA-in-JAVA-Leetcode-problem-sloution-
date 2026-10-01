class Solution {
    public int[] findErrorNums(int[] nums) {
        int ans[] = new int[2];
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 1; i <= nums.length; i++) {
            hm.put(i, 0);
        }
        for (int i = 0; i < nums.length; i++) {
            hm.put(nums[i], hm.get(nums[i]) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            if (entry.getValue() == 2) {
                ans[0] = entry.getKey();
            }
            if(entry.getValue() == 0){
                ans[1] = entry.getKey();
            }
        }
        return ans;
    }
}