class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }
            else{
                map.put(s.charAt(i),1);
            }
        }
        /*List<Integer>arr=new ArrayList<>();
        for(Map.Entry<Character,Integer>hm:map.entrySet()){
            arr.add(hm.getValue());
        }
        for(int i=1;i<arr.size();i++){
            if(arr.get(i)!=arr.get(i-1)){
                return false;
            }
        }*/
        Set<Integer>a=new HashSet<>(map.values());
        if(a.size()==1)
        return true;
        return false;
    }
}