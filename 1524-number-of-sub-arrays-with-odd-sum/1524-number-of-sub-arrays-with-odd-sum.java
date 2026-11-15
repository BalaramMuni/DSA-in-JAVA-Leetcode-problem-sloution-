class Solution {
    public int numOfSubarrays(int[] arr) {
        long odd = 0, even = 1;
        int sum = 0;
        long count = 0;
        //traverse the array 
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            if (sum % 2 == 0) {
                count = count + odd;
                even++;
            } else {
                count = count + even;
                odd++;
            }
        }
        return (int) (count % 1000000007);
    }
}