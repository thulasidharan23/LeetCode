class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character>st=new Stack<>();
        
        for(int i=0;i<s.length();i++){
            if(st.isEmpty() && s.charAt(i)=='#'){
                continue;
            }
            if(s.charAt(i)=='#'){
                st.pop();
            }
            else{
                st.push(s.charAt(i));
            }
        }
        Stack<Character>st2=new Stack<>();
        for(int i=0;i<t.length();i++){
            if(st2.isEmpty() && t.charAt(i)=='#'){
                continue;
            }
            if(t.charAt(i)=='#'){
                st2.pop();
            }
            else{
                st2.push(t.charAt(i));
            }
        }
        String a="";
        while(!st.isEmpty()){
            a+=st.pop();
        }
        String b="";
        while(!st2.isEmpty()){
            b+=st2.pop();
        }
        return a.equals(b);
    }
}