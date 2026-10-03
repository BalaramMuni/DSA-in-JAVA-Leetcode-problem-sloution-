class Solution {
    public boolean judgeSquareSum(int c) {
        int k = (int)Math.sqrt(c);
        int i = 0;
        int j = k;
        if(c == 0){
            return true;
        }
        while(i<=j){
            long sum = (long)i*i + (long)j*j;
             if(sum > c){
                j--;
            }else if(sum < c){
                i++;
            }else{
                return true;
            }
        }
        return false;
    }
}