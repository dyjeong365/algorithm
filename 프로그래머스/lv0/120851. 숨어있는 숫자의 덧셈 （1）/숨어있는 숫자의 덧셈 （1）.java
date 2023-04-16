class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        my_string = my_string.replaceAll("[^0-9]","");
        char[] temp = my_string.toCharArray();
        
        for(var number : temp){
            answer = answer + Character.getNumericValue(number);
        }
        return answer;
    }
}