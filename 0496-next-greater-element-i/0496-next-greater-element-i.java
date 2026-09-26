class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer , Integer> hm = new HashMap<>();
        Stack<Integer> st = new Stack<>();
        for(int i=nums2.length-1;i>=0;i--){
            int num = nums2[i];
            while(!st.isEmpty() && st.peek() <= num){
                st.pop();
            }
            if(st.isEmpty()){
                hm.put(num,-1);
            }else{
                hm.put(num,st.peek());
            }
            st.push(num);

            }
             for(int j=0;j<nums1.length;j++){
                nums1[j] = hm.get(nums1[j]);
        }
        return nums1;
    }
}