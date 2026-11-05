class Solution {
    public String multiply(String num1, String num2) {
        //edge case
        if((num1.length() == 1 && num1.charAt(0)-'0' == 0 ) || (num2.length() == 1 && num2.charAt(0)-'0' == 0 )){
                return "0";
        }
        StringBuilder str = new StringBuilder("");
        int m = num1.length();
        int n = num2.length();
        //this is my answer array 
        int ans[] = new int[m + n];
        //this is my powerfactor which helps me to sum the product according to multiplication rule
        int pf = 0;
        for (int i = num1.length() - 1; i >= 0; i--) {
            int ival = num1.charAt(i) - '0';
            //initially my carray is 0 or after one interate of outer loop my carry becomes zero 
            int carry = 0;
            int k = ans.length - 1 - pf;

            int j = num2.length() - 1;
            while (j >= 0 || carry !=0) {
                int jval = j>=0? num2.charAt(j) - '0':0;
                j--;
                int prod = ival * jval + carry + ans[k];
                ans[k] = prod % 10;
                carry = prod / 10;
                k--;
            }
            pf++;
        }
        //after completion of both the loop my ans is stored in ans array but one problem is there
        //here we have to remove the leading zero soooooo...............
        boolean flag = false;
        for (int a = 0; a < ans.length; a++) {
            if (ans[a] == 0 && flag == false) {
                continue;
            } else {
                flag = true;
                str.append(ans[a]);
            }
        }
        return str.toString();
    }
}