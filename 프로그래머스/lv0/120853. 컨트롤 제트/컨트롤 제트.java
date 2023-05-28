class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] splitedS = s.split(" ");
        
        for(int i=0; i<splitedS.length; i++){
            answer += splitedS[i].equals("Z") 
                ? -Integer.parseInt(splitedS[i-1])
                : Integer.parseInt(splitedS[i]);
        }
        return answer;
    }
}