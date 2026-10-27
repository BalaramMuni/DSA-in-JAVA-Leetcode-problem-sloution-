class Solution {
    public int move(int nums[], int curr) {
        int next = curr;
        int seq = nums[curr];
        if (seq > 0) {
            next = (next + seq) % nums.length;
        } else {
            //for negative 
            int mod = seq % nums.length;
            int forward = mod + nums.length;
            next = (curr + forward) % nums.length;
        }
        return next;
    }

    public boolean circularArrayLoop(int[] nums) {
        // conditions for detect cycle 
        //all postives or all negatives and k>1
        //check for all indexes 
        for (int i = 0; i < nums.length; i++) {

            Set<Integer> st = new HashSet<>();
            st.add(i);

            boolean ispos = nums[i] > 0;

            int curr = i;
            while (true) {
                int next = move(nums, curr);

                if (ispos) {
                    if (nums[next] < 0) {
                        break;
                    } else {
                        if (st.contains(next)) {
                            if (curr != next) {
                                return true;
                            } else {
                                break;
                            }
                        }
                        st.add(next);
                    }
                } else {
                    if (nums[next] > 0) {
                        break;
                    } else {
                        if (st.contains(next)) {
                            if (curr != next) {
                                return true;
                            } else {
                                break;
                            }
                        }
                        st.add(next);
                    }
                }
                curr = next;
            }
        }
        return false;
    }
}
