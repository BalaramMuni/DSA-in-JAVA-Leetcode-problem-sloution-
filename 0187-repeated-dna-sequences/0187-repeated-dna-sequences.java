class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        StringBuilder str = new StringBuilder("");
        HashSet<String> seen = new HashSet<>();
        HashSet<String> verify = new HashSet<>();


        ArrayList<String> li = new ArrayList<>();
        
        if(s.length() <= 10){
            return li;
        }
        //convert s to str it halps to use inbuilt function to find substring
        for(int i=0;i<s.length();i++){
            str.append(s.charAt(i));
        }
        //now str is same as s - > which is our string 
        int len = (s.length()-10)+1;
        for(int j=0;j<len;j++){
            String value = str.substring(j,10+j);
            if(seen.contains(value) && !verify.contains(value)){
                li.add(value);
                verify.add(value);
            }else{
                seen.add(value);
            }
        }
    return li;
    }
}