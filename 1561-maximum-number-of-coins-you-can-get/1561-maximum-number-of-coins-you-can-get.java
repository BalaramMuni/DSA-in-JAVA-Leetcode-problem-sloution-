class Solution {
    public int maxCoins(int[] piles) {
        //i choose the triplet 
        //in this triplet i get the 2nd largest value so we need to sort the array

        Arrays.sort(piles);
        int i = piles.length;

        int m = piles.length;
        int coin = 0;
        while (i > 0) {
            coin = coin + piles[m - 2];
            m = m-2;
            i = i-3;
        }
        return coin;
    }
}