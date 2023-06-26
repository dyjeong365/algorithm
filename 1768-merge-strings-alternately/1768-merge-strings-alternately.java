class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder merge = new StringBuilder();
        final int MIN = Math.min(word1.length(), word2.length());
        
        for(int i=0; i<MIN; i++){
            merge.append(word1.charAt(i))
                .append(word2.charAt(i));
        }
        
        merge.append(word1.length() > word2.length() ? word1.substring(MIN) : word2.substring(MIN));  
        return merge.toString();
    }
}