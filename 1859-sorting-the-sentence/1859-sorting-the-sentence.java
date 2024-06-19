class Solution {
    public String sortSentence(String s) {
        String arr[]=s.split(" ");
        int n=arr.length;
        String ans[]=new String[n];
        for(String str:arr){
            int idx=str.charAt(str.length()-1)-'1';
            ans[idx]=str.substring(0,str.length()-1);
        }
        String st="";
        for(int i=0;i<ans.length;i++){
            st+=" "+ans[i];
        }
        return st.trim();
    }
}