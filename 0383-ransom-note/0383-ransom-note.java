class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] alphabet = new int[26];
        
        for(var el : magazine.toCharArray()) {
            alphabet[el - 'a']++;
        }
        
        for(var el : ransomNote.toCharArray()) {
            if(alphabet[el - 'a'] == 0) return false;
            
            alphabet[el - 'a']--;
        }
        
        return true;
    }
}