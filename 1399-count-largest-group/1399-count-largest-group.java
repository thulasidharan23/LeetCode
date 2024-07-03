class Solution {
    public int sum(int n){
        int num=n;
        int sumdig=0;
        while(num!=0){
            int rem=num%10;
            sumdig+=rem;
            num/=10;
        }
        return sumdig;
    }
    public int countLargestGroup(int n) {
        int ans[]=new int[37];
        for(int i=1;i<=n;i++){
            if(i>9){
                int value=sum(i);
                ans[value]++;
            }
            else{
                ans[i]++;
            }
        }
        int max=Arrays.stream(ans).max().getAsInt();
        int count=0;
        for(int i=0;i<ans.length;i++){
            if(ans[i]==max){
                count++;
            }
        }
        return count;
    }
}