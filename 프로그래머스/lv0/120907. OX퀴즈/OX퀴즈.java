class Solution {
    public String[] solution(String[] quiz) {
        final int LENGTH = quiz.length;
        String[] answer = new String[LENGTH];
        
        for(int i=0; i<LENGTH; i++){
            String[] each = quiz[i].split(" ");
            int first = Integer.parseInt(each[0]);
            String op = each[1];
            int last = Integer.parseInt(each[2]);
            int expected = Integer.parseInt(each[4]);
            
            answer[i] = first + ((op.equals("+") ? 1 : -1) * last) == expected ? "O" : "X";
        }
        
        return answer;
    }
}