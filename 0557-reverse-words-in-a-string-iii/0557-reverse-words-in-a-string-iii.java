class Solution {
    public String reverseWords(String s) {
        String words[]=s.split(" ");
        for(int i=0;i<words.length;i++){
            System.out.println(words[i]);
        }
        String[] ans=new String[words.length];
        for(int i=0;i<words.length;i++){
            StringBuilder sb=new StringBuilder(words[i]);
            ans[i]=sb.reverse().toString();
        }
        String a="";
        for(int i=0;i<ans.length;i++){
            a+=" "+ans[i];
        }
        return a.trim();
    }
}