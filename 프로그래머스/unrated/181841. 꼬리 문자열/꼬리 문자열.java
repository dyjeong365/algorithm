class Solution {
    public String solution(String[] str_list, String ex) {
        String answer = "";
        
        for(var str : str_list){
            if(str.contains(ex)) continue;
            else answer += str;
        }
        return answer;
    }
}