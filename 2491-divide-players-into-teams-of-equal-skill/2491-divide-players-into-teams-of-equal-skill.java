class Solution {
    public long dividePlayers(int[] s) {
        if(s.length==2){
            return s[0]*s[1];
        }
        int len=s.length;
        Arrays.sort(s);
        int i=0;
        int j=len-1;
        HashMap<Integer,Integer>hm=new HashMap<>();
        while(i<j){
            int val=s[i]+s[j];
            hm.put(val,hm.getOrDefault(val,0)+1);
            i++;
            j--;
        }
        for(Map.Entry<Integer,Integer>map:hm.entrySet()){
            if(map.getValue()>=len/2){
                return product(s);
            }
        }
        return -1;
    }
    static long product(int s[]){
        long pro=0;
        int i=0;
        int j=s.length-1;
        while(i<j){
            pro+=(s[i]*s[j]);
            i++;
            j--;
        }
        return pro;
    }
}