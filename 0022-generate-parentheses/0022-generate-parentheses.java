class Solution {
    public List<String> generateParenthesis(int n) {
       List<String>lt=new ArrayList<>();
       String s="";
       generate(s,n,lt,0,0); 
       return lt;
    }
    void generate(String s,int n,List<String>lt,int open,int close){
        if(open<n){
            generate(s+"(",n,lt,open+1,close);
        }
        if(close<open){
            generate(s+")",n,lt,open,close+1);
        }
        if(s.length()==n*2){
                lt.add(s);
                return;
        }
    }
}