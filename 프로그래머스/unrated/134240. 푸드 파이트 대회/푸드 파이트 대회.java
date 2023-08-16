class Solution {
    public String solution(int[] food) {
        StringBuilder answer = new StringBuilder();
        
        for(int i=1; i<food.length; i++){
            if(food[i] > 1){
                answer.append(String.valueOf(i).repeat(food[i] / 2));
            }
        }
        
        StringBuilder reverse = new StringBuilder(answer);

        answer.append("0")
            .append(reverse.reverse());
        
        return answer.toString();
    }
}