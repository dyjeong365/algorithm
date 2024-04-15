class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        Queue<Integer> xList = new LinkedList<>();
        Queue<Integer> yList = new LinkedList<>();

        for (int x = 0; x < m; x++) {
            for (int y = 0; y < n; y++) {
                if (matrix[x][y] == 0) {
                    xList.offer(x);
                    yList.offer(y);
                }
            }
        }

        while (!xList.isEmpty()) {
            matrix[xList.poll()] = new int[n];
        }

        while (!yList.isEmpty()) {
            int y = yList.poll();

            for (int x = 0; x < m; x++) {
                matrix[x][y] = 0;
            }
        }
    }
}