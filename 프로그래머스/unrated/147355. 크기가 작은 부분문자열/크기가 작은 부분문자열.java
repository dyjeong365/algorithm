class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        
        for(int i=0; i<t.length(); i++){
            if(i+p.length() > t.length()) break;
            
            long part = Long.parseLong(t.substring(i, i+p.length()));
            
            if(part <= Long.parseLong(p)) answer++;
        }
        return answer;
    }
}