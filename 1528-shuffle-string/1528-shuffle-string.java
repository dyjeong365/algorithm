class Solution {
    public String restoreString(String s, int[] indices) {
        Map<Integer, Character> map = new TreeMap<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < indices.length; i++) {
            map.put(indices[i], s.charAt(i));
        }

        for (var value : map.values()) {
            sb.append(value);
        }

        return sb.toString();
    }
}