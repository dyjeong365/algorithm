class Solution {
    public int solution(String s) {
        String[] numStr = 
            {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        for(int i=0; i<numStr.length; i++){
            if(s.contains(numStr[i])){
                s = s.replace(numStr[i], String.valueOf(i));
            }
        }
        return Integer.parseInt(s);
    }
}