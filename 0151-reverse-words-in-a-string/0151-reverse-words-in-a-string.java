class Solution {
    public String reverseWords(String s) {
        String arr[]=s.split(" ");
        String ans="";
        for(int i=arr.length-1;i>=0;i--){
            ans+=arr[i]+" ";
        }
        ans=ans.replaceAll("\s{2,}"," ");
        return ans.trim();
    }
}