class Solution {
    public int secondHighest(String s) {
        HashSet<Integer>hs=new HashSet<>();
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i)))
                hs.add(Character.getNumericValue(s.charAt(i)));
            System.out.println(hs);
        }
        List<Integer>lt=new ArrayList<>(hs);
        //Collections.sort(lt);
        System.out.println("lt"+lt);
        if(lt.size()==1||lt.size()==0){
            return -1;
        }
        return lt.get(lt.size()-2);
    }
}