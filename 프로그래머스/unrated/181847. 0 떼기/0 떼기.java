class Solution {
    public String solution(String n_str) {
        StringBuilder sb = new StringBuilder();
        
        if(n_str.charAt(0) != '0') return n_str;
        
        for(int i=1; i<n_str.length(); i++){
            if(n_str.charAt(i) != '0'){
                sb.append(n_str.substring(i));
                break;
            }
        }
        return sb.toString();
    }
}