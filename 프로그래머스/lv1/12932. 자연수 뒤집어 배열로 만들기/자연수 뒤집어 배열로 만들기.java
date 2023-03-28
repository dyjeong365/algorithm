class Solution {
    public int[] solution(long n) {
        String naturalNumber = Long.toString(n);
        int[] answer = new int[naturalNumber.length()];
        
        for(int i=0; i<answer.length; i++){
            answer[i] = Character.getNumericValue(naturalNumber.charAt(answer.length - (i + 1)));
        }
        return answer;
    }
}