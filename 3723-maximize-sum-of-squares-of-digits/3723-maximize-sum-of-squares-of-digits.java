class Solution {
    public String maxSumOfSquares(int num, int sum) {
        int i=0;
        int total = 0;
        StringBuilder str = new StringBuilder("");
        if(num*9 < sum){
            return "";
        }
        while(i<num && sum>0){
            if(sum >= 9){
                str.append("9");
                sum = sum-9;
            }else{
                str.append(sum);
                sum = sum-sum;
            }
            i++;
        }
        while(i<num){
            str.append("0");
            i++;
        }
        
        return str.toString();

    }
}