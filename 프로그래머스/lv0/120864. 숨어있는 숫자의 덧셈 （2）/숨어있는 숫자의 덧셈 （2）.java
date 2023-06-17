class Solution {
    public int solution(String my_string) {
        int answer = 0;
        my_string = my_string.replaceAll("[a-zA-Z]", " ");
        
        for(var el : my_string.split(" ")){
            if(!el.isEmpty()){
                answer += Integer.parseInt(el);
            }
        }
        return answer;
    }
}