class Solution {
    public int maxVowels(String s, int k) {
        var vowels = Set.of('a', 'e', 'i', 'o', 'u');
        int ans = 0;
        int count = 0;
        
        for(int i=0; i<s.length(); i++) {
            if(vowels.contains(s.charAt(i))) {
                count++;
            }
            
            if(i >= k && vowels.contains(s.charAt(i - k))) {
                count--;
            }
            
            ans = Integer.max(ans, count);
            
            if(ans == k) {
                return ans;
            }
        }
        
        return ans;
    }
}