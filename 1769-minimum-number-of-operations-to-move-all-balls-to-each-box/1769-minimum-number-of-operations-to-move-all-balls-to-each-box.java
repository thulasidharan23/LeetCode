class Solution {
    public int[] minOperations(String boxes) {
     int arr[]=new int[boxes.length()];
     for(int i=0;i<boxes.length();i++){
        int sum=0;
        A:
        for(int j=0;j<boxes.length();j++){
            if(j==i)
            continue A;
            if(boxes.charAt(j)=='1'){
                sum+=Math.abs(i-j);
               // System.out.print(sum+" ");
            }
        }
        System.out.println();
        arr[i]=sum;
     }  
     return arr; 
    }
}