class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int sum=numBottles;
        while(numBottles>=numExchange){
            int exchange=numBottles/numExchange;/* No of bottles required to exchange for 1 bottle*/
            int balance=numBottles%numExchange;//Balance in org bottles
            sum+=exchange;
            numBottles=exchange+balance;
        }
        return sum;
    }
}