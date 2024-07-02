class Solution {
    public int countAsterisks(String s) {
        String str[]=s.split("\\|", -1);
        int sum=0;
        for(int i=0;i<str.length;i++){
            System.out.print(str[i]);
            int count=0;
            if(i%2==0){
                for(int j=0;j<str[i].length();j++){
                    if(str[i].charAt(j)=='*'){
                        count++;
                    }
                }
            }
            sum+=count;
        }
        return sum;
    }
}