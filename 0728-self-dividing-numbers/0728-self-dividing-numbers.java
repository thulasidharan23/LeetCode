class Solution {
    public void isdivide(int i,List<Integer>lt){
        int num=i;
        while(num>0){
            int rem=num%10;
            if(rem==0){
                return;
            }
            if(i%rem!=0){
                return;
            }
            num/=10;
        }
        lt.add(i);
    }
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer>lt=new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(i<9){
                lt.add(i);
            }
            else if(i%10!=0){
                isdivide(i,lt);
            }
        }
        return lt;
    }
}