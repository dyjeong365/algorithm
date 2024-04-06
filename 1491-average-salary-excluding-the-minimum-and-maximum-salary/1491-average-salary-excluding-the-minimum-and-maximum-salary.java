class Solution {
    public double average(int[] salary) {
        double avg = 0.0;
        int cnt = 0;

        Arrays.sort(salary);

        for (int i = 1; i < salary.length - 1; i++) {
            avg += salary[i];
            cnt++;
        }

        return avg / cnt;
    }
}