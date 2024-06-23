class Solution {
    public String kthDistinct(String[] arr, int k) {
        Map<String, Integer> map = new LinkedHashMap<>();

        for (var el : arr) {
            map.put(el, map.getOrDefault(el, 0) + 1);
        }

        for (var entry : map.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();

            if (value == 1) {
                k--;

                if (k == 0) {
                    return key;
                }
            }
        }

        return "";
    }
}