class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int pos1 = 0, pos2 = 0;
        
        for(var el : goal){
            if(pos1 < cards1.length && cards1[pos1].equals(el)){
                pos1++;
            }
            
            else if(pos2 < cards2.length && cards2[pos2].equals(el)){
                pos2++;
            }
            
            else{
                return "No";
            }
        }
        
        return "Yes";
    }
}