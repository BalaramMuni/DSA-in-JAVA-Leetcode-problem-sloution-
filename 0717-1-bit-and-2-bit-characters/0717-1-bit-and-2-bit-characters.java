class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int i = 0;
        int num = 0;
        if (bits.length == 1) {
            return true;
        } else if (bits.length == 2) {
            if(bits[0] == 0){
                return true;
            }else{
                return false;
            }
        } else {
            while (i < bits.length - 2) {
                num = bits[i];
                if (num == 1) {
                    i = i + 2;
                } else {
                    i = i + 1;
                }
            }
        }
        if (bits[i] == 1) {
            return false;
        }
        return true;
    }
}