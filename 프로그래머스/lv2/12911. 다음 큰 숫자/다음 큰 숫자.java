class Solution {
    public int solution(int n) {        
        int answer = n;
        int numberOfOneInN = countNumberOfOne(n);
        
        while(true){
            answer++;
            
            if(numberOfOneInN == countNumberOfOne(answer)) return answer;
        }
    }
    
    public static int countNumberOfOne(int number){
        return Integer.toBinaryString(number).replace("0", "").length();
    }
}