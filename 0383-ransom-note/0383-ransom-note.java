class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> map = new HashMap<>();
        
        for(var el : magazine.toCharArray()) {
            map.put(el, map.getOrDefault(el, 0) + 1);
        }
        
        for(var el : ransomNote.toCharArray()) {
            if(!map.containsKey(el)) return false;
            
            if(map.containsKey(el)) {
                map.put(el, map.get(el) - 1);
                
                if(map.get(el) < 0) return false;
            }
        }
        
        return true;
    }
}