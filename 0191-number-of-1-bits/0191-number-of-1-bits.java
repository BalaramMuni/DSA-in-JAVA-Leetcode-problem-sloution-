class Solution {
    public int hammingWeight(int n) {
        StringBuilder str = new StringBuilder("");
        while( n != 0){
            int rem = n%2;
            str.append(rem);
            n = n/2;
        }
        int count = 0;
        for(int i=0; i<str.length();i++){
            if(str.charAt(i) == '1'){
                count++;
            }
        }
        return count;
    }
}