class Solution {
    public String solution(String my_string, int[][] queries) {
        String copyOfStr = my_string;
        
        for(int i=0; i<queries.length; i++){
            StringBuilder result = new StringBuilder();
            StringBuilder reverseStr = new StringBuilder();
            int s = queries[i][0];
            int e = queries[i][1];
            
            result.append(copyOfStr.substring(0, s));
            
            for(int j=s; j<=e; j++){
                reverseStr.append(copyOfStr.charAt(j));
            }
            
            result.append(reverseStr.reverse().toString());
            result.append(copyOfStr.substring(e+1));
            copyOfStr = result.toString();
        }
        return copyOfStr;
    }
}