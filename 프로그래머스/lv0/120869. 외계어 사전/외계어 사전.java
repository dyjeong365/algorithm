class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 0;
        
        for(int i=0; i<dic.length; i++){
            if(answer == 1) return answer;
            
            for(int j=0; j<spell.length; j++){
                if(!dic[i].contains(spell[j])){
                    answer = 2;
                    break;
                }
                else answer = 1;
            }
        }
        return answer;
    }
}