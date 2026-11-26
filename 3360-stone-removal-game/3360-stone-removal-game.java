class Solution {
    public boolean canAliceWin(int n) {
    //    if(n < 10){
    //     return false;
    //    }
       int bob = 9;
       int alice = 10;
       while(true){
         n = n-alice;
         if(n <0){
            return false;
         }   
         n = n- bob;
         if(n <0){
            return true;
         }
         alice = alice -2;
         bob = bob -2;

       }
    }
}