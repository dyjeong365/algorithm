class Solution {
    public long solution(int price, int money, int count) {
        long cost = 0L;
        
        while(count > 0){
            cost += price * count;
            count --;
        }
        return money > cost ? 0 : Math.abs(money - cost);
    }
}