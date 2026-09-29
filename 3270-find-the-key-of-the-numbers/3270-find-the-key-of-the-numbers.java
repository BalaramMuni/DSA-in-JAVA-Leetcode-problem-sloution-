class Solution {
    public int generateKey(int num1, int num2, int num3) {
        //it means before adding 0 till it converts to 4 digit (4d)
        StringBuilder ans = new StringBuilder("");
        String str1 = String.format("%04d", num1);
        String str2 = String.format("%04d", num2);
        String str3 = String.format("%04d", num3);
        
        for(int i=0;i<4;i++) {
            char min = (char)Math.min(str1.charAt(i), Math.min( str2.charAt(i), str3.charAt(i) ));
            ans.append(min);
            
        }
    return Integer.parseInt(ans.toString());

    }
}