class Solution {
    public char findTheDifference(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();

        for(var el : s.toCharArray()) {
            map.put(el, map.getOrDefault(el, 0) + 1);
        }

        for(var el : t.toCharArray()) {
            if(map.containsKey(el)) {
                map.put(el, map.get(el) - 1);
            } else {
                return el;
            }
        }

        for(var entrySet : map.entrySet()) {
            if(entrySet.getValue() == -1) {
                return entrySet.getKey();
            }
        }

        return ' ';
    }
}