class Solution {
    public int minCost(String colors, int[] time) {
        int sum=0;
        List<Character>ch=new ArrayList<>();
        for(int i=0;i<colors.length();i++){
            ch.add(colors.charAt(i));
        }
        List<Integer>t=new ArrayList<>();
        for(int i=0;i<time.length;i++){
            t.add(time[i]);
        }
        for(int i=0;i<ch.size()-1;i++){
            if(ch.get(i)==ch.get(i+1)){
                int tim=t.get(i)>t.get(i+1)?i+1:i;
                sum+=t.get(tim);
                t.remove(tim);
                ch.remove(tim);
                i--;
            }
        }
        return sum;
    }
}