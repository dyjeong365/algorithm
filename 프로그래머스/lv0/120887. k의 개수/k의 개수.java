class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        
        for(int l=i; l<=j; l++){
            char[] numbers = String.valueOf(l).toCharArray();
            for(var number: numbers){
                if(number == (k + '0')) answer += 1;
            }
        }
        return answer;
    }
}