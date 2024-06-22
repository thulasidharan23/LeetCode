class Solution {
    public int minOperations(String[] logs) {
        Stack<String>st=new Stack<>();
         for(int i=0;i<logs.length;i++){
             if(logs[i].equals("./")){
                continue;
            }
            else if(!logs[i].equals("./") && !logs[i].equals("../")){
                st.push(logs[i]);
            }
            else if(logs[i].equals("../") && st.size()!=0){
                st.pop();
            }
            System.out.println(st);
        }
        return st.size();  
    }
}