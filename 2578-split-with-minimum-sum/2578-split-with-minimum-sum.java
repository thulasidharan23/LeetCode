class Solution {
    public int splitNum(int num) {
        List<Integer>lt=new ArrayList<>();
        int nums=num;
        while(nums>0){
            int rem=nums%10;
            lt.add(rem);
            nums/=10;
        }
        int even=0;
        int odd=0;
        Collections.sort(lt);
        for(int i=0;i<lt.size();i++){
            if(i%2==0){
                even=even*10+lt.get(i);
            }
            else{
                odd=odd*10+lt.get(i);
            }
        }
        return ans=odd+even;
        //return ans;
    }
}