class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        
        for(int i=0; i<keyinput.length; i++){
            
            switch(keyinput[i]){
                case "left":
                    if(Math.abs(answer[0]-1) > board[0]/2) break;
                    else answer[0] -= 1;
                    break;
                case "right":
                    if(answer[0]+1 > board[0]/2) break;
                    else answer[0] += 1;
                    break;
                case "up":
                    if(answer[1]+1 > board[1]/2) break;
                    else answer[1] += 1;
                    break;
                case "down":
                    if(Math.abs(answer[1]-1) > board[1]/2) break;
                    else answer[1] -= 1;
                    break;
            }
        }
        return answer;
    }
}