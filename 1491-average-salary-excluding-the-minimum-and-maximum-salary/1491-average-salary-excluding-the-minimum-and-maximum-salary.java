class Solution {
    public double average(int[] salary) {
        double avg = 0.0;
        double cnt = salary.length - 2;

        Arrays.sort(salary);

        for (int i = 1; i < salary.length - 1; i++) {
            avg += salary[i];
        }

        return avg / cnt;
    }
}