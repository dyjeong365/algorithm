class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String[] splitedBinomial = binomial.split(" ");
        
        switch(splitedBinomial[1]){
            case "+":
                answer = Integer.parseInt(splitedBinomial[0]) + Integer.parseInt(splitedBinomial[2]);
                break;
            case "-":
                answer = Integer.parseInt(splitedBinomial[0]) - Integer.parseInt(splitedBinomial[2]);
                break;
            case "*":
                answer = Integer.parseInt(splitedBinomial[0]) * Integer.parseInt(splitedBinomial[2]);
                break;
        }
        return answer;
    }
}