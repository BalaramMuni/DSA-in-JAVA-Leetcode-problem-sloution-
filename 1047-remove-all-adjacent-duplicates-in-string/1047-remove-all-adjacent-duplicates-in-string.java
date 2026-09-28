class Solution {
    public String removeDuplicates(String s) {
        StringBuilder str = new StringBuilder("");
        int count = 0;
        for(int i=0;i<s.length();i++){
            if(str.length()== 0){
                str.append(s.charAt(i)); 
            }
            else if(s.charAt(i) != str.charAt(count)){
                str.append(s.charAt(i));
                count++;
            }else{
                str.deleteCharAt(count);
                if(count > 0){
                    count--;
                }else{
                    count = 0;
                }
            }
        }
        return str.toString();
    }
}