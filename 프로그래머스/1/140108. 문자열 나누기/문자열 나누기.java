class Solution {
    public int solution(String s) {
        int answer = 0;
        
        while(s.length() != 0) {
            answer++;
            
            char x = s.charAt(0);
            int xCount = 1;
            int oCount = 0;
            
            for(int i=1; i<s.length(); i++) {
                char target = s.charAt(i);
                
                if(target == x) {
                    xCount++;
                } else {
                    oCount++;
                }
                
                if(xCount == oCount) {
                    break;
                }
            }
            
            s = s.substring(xCount + oCount);
        }
        
        return answer;
    }
}