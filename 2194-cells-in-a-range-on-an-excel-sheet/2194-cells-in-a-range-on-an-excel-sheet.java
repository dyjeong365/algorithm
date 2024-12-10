class Solution {
    public List<String> cellsInRange(String s) {
        List<String> ans = new ArrayList<>();
        // StringBuilder sb = new StringBuilder();
        final char MAX_COL = s.charAt(3);
        final int MAX_ROW = Character.getNumericValue(s.charAt(4));
        String start = s.substring(0, 2);
        String end = s.substring(3);
        // System.out.println("start: " + start);
        // System.out.println("end: " + end);

        while (!start.equals(end)) {
            char col = start.charAt(0);
            int row = Character.getNumericValue(start.charAt(1));
            // System.out.println("col: " + col);
            // System.out.println("row: " + row);

            ans.add(start);

            if (row < MAX_ROW) {
                row++;
            } else {
                col++;
                row = Character.getNumericValue(s.charAt(1));
            }

            start = col + String.valueOf(row);
            // System.out.println("start: " + start);
        }

        ans.add(end);

        return ans;
    }
}