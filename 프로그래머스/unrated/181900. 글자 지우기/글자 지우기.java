class Solution {
    public String solution(String my_string, int[] indices) {
        String[] splitedStr = my_string.split("");
        String answer = "";
        
        for(int i=0; i<indices.length; i++){
            splitedStr[indices[i]] = "";
        }
        
        for(var string : splitedStr){
            answer += string;
        }
        return answer;
    }
}