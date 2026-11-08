class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int start = 0;
        int end = 0;
        int sum = 0;
        int count = 0;
        int avg = 0;
        for (end = 0; end < arr.length; end++) {
            sum = sum + arr[end];
            while (end - start + 1 >= k) {
                avg = sum / k;
                if (avg >= threshold) {
                    count++;
                }
                sum = sum - arr[start];
                start++;
            }

        }
        return count;
    }
}