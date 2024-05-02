class Solution {
    public String removeDuplicates(String s) {
        Stack<Character>st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(st.isEmpty()){
                st.push(s.charAt(i));
            }
            if(s.charAt(i) == st.peek()){
                st.pop();
            }
            else{
                st.push(s.charAt(i));
            }
        }
        String a="";
        StringBuilder ans=new StringBuilder();
        while(!st.isEmpty()){
            a+=st.peek();
            ans.append(st.pop());
        }
        System.out.println(a);
        ans=ans.reverse();
        return ans.toString();
    }
}