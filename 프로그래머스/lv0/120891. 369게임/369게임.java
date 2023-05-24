class Solution {
    public int solution(int order) {
        int answer = 0;  
        char[] splitedOrder = String.valueOf(order).toCharArray();
        
        for(var el: splitedOrder){
            if(el != '0' && Integer.parseInt(String.valueOf(el)) % 3 == 0){
                answer++;
            }
        }
        return answer;
    }
}