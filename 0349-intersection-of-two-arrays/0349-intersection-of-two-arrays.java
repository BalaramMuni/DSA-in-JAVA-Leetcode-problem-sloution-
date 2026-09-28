class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        ArrayList<Integer> li = new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            hm.put(nums1[i],i);
        }
        for(int j=0;j<nums2.length;j++){
            if(hm.containsKey(nums2[j])){
                li.add(nums2[j]);
                hm.remove(nums2[j]);
            }
        }
        int arr[] = new int[li.size()];
        for(int k=0;k<arr.length;k++){
            arr[k] = li.get(k);
        }
        return arr;
    }
}