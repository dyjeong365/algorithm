class Solution {
    public boolean areOccurrencesEqual(String s) {
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        int pos = 0;

        for (var value : map.values()) {
            pos = value;
            break;
        }

        for (var value : map.values()) {
            if(pos != value){
                return false;
            }

            pos = value;
        }

        return true;
    }
}