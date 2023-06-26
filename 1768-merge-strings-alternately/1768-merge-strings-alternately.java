class Solution {
    public String mergeAlternately(String word1, String word2) {
        final int LENGTH1 = word1.length();
        final int LENGTH2 = word2.length();
        StringBuilder merge = new StringBuilder();
        
        for(int i=0; i<Math.max(LENGTH1, LENGTH2); i++){
            if(i < LENGTH1){
                merge.append(word1.charAt(i));
            }
            if(i < LENGTH2){
                merge.append(word2.charAt(i));
            }
        }
        
        return merge.toString();
    }
}