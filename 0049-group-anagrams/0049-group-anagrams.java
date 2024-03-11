class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (var str : strs) {
            char[] splitedStr = str.toCharArray();
            Arrays.sort(splitedStr);

            String sortedStr = new String(splitedStr);
            map.putIfAbsent(sortedStr, new ArrayList<>());
            map.get(sortedStr).add(str);
        }

        return new ArrayList<>(map.values());
    }
}