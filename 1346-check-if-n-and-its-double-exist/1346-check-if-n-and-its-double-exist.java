class Solution {
    public boolean checkIfExist(int[] arr) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int rank = 0;
        for (int i = 0; i < arr.length; i++) {
            hm.put(arr[i], rank);
            rank++;
        }
        boolean res = false;
        for (int j = 0; j < arr.length; j++) {
            int num = 2*arr[j];
            if (hm.containsKey(num) && hm.get(num) != j) {
                res = true;
            }
        }
        return res;
    }
}