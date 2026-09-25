class Solution {
    public int[] arrayRankTransform(int[] arr) {
        HashMap<Integer, Integer> tm = new HashMap<>();
       int arr1[] = new int [arr.length];
       for(int i=0;i<arr.length;i++){
        arr1[i] = arr[i];
       }
       Arrays.sort(arr);
       int rank = 1;
       for(int j = 0;j<arr.length;j++){
        if(!tm.containsKey(arr[j])){
            tm.put(arr[j],rank);
            rank++;
        }
       }
       for(int k=0;k<arr.length;k++){
        arr[k] = tm.get(arr1[k]);
       }
    return arr;
    }
}
