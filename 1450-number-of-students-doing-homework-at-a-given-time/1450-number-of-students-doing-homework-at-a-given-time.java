class Solution {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int count=0;
        for(int i=0;i<startTime.length;i++){
            int time=endTime[i]-startTime[i];
            if(endTime[i]>=queryTime){
                count++;
            }
        }
        return count;
    }
}