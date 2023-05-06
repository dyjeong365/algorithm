class Solution {
    public String solution(String code) {
        String answer = "";
        int mode = 0;
        
        for(int i=0; i<code.length(); i++){
            char each = code.charAt(i);
            
            switch(mode){
                case 0:
                    if(each == '1'){
                        mode = 1;
                    }
                    else if(i % 2 == 0){
                        answer += each;
                    }
                    break;
                case 1:
                    if(each == '1'){
                        mode = 0;
                    }
                    else if(i % 2 != 0){
                        answer += each;
                    }
                    break;
            }
        }
        return answer.length() == 0 ? "EMPTY" : answer;
    }
}