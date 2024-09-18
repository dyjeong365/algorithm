class Solution {
    public String finalString(String s) {
        StringBuilder sb = new StringBuilder();
        
        for(var pos : s.toCharArray()){
            if(pos == 'i'){
                sb.reverse();
            }

            else{
                sb.append(pos);
            }
        }

        return sb.toString();
    }
}