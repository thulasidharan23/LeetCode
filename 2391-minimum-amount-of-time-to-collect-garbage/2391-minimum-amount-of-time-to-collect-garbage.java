class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        int len=0;
        for(String str:garbage){
            len+=str.length();
        }
        for(int i=1;i<travel.length;i++){
            travel[i]+=travel[i-1];
        }
        int m=-1,p=-1,g=-1;
        for(int i=garbage.length-1;i>=0;i--){
            if(m==-1 && garbage[i].contains("M")){
                m=i-1;
            }
            if(p==-1 && garbage[i].contains("P")){
                p=i-1;
            }
            if(g==-1 && garbage[i].contains("G")){
                g=i-1;
            }
        }
        if(m==-1){
            m=0;
        }
        else{
            m=travel[m];
        }

        if(p==-1){
            p=0;
        }
        else{
            p=travel[p];
        }

        if(g==-1){
            g=0;
        }
        else{
            g=travel[g];
        }

        return len+m+p+g;
    }
}