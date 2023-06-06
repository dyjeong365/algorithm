class Solution {
    public String solution(String s) {
        String answer = "";
        int order = 0;
        String[] splitedS = s.toUpperCase().split("");
        
        for(int i=0; i<splitedS.length; i++){
            String each = splitedS[i];
            
            if(order%2 != 0){
                answer += each.toLowerCase();
            }
            else if(each.equals(" ")){
                answer += each;
                order = 0;
                continue;
            }
            else{
                answer += each;
            }
            order++;
        }
        return answer;
    }
}