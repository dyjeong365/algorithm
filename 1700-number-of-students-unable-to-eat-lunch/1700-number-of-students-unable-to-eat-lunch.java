class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int[] counts = new int[2];
        int res = 0;

        for (var student : students) {
            counts[student]++;
        }

        for (var sandwich : sandwiches) {
            if (counts[sandwich] == 0) {
                return students.length - res;
            }

            else {
                res++;
                counts[sandwich]--;
            }
        }

        return students.length - res;
    }
}