class Solution {
    int index = 0;

    public String decodeString(String s) {
        return helper(s);  
    }
    private String helper(String s){
        StringBuilder ans = new StringBuilder();
        int n = 0;
        while(index < s.length()){
            char ch = s.charAt(index);
            if(Character.isDigit(ch)){
                n = n*10 + (ch - '0');
                index++;
            }
            else if(ch == '['){
                index++;
                String decode = helper(s);
                for(int i=0; i<n; i++){
                    ans.append(decode);
                }
                n = 0;
            }
            else if(ch == ']'){
                index++;
                return ans.toString();
            }
            else{
                ans.append(ch);
                index++;
            }
        }
        return ans.toString();
    }
}