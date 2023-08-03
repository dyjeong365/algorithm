class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int count = brown + yellow;
        
        for(int i=(int)Math.sqrt(count); i>1; i--){
            if(count % i == 0){
                int share = count / i;
                
                if((share-2) * (i-2) == yellow){
                    answer[0] = share;
                    answer[1] = i;
                    break;    
                }
            }
        }
        
        return answer;
    }
}