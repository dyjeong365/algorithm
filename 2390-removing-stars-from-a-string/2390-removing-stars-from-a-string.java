class Solution {
    public String removeStars(String s) {
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<s.length(); i++) {
            char each = s.charAt(i);
            
            if(each == '*') {
                sb.deleteCharAt(sb.length() - 1);
            } else {
                sb.append(each);
            }
        }
        
        return sb.toString();
    }
}