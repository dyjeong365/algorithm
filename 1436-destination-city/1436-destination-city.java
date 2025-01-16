class Solution {
    public String destCity(List<List<String>> paths) {
        Map<String, String> map = new HashMap<>();
        StringBuilder sb = new StringBuilder(paths.get(0).get(0));

        for (var path : paths) {
            String starting = path.get(0);
            String destination = path.get(1);

            map.put(starting, destination);
        }

        while (map.containsKey(sb.toString())) {
            sb = new StringBuilder(map.get(sb.toString()));
        }

        return sb.toString();
    }
}