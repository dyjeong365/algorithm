class Solution {
    public int solution(String A, String B) {
        if(A.equals(B)) return 0;
            
        for(int i=1; i<=A.length(); i++){
            if ((A.substring(A.length() - i) + A.substring(0, A.length() - i)).equals(B)){
                return i;
            }
        }
                
        return -1;
    }
}