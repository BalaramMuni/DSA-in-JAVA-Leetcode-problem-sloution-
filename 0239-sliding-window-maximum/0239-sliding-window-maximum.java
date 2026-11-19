class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int start = 0;
        int end = 0;
        int i = 0; // for array idx
        int arr[] = new int[nums.length - k + 1]; // no of subarray generated
        Deque<Integer> q = new ArrayDeque<>();

        for (end = 0; end < nums.length; end++) {

            // Current element se chhote elements remove karna hai 
            while (!q.isEmpty() && nums[q.peekLast()] <= nums[end]) {
                q.removeLast();
            }

            q.addLast(end); // queue stores the idx of the nums array

            while (end - start + 1 > k && start <= end) {
                if (!q.isEmpty() && q.peekFirst() == start) {
                    q.removeFirst();
                }
                start++;
            }
            if (end - start + 1 == k) {
                arr[i] = nums[q.peekFirst()];
                i++;
            }
        }
        return arr;
    }
}