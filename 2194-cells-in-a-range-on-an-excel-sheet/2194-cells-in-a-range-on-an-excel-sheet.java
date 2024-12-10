class Solution {
    public List<String> cellsInRange(String s) {
        List<String> ans = new ArrayList<>();
        final char MAX_COL = s.charAt(3);
        final int MAX_ROW = Character.getNumericValue(s.charAt(4));
        String start = s.substring(0, 2);
        String end = s.substring(3);

        while (!start.equals(end)) {
            StringBuilder sb = new StringBuilder();
            char col = start.charAt(0);
            int row = Character.getNumericValue(start.charAt(1));

            ans.add(start);

            if (row < MAX_ROW) {
                row++;
            } else {
                col++;
                row = Character.getNumericValue(s.charAt(1));
            }

            sb.append(col)
                    .append(String.valueOf(row));

            start = sb.toString();
        }

        ans.add(end);

        return ans;
    }
}