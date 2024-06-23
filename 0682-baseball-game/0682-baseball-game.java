class Solution {
    public int calPoints(String[] operations) {
        Deque<Integer>st=new ArrayDeque<>();
        for(int i=0;i<operations.length;i++){
            if("+".equals(operations[i])){
                int a = st.pop();
                int b = st.peek();
                st.push(a);
                st.push(a + b);
            }
            else if("D".equals(operations[i])){
                int temp=st.peek();
                st.push(st.peek()<<1);
            }
            else if("C".equals(operations[i])){
                st.pop();
            }
            else{
                st.push(Integer.valueOf(operations[i]));
            }
            System.out.println(st);
        }
        return st.stream().mapToInt(Integer::intValue).sum();
    }
}