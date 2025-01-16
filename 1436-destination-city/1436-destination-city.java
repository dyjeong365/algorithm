class Solution {
    public String destCity(List<List<String>> paths) {
        final int LEN = paths.size();
        Set<String> set = new HashSet<>();

        for (var path : paths) {
            set.add(path.get(0));
        }

        for (var path : paths) {
            String candidate = path.get(1);

            if (!set.contains(candidate)) {
                return candidate;
            }
        }

        return "";
    }
}