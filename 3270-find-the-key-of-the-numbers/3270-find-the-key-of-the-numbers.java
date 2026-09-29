class Solution {
    public int generateKey(int num1, int num2, int num3) {
        //it means before adding 0 till it converts to 4 digit (4d)
        StringBuilder ans = new StringBuilder("");
        String str1 = String.format("%04d", num1);
        String str2 = String.format("%04d", num2);
        String str3 = String.format("%04d", num3);
        int i = 0;
        while (i < 4) {
            char a = str1.charAt(i);
            char b = str2.charAt(i);
            char c = str3.charAt(i);
            char min = (char)Math.min(a, Math.min(b, c));
            ans.append(min);
            i++;
        }
    String val = ans.toString();
    return Integer.parseInt(val);
        

    }
}