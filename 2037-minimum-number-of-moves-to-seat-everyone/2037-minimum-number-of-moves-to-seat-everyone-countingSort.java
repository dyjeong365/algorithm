class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        int max = Math.max(findMax(seats), findMax(students));
        int[] diffs = new int[max + 1];

        for (var pos : seats) {
            diffs[pos]++;
        }

        for (var pos : students) {
            diffs[pos]--;
        }

        int moves = 0;
        int unmatched = 0;

        for (var diff : diffs) {
            moves += Math.abs(unmatched);
            unmatched += diff;
        }

        return moves;
    }

    private static int findMax(int[] arr) {
        int max = 0;

        for (var pos : arr) {
            if (max < pos) {
                max = pos;
            }
        }

        return max;
    }
}