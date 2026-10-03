class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> li = new ArrayList<>();
        HashMap<Integer, Integer> hm = new HashMap<>();
        int rank = 1;
        for (int i = 0; i < nums.length; i++) {
            if (!hm.containsKey(nums[i])) {
                hm.put(nums[i], rank);
            } else {
                hm.put(nums[i], hm.get(nums[i]) + 1);
            }
        }
        int len = nums.length / 3;
        for (Integer key : hm.keySet()) {
           int count = hm.get(key);
           if(count > len ){
            li.add(key);
           }
        }
        return li;
    }
}