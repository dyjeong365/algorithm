class Solution {
    public String decodeMessage(String key, String message) {
        StringBuilder sb = new StringBuilder();
        Map<Character, Character> map = new HashMap<>();
        char value = 'a';

        for (var pos : key.toCharArray()) {
            if (pos != ' ' && !map.containsKey(pos)) {
                map.put(pos, value++);
            }
        }

        for (var pos : message.toCharArray()) {
            sb.append(map.containsKey(pos) ? map.get(pos) : " ");
        }

        return sb.toString();
    }
}