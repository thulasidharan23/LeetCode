class Solution {
    public int minAddToMakeValid(String s) {
        int count=0;
        Stack<Character>st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(!st.isEmpty()){
                if(s.charAt(i)=='('){
                    st.push(s.charAt(i));
                }
                else if(s.charAt(i)==')' && st.peek()=='('){
                   st.pop(); 
                }
                else{
                    st.push(s.charAt(i));
                }
            }
            else{
                st.push(s.charAt(i));
            }   
        }
        return st.size();
    }
}