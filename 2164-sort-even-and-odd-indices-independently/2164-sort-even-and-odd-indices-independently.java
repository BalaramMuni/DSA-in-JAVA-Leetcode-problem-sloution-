class Solution {
    public int[] sortEvenOdd(int[] nums) {
        int even[];
        int odd[];
        if (nums.length % 2 == 0) {
            even = new int[nums.length / 2];
             odd = new int[nums.length / 2];
        } else {
             even = new int[(nums.length / 2) + 1];
             odd = new int[nums.length / 2];
        }
        int result[] = new int[nums.length];
        int i = 0;
        int j = 0;
        for (int k = 0; k < nums.length; k++) {
            if (k % 2 == 0) {
                even[i] = nums[k];
                i++;
            } else {
                odd[j] = nums[k];
                j++;
            }
        }
        Arrays.sort(even);
        Arrays.sort(odd);
        int m = 0;
        int n = odd.length - 1;
        int o = 0;
        while (o < nums.length) {
            if (o % 2 == 0) {
                result[o] = even[m];
                m++;
                o++;
            } else {
                result[o] = odd[n];
                o++;
                n--;
            }
        }
        return result;
    }
}