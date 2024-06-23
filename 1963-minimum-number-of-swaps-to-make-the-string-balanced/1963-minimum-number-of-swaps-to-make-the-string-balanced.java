class Solution {
    public int minSwaps(String s) {
        int cnt=0,swap=0;
        int len=s.length()-1;
        char[]st=s.toCharArray();
        for(int i=0;i<st.length;i++){
            if(st[i]=='['){
                cnt++;
            }
            if(st[i]==']'){
                cnt--;
                if(cnt==-1){
                    cnt+=2;
                    char temp=st[len];
                    st[len]=st[i];
                    st[i]=temp;
                    swap++;
                    len--;
                }
            }
        }
    return swap;
    }
}