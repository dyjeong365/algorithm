class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        for(int i = 0; i < my_string.length(); i++){
            String ALPHABET = Character.toString(my_string.charAt(i));
            
            if(my_string.charAt(i) < 97) answer = answer + ALPHABET.toLowerCase();
            else answer = answer + ALPHABET.toUpperCase();
        }
        return answer;
    }
}