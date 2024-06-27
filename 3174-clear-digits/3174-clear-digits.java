class Solution {
    public String clearDigits(String s) {
        Stack<Character>st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(st.isEmpty()){
                if(Character.isDigit(s.charAt(i))){
                    continue;
                }
                else{
                    st.push(s.charAt(i));
                }
            }
            else{
                if(Character.isDigit(s.charAt(i))){
                    st.pop();
                }
                else{
                    st.push(s.charAt(i));
                }
            }
        }
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
}