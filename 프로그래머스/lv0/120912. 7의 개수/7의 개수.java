class Solution {
    public int solution(int[] array) {
        int count = 0;
        
        for(var el : array){
            String number = String.valueOf(el);
            
            for(int i=0; i<number.length(); i++){
                if(number.charAt(i) == '7') count++;
            }
        }
        return count;
    }
}