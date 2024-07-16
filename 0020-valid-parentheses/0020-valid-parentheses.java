class Solution {
    public boolean isValid(String s) {
        Stack <Character> st=new Stack<>();
        int count=0;
        for(int i=0;i<s.length();i++){
           if((s.charAt(i)==']'||s.charAt(i)==')'||s.charAt(i)=='}') && st.isEmpty()){
            return false;
           }
           if((s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='['))
           {
            st.push(s.charAt(i));
           }
           else{
           if(s.charAt(i)==']' && st.peek()=='['){
            st.pop();
           }
           
           else if(s.charAt(i)=='}' && st.peek()=='{'){
            st.pop();
           }
           
           else if(s.charAt(i)==')' && st.peek()=='('){
            st.pop();
           }
           else{
            return false;
           }
           }
        }
        int size=st.size();
        if(size!=0){
            return false;
        }
        return true;
    }
}
        