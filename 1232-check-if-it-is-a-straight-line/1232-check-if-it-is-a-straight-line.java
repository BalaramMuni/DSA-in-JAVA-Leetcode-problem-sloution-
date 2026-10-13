class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        int n = coordinates.length;
        int fast = coordinates[1][0] - coordinates[0][0];
        int last =  coordinates[1][1] - coordinates[0][1];
        for(int i=2;i<n;i++){
            int f = coordinates[i][0] - coordinates[0][0];
            int l = coordinates[i][1] - coordinates[0][1];
            if(fast*l != last*f){
                return false;
            }
        }
        return true;
    }
}