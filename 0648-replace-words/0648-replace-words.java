class Solution {
    public String replaceWords(List<String> dic, String s) {
        String ch[]=s.split(" ");
        String str="";
        for(int i=0;i<dic.size();i++){
            for(int j=0;j<ch.length;j++){
                if(ch[j].startsWith(dic.get(i))){
                    ch[j]=dic.get(i);
                }
                
            }
            
        }
        for(int i=0;i<ch.length;i++){
                str=str+" "+ch[i];
            }
        return str.trim();
    }
}