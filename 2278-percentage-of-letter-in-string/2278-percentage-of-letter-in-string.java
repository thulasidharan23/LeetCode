class Solution {
    public int percentageLetter(String s, char letter) {
        int len=s.length();
        int cnt=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==letter){
                cnt++;
            }
        }
        double ans=(cnt*100)/len;
        return (int)ans;
    }
}