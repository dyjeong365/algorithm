class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] splitedStr = my_string.split(" ");
        
        for(int i=0; i<splitedStr.length; i++){
            if(splitedStr[i].equals("-")) splitedStr[i+1] = "-" + splitedStr[i+1];
            else if(splitedStr[i].equals("+")) continue;
            else answer += Integer.parseInt(splitedStr[i]);
        }
        return answer;
    }
}