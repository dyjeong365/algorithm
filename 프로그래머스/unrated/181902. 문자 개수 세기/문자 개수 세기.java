class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        
        for(int i=0; i<my_string.length(); i++){
            char each = my_string.charAt(i);
            int index = Character.isUpperCase(each) ? each - 'A' : each - 'A' - 6;
            
            answer[index] += 1;
        }
        return answer;
    }
}