class Solution {
    public int dayOfYear(String date) {
        int year = Integer.parseInt(date.substring(0, 4));
        int month = Integer.parseInt(date.substring(5, 7));
        int day = Integer.parseInt(date.substring(8));
        int feb = isLeapYears(year) ? 29 : 28;
        int ans = 0;
        int[] days = { 0, 31, feb, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        for (int i = 1; i < days.length; i++) {
            days[i] += days[i - 1];
        }

        ans += (day + days[month == 1 ? 0 : month - 1]);

        return ans;
    }

    private boolean isLeapYears(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }
}