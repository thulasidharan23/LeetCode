class Solution {
    public boolean uniqueOccurrences(int[] arr) {

        HashMap<Integer,Integer>s=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(s.containsKey(arr[i])){
                s.put(arr[i],s.get(arr[i])+1);
            }
            else{
                s.put(arr[i],1);
            }
        }
            Set<Integer>a=new HashSet<>(s.values());
            
        return a.size()==s.size();
    }
}