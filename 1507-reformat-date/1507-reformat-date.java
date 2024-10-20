class Solution {
    public String reformatDate(String date) {
        final int LEN = date.length();
        StringBuilder sb = new StringBuilder();
        Map<String, Integer> map = new HashMap<>();
        String[] months = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov",
                "Dec" };
        int i = 1;

        for (var month : months) {
            map.put(month, i++);
        }

        String year = date.substring(LEN == 13 ? 9 : 8);
        int month = map.get(date.substring(LEN == 13 ? 5 : 4, LEN == 13 ? 8 : 7));
        String day = date.substring(0, LEN == 13 ? 2 : 1);

        sb.append(year)
                .append("-")
                .append(month < 10 ? "0" : "")
                .append(month)
                .append("-")
                .append(LEN == 13 ? "" : "0")
                .append(day);

        return sb.toString();
    }
}