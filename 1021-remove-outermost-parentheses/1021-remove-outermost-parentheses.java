class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character>st=new Stack<>();
        int count=0;
        String str="";
        
        for(int i=1;i<s.length();i++){
            
            if(s.charAt(i)=='('){
                count++;
                str+=s.charAt(i);
            }
            else if(s.charAt(i)==')' && count>=1){
                str+=s.charAt(i);
                count--;
                }
            else{
                i++;
                }
            }
        return str;
    }
}