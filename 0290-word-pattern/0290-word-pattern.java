class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] splitedS = s.split(" ");
        Map<Character, String> map = new HashMap<>();

        if (pattern.length() != splitedS.length) {
            return false;
        }

        for (int i = 0; i < pattern.length(); i++) {
            Character key = pattern.charAt(i);
            String value = splitedS[i];

            if (!map.containsKey(key)) {
                if (map.containsValue(value)) {
                    return false;
                }

                map.put(key, value);
            }

            else if (!map.get(key).equals(value)) {
                return false;
            }
        }

        return true;
    }
}