class Solution {
    public List<String> cellsInRange(String s) {
        List<String> cells = new ArrayList<>();
        char c1 = s.charAt(0);
        char r1 = s.charAt(1);
        char c2 = s.charAt(3);
        char r2 = s.charAt(4);

        for (char c = c1; c <= c2; c++) {
            for (char r = r1; r <= r2; r++) {
                StringBuilder sb = new StringBuilder();

                sb.append(c)
                        .append(r);

                cells.add(sb.toString());
            }
        }

        return cells;
    }
}