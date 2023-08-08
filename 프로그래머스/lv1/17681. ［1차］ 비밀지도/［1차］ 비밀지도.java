class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[arr1.length];
        
        for(int i=0; i<arr1.length; i++){
            String or = Integer.toBinaryString(arr1[i] | arr2[i]);
            
            while(or.length() < n){
                String blank = " ";
                
                or = blank + or;
            }
            
            answer[i] = or.replace("1", "#").replace("0", " ");
        }
        
        return answer;
    }
}