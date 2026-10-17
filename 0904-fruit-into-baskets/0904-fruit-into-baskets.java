class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int low = 0;
        int max = -1;
        for (int high = 0; high < fruits.length; high++) {
            int curr = fruits[high];
            
            hm.put(curr, hm.getOrDefault(curr, 0) + 1);

            while (hm.size() > 2) {
                int left = fruits[low];
                hm.put(left, hm.get(left) - 1);
                if (hm.get(left) == 0) {
                    hm.remove(left);

                }
                low++;
            }

            max = Math.max(max, high - low + 1);
        }
        return max;
    }
}