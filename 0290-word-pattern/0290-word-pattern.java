class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] splitedS = s.split(" ");
        Map<String, String> map = new HashMap<>();

        if (pattern.length() != splitedS.length) {
            return false;
        }

        for (int i = 0; i < pattern.length(); i++) {
            String key = "" + pattern.charAt(i);
            String value = splitedS[i];

            if (map.containsKey(key)) {
                if (!map.get(key).equals(value)) {
                    return false;
                }
            }

            else if (map.containsValue(value)) {
                if (!map.containsKey(key)) {
                    return false;
                }

                else if (!map.get(key).equals(value)) {
                    return false;
                }
            }

            else
                map.put(key, value);
        }

        return true;
    }
}