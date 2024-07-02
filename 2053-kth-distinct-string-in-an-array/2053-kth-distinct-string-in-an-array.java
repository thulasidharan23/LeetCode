class Solution {
    public String kthDistinct(String[] arr, int k) {
        HashMap<String,Integer> hs=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(hs.containsKey(arr[i])){
                hs.put(arr[i],hs.get(arr[i])+1);
            }
            else{
                hs.put(arr[i],1);
            }
        }
        List<String>lt=new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            if(hs.get(arr[i])==1){
                lt.add(arr[i]);
            }
        }       
        System.out.println(lt);
        if(k>lt.size()){
            return "";
        }
        
            return lt.get(k-1).toString();

    }
}