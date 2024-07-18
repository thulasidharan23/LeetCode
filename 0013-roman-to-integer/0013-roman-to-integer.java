class Solution {
    public int romanToInt(String s) {
        char symbol[]=new char[]{'I','V','X','L','C','D','M'};
        int value[]=new int[]{1,5,10,50,100,500,1000};
        HashMap<Character,Integer> ans=new HashMap<>();
        int answer=0;
        int prevval=0;
        for(int i=0;i<value.length;i++){
            ans.put(symbol[i],value[i]);
        }
        for(int i=s.length()-1;i>=0;i--){
           char curChar = s.charAt(i);
           
            int curval = ans.get(curChar);
            if(curval<prevval){
                answer-=curval;
            }
            else{
            answer+=curval;
            }
            prevval=curval;
        }
        return answer;
    }
}