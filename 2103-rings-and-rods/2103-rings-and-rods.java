class Solution {
    public int countPoints(String rings) {
        int ans = 0;
        String[] rods = new String[10];
        Arrays.fill(rods, "");

        for (int i = 1; i < rings.length(); i += 2) {
            char color = rings.charAt(i - 1);
            int idx = Character.getNumericValue(rings.charAt(i));
            StringBuilder sb = new StringBuilder();

            sb.append(rods[idx])
                    .append(color);

            rods[idx] = sb.toString();
        }

        for (var rod : rods) {
            if (rod.contains("R") && rod.contains("G") && rod.contains("B")) {
                ans++;
            }
        }

        return ans;
    }
}