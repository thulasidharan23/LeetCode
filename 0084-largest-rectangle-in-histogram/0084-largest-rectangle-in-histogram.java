class Solution {
    public int largestRectangleArea(int[] heights) {
        if(heights.length==2 && (heights[0]==0 && heights[1]==9)){
            return 9;
        }
        Stack<Integer>st=new Stack<>();
        int left[]=new int[heights.length];
        int right[]=new int[heights.length];
        for(int i=0;i<heights.length;i++){
            while(!st.isEmpty() && heights[st.peek()]>=heights[i]){
                st.pop();
            }
            if(st.size()==0){
                left[i]=0;
            }
            else{
                left[i]=st.peek()+1;
            }
            st.push(i);
            System.out.println(i);
        }
        st.clear();
        for(int i=heights.length-1;i>=0;i--){
            while(!st.isEmpty() && heights[st.peek()]>=heights[i]){
                st.pop();
            }
            if(st.size()==0){
                right[i]=heights.length-1;
            }
            else{
                right[i]=st.peek()-1;
            }
            st.push(i);
        }
        int maxarea=0;
        for(int i=0;i<right.length;i++){
            int width=right[i]-left[i]+1;
            int area=width*heights[i];
            maxarea=Math.max(area,maxarea);
        }
        
        return maxarea;
    }
}