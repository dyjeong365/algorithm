class Solution {
    public String solution(String letter) {
        String[] morse = {
            ".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..",
            "--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."
            };
        StringBuilder answer = new StringBuilder();
        
        for(var el : letter.split(" ")){
            for(int i=0; i<morse.length; i++){
                if(el.equals(morse[i])){
                    answer.append(String.valueOf((char)(97+i)));
                    break;
                }
            }
        }

        return answer.toString();
    }
}