class Solution {
    public String removeOuterParentheses(String s) {
        String ans = "";
        StringBuilder res = new StringBuilder("");
        int i=0;
        int count = 0;
        while(i<s.length()){
            char ch = s.charAt(i);
            if(ch == '('){
                res.append(ch);
                count++;
            }else{
                res.append(ch);
                count--;
                if(count == 0){
                    String curr = res.substring(1,res.length()-1);
                    ans = ans+curr;
                    res.setLength(0);
                }
            }
            i++;
        }
    return ans;
    }
}