class Solution {
    public int addDigits(int num) {
        //     if(num < 9){
        //         return num;
        //     }
        //     int sum = 0;
        //     int rem =0; 
        //    while(num >0){
        //         rem = num%10;
        //         sum = sum+rem;
        //         num = num/10;
        //    }   
        //    int res =0;
        //    rem = 0;
        //    while(sum > 0){
        //     rem = sum%10;
        //     res = res+rem;
        //     sum = sum/10;
        //    }
        //        if(res > 9){
        //         return  res-9;
        //        }else{
        //         return res;
        //        }
        if (num <= 9) {
            return num;
        } else if (num % 9 == 0) {
            return 9;
        } else {
            return num % 9;
        }
    }
}