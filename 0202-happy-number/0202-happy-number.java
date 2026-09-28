class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> hs = new HashSet<>();
        while(n !=1 && !hs.contains(n)){
            hs.add(n);

            int currres = 0;
            while(n > 0){
                int rem = n %10;
                currres = currres+ (rem*rem);
                n = n/10;
            }
            n = currres;
        }
        return n == 1;
        
    }
}