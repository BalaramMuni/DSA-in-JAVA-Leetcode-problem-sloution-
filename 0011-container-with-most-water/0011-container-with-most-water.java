class Solution {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length-1;
        int maxwater = 0;
        int currwater = 0;
        int high = 0;
        int width = 0;
        while(i<j){
            high = Math.min(height[i],height[j]);
            width = j-i;
            currwater = high*width;
            maxwater = Math.max(currwater,maxwater);

            if(height[i] > height[j]){
                j--;
            }else{
                i++;
            }
        }
        return maxwater;
    }
}